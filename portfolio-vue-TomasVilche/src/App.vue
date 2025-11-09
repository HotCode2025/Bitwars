
<template>
  <div id="app" :data-theme="theme">
    <div class="nebula" aria-hidden="true"></div>
    <Header :theme="theme" @toggle-theme="toggleTheme" />
    <main>
      <transition name="route" mode="out-in">
        <router-view />
      </transition>
    </main>
    <footer class="site-footer">© Tomás Vilche</footer>
  </div>
</template>

<script setup>
import { ref, onMounted, watch } from 'vue'
import Header from './components/Header.vue'

const theme = ref('dark')

onMounted(()=>{
  const saved = localStorage.getItem('pv-theme')
  if(saved) theme.value = saved
  document.documentElement.setAttribute('data-theme', theme.value)
})

watch(theme, (v)=>{
  localStorage.setItem('pv-theme', v)
  document.documentElement.setAttribute('data-theme', v)
})

function toggleTheme(){
  theme.value = (theme.value === 'dark') ? 'light' : 'dark'
}
</script>

<style>
.site-footer{position:fixed;right:1rem;bottom:1rem;color:rgba(255,255,255,0.6);font-size:1.2rem;z-index:60}
.route-enter-active, .route-leave-active{transition:opacity .6s ease, transform .6s ease}
.route-enter-from{opacity:0; transform: translateX(20px) scale(.98)}
.route-enter-to{opacity:1; transform: translateX(0) scale(1)}
.route-leave-from{opacity:1}
.route-leave-to{opacity:0; transform: translateX(-20px) scale(.98)}
</style>
