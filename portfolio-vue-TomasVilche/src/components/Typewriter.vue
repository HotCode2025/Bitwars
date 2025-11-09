
<template>
  <div class="typewriter"><span ref="txt"></span><span class="cursor"></span></div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
const txt = ref(null)
const phrases = ['Desarrollador','Programador','Creador de Contenido','Ensamblador de PC']

onMounted(()=>{
  let idx=0, char=0, deleting=false
  function tick(){
    const el = txt.value
    const full = phrases[idx]
    if(!deleting){
      el.textContent = full.slice(0, char+1)
      char++
      if(char === full.length){ setTimeout(()=> deleting = true, 1000) }
    } else {
      el.textContent = full.slice(0, char-1)
      char--
      if(char===0){ deleting=false; idx=(idx+1)%phrases.length }
    }
    const delay = deleting ? 40 : 70
    setTimeout(tick, delay)
  }
  tick()
})
</script>

<style scoped>
.typewriter{font-size:3.2rem;color:var(--accent2);min-height:48px;display:flex;align-items:center;gap:.6rem}
.cursor{display:inline-block;width:3px;height:1.2em;background:var(--accent2);animation:blink 1s steps(2) infinite}
@keyframes blink{50%{opacity:0}}
@media(max-width:1100px){.typewriter{font-size:2.4rem}}
</style>
