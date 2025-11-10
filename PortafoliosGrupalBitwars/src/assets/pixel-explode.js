window.addEventListener('pixel-explode', (e)=>{
  const { x,y } = e.detail
  // create small div pixels
  for(let i=0;i<14;i++){
    const d = document.createElement('div')
    d.className = 'px'
    const size = Math.floor(Math.random()*6)+4
    d.style.width = d.style.height = size+'px'
    d.style.left = (x - size/2) + 'px'
    d.style.top = (y - size/2) + 'px'
    d.style.background = (Math.random()>0.5)? '#9b5cff' : '#66d1ff'
    d.style.position = 'fixed'
    d.style.zIndex = 9999
    d.style.borderRadius = '1px'
    d.style.pointerEvents = 'none'
    d.style.transform = `translate(0,0)`
    document.body.appendChild(d)
    const dx = (Math.random()-0.5)*200
    const dy = (Math.random()-0.8)*200
    d.animate([{ transform: 'translate(0,0)', opacity:1 }, { transform:`translate(${dx}px, ${dy}px) rotate(${Math.random()*360}deg)`, opacity:0 }], { duration: 600 + Math.random()*300, easing: 'cubic-bezier(.2,.8,.2,1)' })
    setTimeout(()=>{ d.remove() }, 1200)
  }
})
