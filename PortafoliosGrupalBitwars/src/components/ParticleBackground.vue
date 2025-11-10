<template>
  <canvas ref="c" class="particles"></canvas>
</template>
<script>
import { onMounted, onBeforeUnmount, ref } from 'vue'
export default {
  setup(){
    const c = ref(null)
    let ctx, w, h, parts = [], raf
    function rand(a,b){ return Math.random()*(b-a)+a }
    function resize(){ const cv=c.value; w=cv.width=window.innerWidth; h=cv.height=window.innerHeight; ctx=cv.getContext('2d'); ctx.imageSmoothingEnabled=false; init() }
    function init(){ parts=[]; const n = Math.floor((w*h)/90000)+30; for(let i=0;i<n;i++){ parts.push({ x:Math.random()*w, y:Math.random()*h, r:Math.random()*2+1, vx:rand(-0.01,0.01), vy:rand(-0.01,0.01), hue: (Math.random()*40)+250, a:rand(0.2,0.9) }) } }
    function step(){ ctx.clearRect(0,0,w,h); for(const p of parts){ p.x+=p.vx; p.y+=p.vy; if(p.x<-10)p.x=w+10; if(p.x>w+10)p.x=-10; if(p.y<-10)p.y=h+10; if(p.y>h+10)p.y=-10; ctx.fillStyle=`hsla(${p.hue},80%,60%,${p.a})`; ctx.fillRect(Math.round(p.x),Math.round(p.y),Math.round(p.r),Math.round(p.r)); } raf=requestAnimationFrame(step) }
    onMounted(()=>{ resize(); window.addEventListener('resize', resize); raf=requestAnimationFrame(step); window.addEventListener('pixel-explode', (e)=>{ const {x,y}=e.detail; for(let i=0;i<16;i++){ parts.push({ x, y, r:Math.random()*3+1, vx:(Math.random()-0.5)*4, vy:(Math.random()-0.5)*4, hue:(Math.random()*40)+250, a:1 }) } }) })
    onBeforeUnmount(()=>{ cancelAnimationFrame(raf); window.removeEventListener('resize', resize) })
    return { c }
  }
}
</script>
<style scoped>
.particles{ position:fixed; inset:0; z-index:1; pointer-events:none; image-rendering:pixelated }
</style>
