<template>
  <section class="technologies-section cyberpunk">
    <div class="container">
      <h2 class="glitch" data-text="TECNOLOGÍAS">TECNOLOGÍAS</h2>
      <p class="subtitle">El arsenal de mi estación de batalla.</p>

      <div class="tech-grid">
        <div class="cyber-tech-card" title="HTML 5">
          <i class="fa-brands fa-html5"></i>
          <span>HTML5</span>
        </div>
        <div class="cyber-tech-card" title="CSS 3">
          <i class="fa-brands fa-css3-alt"></i>
          <span>CSS3</span>
        </div>
        <div class="cyber-tech-card" title="JavaScript (ES6+)">
          <i class="fa-brands fa-js"></i>
          <span>JavaScript</span>
        </div>

        <div class="cyber-tech-card" title="Vue.js">
          <i class="fa-brands fa-vuejs"></i>
          <span>Vue.js</span>
        </div>
        <div class="cyber-tech-card" title="React">
          <i class="fa-brands fa-react"></i>
          <span>React</span>
        </div>
        <div class="cyber-tech-card" title="Node.js">
          <i class="fa-brands fa-node-js"></i>
          <span>Node.js</span>
        </div>
        
        <div class="cyber-tech-card" title="Sass">
          <i class="fa-brands fa-sass"></i>
          <span>Sass</span>
        </div>
        <div class="cyber-tech-card" title="Git">
          <i class="fa-brands fa-git-alt"></i>
          <span>Git</span>
        </div>
        <div class="cyber-tech-card" title="Figma">
          <i class="fa-brands fa-figma"></i>
          <span>Figma</span>
        </div>
      </div>
    </div>
  </section>
</template>

<script setup>
// Este componente no necesita lógica de script por ahora
</script>

<style scoped>
/* Colores y Variables Cyberpunk */
:root {
  --cyber-primary: #00FFFF; /* Aqua Neón */
  --cyber-secondary: #FF00FF; /* Magenta Neón */
  --cyber-dark-bg: #1a0a2e; /* Fondo oscuro casi negro-púrpura */
  --cyber-light-bg: #2d0e4a; /* Fondo más claro para elementos */
  --cyber-text-color: #E0E0E0; /* Texto claro */
}

/* Base de la sección */
.technologies-section.cyberpunk {
  padding: 30rem 2rem 6rem 2rem;
  min-height: 100vh;
  text-align: center;
  background-color: var(--cyber-dark-bg);
  font-family: 'Share Tech Mono', monospace; /* Fuente tech */
  overflow: hidden;
  position: relative;
}

.container {
  max-width: 900px;
  margin: 0 auto;
  z-index: 10;
}

/* Título estilo Glitch (Copiado de Contact.vue) */
.glitch {
  font-family: 'Orbitron', sans-serif; /* Fuente Cyberpunk */
  font-size: 4rem;
  font-weight: 700;
  color: var(--cyber-primary);
  text-shadow: 
    0 0 10px var(--cyber-primary),
    0 0 20px var(--cyber-primary),
    0 0 30px var(--cyber-secondary);
  animation: glitch 2.5s infinite alternate;
  position: relative;
  margin-bottom: 1rem;
}

.glitch::before,
.glitch::after {
  content: attr(data-text);
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: var(--cyber-dark-bg);
  overflow: hidden;
  clip: rect(0, 900px, 0, 0);
  text-shadow: 0 0 10px var(--cyber-primary);
}

.glitch::before {
  left: -2px;
  text-shadow: 0 0 10px var(--cyber-secondary);
  animation: glitch-left 3s infinite alternate-reverse;
}

.glitch::after {
  left: 2px;
  text-shadow: 0 0 10px var(--cyber-primary);
  animation: glitch-right 3s infinite alternate;
}

@keyframes glitch {
  0% { transform: translate(0); }
  20% { transform: translate(-2px, 2px); }
  40% { transform: translate(-2px, -2px); }
  60% { transform: translate(2px, 2px); }
  80% { transform: translate(2px, -2px); }
  100% { transform: translate(0); }
}

@keyframes glitch-left {
  0% { clip: rect(40px, 9999px, 80px, 0); }
  25% { clip: rect(10px, 9999px, 60px, 0); }
  50% { clip: rect(70px, 9999px, 120px, 0); }
  75% { clip: rect(20px, 9999px, 90px, 0); }
  100% { clip: rect(40px, 9999px, 80px, 0); }
}

@keyframes glitch-right {
  0% { clip: rect(80px, 9999px, 40px, 0); }
  25% { clip: rect(60px, 9999px, 10px, 0); }
  50% { clip: rect(120px, 9999px, 70px, 0); }
  75% { clip: rect(90px, 9999px, 20px, 0); }
  100% { clip: rect(80px, 9999px, 40px, 0); }
}
/* Fin Título Glitch */


.subtitle {
  font-family: 'Share Tech Mono', monospace;
  font-size: 1.2rem;
  color: var(--cyber-text-color);
  margin-bottom: 4rem;
  text-shadow: 0 0 5px rgba(0, 255, 255, 0.5);
}

/* Grilla de Tecnologías */
.tech-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(150px, 1fr));
  gap: 2.5rem;
  justify-items: center;
}

.cyber-tech-card {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 160px;
  height: 160px;
  background: linear-gradient(145deg, var(--cyber-light-bg), #1f0c3a);
  border-radius: 10px;
  border: 2px solid var(--cyber-primary);
  box-shadow: 0 0 10px var(--cyber-primary), inset 0 0 8px var(--cyber-primary);
  position: relative;
  overflow: hidden;
  transition: all 0.3s ease;
  cursor: pointer;
}

/* Efecto de Scanline en Hover (como en Contacto) */
.cyber-tech-card::before {
  content: '';
  position: absolute;
  top: -50%;
  left: -50%;
  width: 200%;
  height: 200%;
  background: linear-gradient(
    60deg, 
    rgba(0,255,255,0) 0%, 
    rgba(0,255,255,0.1) 50%, 
    rgba(0,255,255,0) 100%
  );
  transform: rotate(45deg);
  opacity: 0;
  transition: opacity 0.5s ease;
  z-index: 1;
}

.cyber-tech-card:hover::before {
  opacity: 1;
  animation: card-hover-scanline 1s infinite linear;
}

@keyframes card-hover-scanline {
  0% { transform: translate(-100%, -100%) rotate(45deg); opacity: 0.5; }
  100% { transform: translate(100%, 100%) rotate(45deg); opacity: 0; }
}


.cyber-tech-card:hover {
  transform: translateY(-8px) scale(1.05);
  border-color: var(--cyber-secondary);
  box-shadow: 0 0 20px var(--cyber-secondary), inset 0 0 15px var(--cyber-secondary);
}

.cyber-tech-card i, .cyber-tech-card span {
  position: relative;
  z-index: 2; /* Para estar sobre el efecto ::before */
}

.cyber-tech-card i {
  font-size: 4rem;
  margin-bottom: 1rem;
  transition: all 0.3s ease;
}

.cyber-tech-card span {
  font-family: 'Share Tech Mono', monospace;
  font-size: 1rem;
  font-weight: 500;
  color: var(--cyber-text-color);
  text-shadow: 0 0 3px var(--cyber-primary);
  transition: all 0.3s ease;
}

/* Efecto Neón para cada ícono (usando su color de marca) */
.cyber-tech-card[title="HTML 5"] i { color: #E34F26; text-shadow: 0 0 15px #E34F26; }
.cyber-tech-card[title="CSS 3"] i { color: #1572B6; text-shadow: 0 0 15px #1572B6; }
.cyber-tech-card[title="JavaScript (ES6+)"] i { color: #F7DF1E; text-shadow: 0 0 15px #F7DF1E; }
.cyber-tech-card[title="Vue.js"] i { color: #4FC08D; text-shadow: 0 0 15px #4FC08D; }
.cyber-tech-card[title="React"] i { color: #61DAFB; text-shadow: 0 0 15px #61DAFB; }
.cyber-tech-card[title="Node.js"] i { color: #339933; text-shadow: 0 0 15px #339933; }
.cyber-tech-card[title="Sass"] i { color: #CC6699; text-shadow: 0 0 15px #CC6699; }
.cyber-tech-card[title="Git"] i { color: #F05032; text-shadow: 0 0 15px #F05032; }
.cyber-tech-card[title="Figma"] i { color: #F24E1E; text-shadow: 0 0 15px #F24E1E; }

/* Efecto hover en el texto e ícono */
.cyber-tech-card:hover i {
  transform: scale(1.1);
}
.cyber-tech-card:hover span {
  color: var(--cyber-primary);
  text-shadow: 0 0 8px var(--cyber-primary);
}

</style>