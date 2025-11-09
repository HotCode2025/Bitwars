
<template>
  <section class="panel hero cyberpunk-hero">
    <div class="container hero-grid">
      <div>
        <h1 class="glitch" data-text="Hola, soy Tomás">Hola, soy <span>Tomás</span></h1>
        
        <Typewriter />
        
        <p class="lead">Tecnicatura en Programación — UTN. Ensablador de pc, proyectos Grupales BitWars.</p>
        
        <div class="actions">
          <router-link class="btn btn-primary" to="/contact">Contáctame <i class="fa-brands fa-whatsapp"></i></router-link>
          <router-link class="btn btn-outline" to="/projects">Ver proyectos</router-link>
        </div>
      </div>
      
      <div class="portrait tilt">
        <img src="/src/assets/img_neon.png" alt="Tomás" class="neon-image">
      </div>
    </div>
  </section>
</template>

<script setup>
import Typewriter from './Typewriter.vue'
</script>

<style scoped>
/* Variables Cyberpunk */
:root {
  --cyber-primary: #00FFFF;
  --cyber-secondary: #FF00FF;
  --cyber-dark-bg: #1a0a2e;
  --cyber-light-bg: #2d0e4a;
  --cyber-text-color: #E0E0E0;
}

/* --- NUEVA ANIMACIÓN DE ROTACIÓN --- */
@keyframes spin {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}
/* --- FIN NUEVA ANIMACIÓN --- */


/* Sección Hero */
.cyberpunk-hero {
  background-color: var(--cyber-dark-bg);
  min-height: 100vh;
  display: flex;
  align-items: center;
  padding: 12rem 2rem 6rem 2rem;
  font-family: 'Share Tech Mono', monospace;
  color: var(--cyber-text-color);
  overflow: hidden;
  position: relative;
}

.hero-grid {
  display: grid;
  grid-template-columns: 2fr 1fr;
  align-items: center;
  gap: 4rem;
  max-width: 1200px;
  margin: 0 auto;
}

/* Título con Glitch (Sin cambios) */
.glitch {
  font-family: 'Orbitron', sans-serif;
  font-size: 5rem;
  font-weight: 700;
  color: var(--cyber-primary);
  text-shadow: 
    0 0 10px var(--cyber-primary),
    0 0 20px var(--cyber-primary),
    0 0 30px var(--cyber-secondary);
  animation: glitch 2.5s infinite alternate;
  position: relative;
  margin-bottom: 1.5rem;
}
.glitch span {
  color: #fff;
  text-shadow: 0 0 15px #fff, 0 0 25px var(--cyber-secondary);
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
@keyframes glitch { 0% { transform: translate(0); } 20% { transform: translate(-2px, 2px); } 40% { transform: translate(-2px, -2px); } 60% { transform: translate(2px, 2px); } 80% { transform: translate(2px, -2px); } 100% { transform: translate(0); } }
@keyframes glitch-left { 0% { clip: rect(40px, 9999px, 80px, 0); } 25% { clip: rect(10px, 9999px, 60px, 0); } 50% { clip: rect(70px, 9999px, 120px, 0); } 75% { clip: rect(20px, 9999px, 90px, 0); } 100% { clip: rect(40px, 9999px, 80px, 0); } }
@keyframes glitch-right { 0% { clip: rect(80px, 9999px, 40px, 0); } 25% { clip: rect(60px, 9999px, 10px, 0); } 50% { clip: rect(120px, 9999px, 70px, 0); } 75% { clip: rect(90px, 9999px, 20px, 0); } 100% { clip: rect(80px, 9999px, 40px, 0); } }
/* --- Fin Glitch (Sin cambios) --- */


/* Párrafo y Botones (Sin cambios) */
.lead {
  font-size: 1.3rem;
  color: var(--cyber-text-color);
  margin-bottom: 2.5rem;
  line-height: 1.7;
  max-width: 600px;
  text-shadow: 0 0 5px rgba(224, 224, 224, 0.2);
}
.actions {
  display: flex;
  gap: 1.5rem;
}
.btn {
  font-family: 'Share Tech Mono', monospace;
  text-decoration: none;
  padding: 0.8rem 1.8rem;
  font-size: 1.1rem;
  font-weight: 600;
  border-radius: 6px;
  transition: all 0.3s ease;
  cursor: pointer;
  position: relative;
  overflow: hidden;
}
.btn i {
  margin-left: 0.5rem;
}
.btn-primary {
  background: var(--cyber-primary);
  color: var(--cyber-dark-bg);
  border: 2px solid var(--cyber-primary);
  box-shadow: 0 0 15px var(--cyber-primary);
}
.btn-primary:hover {
  box-shadow: 0 0 25px var(--cyber-primary), 0 0 30px var(--cyber-secondary);
  animation: btn-glitch 0.2s infinite;
}
@keyframes btn-glitch {
  0% { transform: translate(0); }
  25% { transform: translate(-2px, 2px); }
  50% { transform: translate(2px, -2px); }
  75% { transform: translate(-2px, -2px); }
  100% { transform: translate(0); }
}
.btn-outline {
  background: transparent;
  color: var(--cyber-primary);
  border: 2px solid var(--cyber-primary);
}
.btn-outline:hover {
  background: var(--cyber-primary);
  color: var(--cyber-dark-bg);
  box-shadow: 0 0 20px var(--cyber-primary);
}
/* --- Fin Párrafo y Botones --- */


/* --- CAMBIOS EN LA IMAGEN --- */

/* El contenedor .portrait ahora es el ancla de los anillos */
.portrait {
  display: flex;
  justify-content: center;
  align-items: center;
  /* Establecemos el tamaño base de la imagen */
  width: 380px;
  height: 380px;
  position: relative; /* ¡MUY IMPORTANTE! */
}

.neon-image {
  width: 100%;
  height: 100%;
  border-radius: 50%;
  object-fit: cover;

  /* Aseguramos que la imagen esté SOBRE los anillos */
  position: relative; /* ¡AÑADIDO! Necesario para z-index */
  z-index: 1;       /* ¡AÑADIDO! */

  /* Borde y Sombra estáticos (el movimiento vendrá de los anillos) */
  border: 3px solid var(--cyber-primary);
  box-shadow: 
    0 0 15px var(--cyber-primary),
    0 0 25px var(--cyber-primary),
    0 0 40px var(--cyber-secondary);
}

/* --- NUEVO: LOS ANILLOS ORBITALES --- */

/* Anillo 1 */
.portrait::before {
  /* ...otras propiedades... */
  z-index: 0; /* ¡CAMBIO! Asegura que estén detrás de la imagen pero visibles */
}

/* Anillo 2 */
.portrait::after {
  /* ...otras propiedades... */
  z-index: 0; /* ¡CAMBIO! */
}
/* Anillo 2 (Discontinuo, magenta, más lejano) */
.portrait::after {
  width: calc(100% + 40px); /* 420px */
  height: calc(100% + 40px); /* 420px */
  top: -20px;
  left: -20px;
  
  border: 3px dashed var(--cyber-secondary);
  box-shadow: 0 0 20px var(--cyber-secondary);
  
  /* Gira en sentido opuesto y más lento */
  animation: spin 15s linear infinite reverse;
}
/* --- FIN CAMBIOS IMAGEN --- */


/* Responsividad (¡Importante!) */
@media (max-width: 900px) {
  .hero-grid {
    grid-template-columns: 1fr;
    text-align: center;
  }
  .portrait {
    grid-row: 1;
    margin: 0 auto 3rem auto; /* Centramos el portrait */
    /* Lo achicamos para que coincida con la imagen */
    width: 280px; 
    height: 280px;
  }
  .actions {
    justify-content: center;
  }
  .lead {
    margin: 0 auto 2.5rem auto;
  }
  .glitch {
    font-size: 3.5rem;
  }
  .neon-image {
    /* Ya no necesita width/height, lo hereda del .portrait */
    width: 100%;
    height: 100%;
  }
}
</style>