<template>
  <div :class="['app', theme]" @click="onClick($event)">
    <Navbar :theme="theme" @toggle-theme="toggleTheme" />
    <ParticleBackground />
    <main class="view">
      <router-view v-slot="{ Component }">
        <transition name="fade" mode="out-in">
          <component :is="Component" />
        </transition>
      </router-view>
    </main>
    <footer class="footer"> BitWars - UTN San Rafael</footer>
  </div>
</template>

<script>
import { ref, onMounted } from 'vue'
import Navbar from './components/Navbar.vue'
import ParticleBackground from './components/ParticleBackground.vue'

export default {
  components:{ Navbar, ParticleBackground },
  setup(){
    const theme = ref('dark')
    onMounted(()=>{ const s = localStorage.getItem('bw-theme'); if(s) theme.value=s })
    function toggleTheme(){ theme.value = theme.value==='dark' ? 'light' : 'dark'; localStorage.setItem('bw-theme', theme.value) }
    function onClick(e){ const ev = new CustomEvent('pixel-explode', { detail:{ x:e.clientX, y:e.clientY } }); window.dispatchEvent(ev) }
    return { theme, toggleTheme, onClick }
  }
}
</script>

<style>
:root{ --bg-dark:#071022; --bg-light:#f2f6fb; --text-dark:#e7f2ff; --text-light:#0b1220 }
*{box-sizing:border-box}
.app{ min-height:100vh; display:flex; flex-direction:column; font-family: 'Press Start 2P', monospace; overflow:hidden }
.app.dark{ background:var(--bg-dark); color:var(--text-dark) }
.app.light{ background:var(--bg-light); color:var(--text-light) }
.view{ position:relative; z-index:3; flex:1; padding:30px; max-width:1100px; margin:0 auto }
.footer{ text-align:center; padding:12px 0; opacity:0.85; z-index:3 }
.fade-enter-active, .fade-leave-active{ transition: opacity .28s ease }
.fade-enter-from{ opacity:0 }
.fade-enter-to{ opacity:1 }
.fade-leave-from{ opacity:1 }
.fade-leave-to{ opacity:0 }
</style>
