<template>
  <section class="projects-section cyberpunk">
    <div class="container">
      <h2 class="glitch" data-text="PROYECTOS">PROYECTOS</h2>
      <p class="subtitle">Una muestra de mi código y soluciones.</p>

      <div class="tabs-container">
        
        <nav class="tabs-nav">
          <button
            v-for="(project, index) in projects"
            :key="project.name"
            :class="{ active: activeProjectIndex === index }"
            @click="activeProjectIndex = index"
          >
            {{ project.name }}
          </button>
        </nav>

        <div class="tabs-content">
          <Transition name="fade-panel" mode="out-in">
            <div class="tab-panel" :key="activeProject.name">
              <h3>{{ activeProject.name }}</h3>
              <p>{{ activeProject.desc }}</p>
              
              <div class="code-snippet">
                <pre><code>{{ activeProject.code }}</code></pre>
              </div>
              
              <a :href="activeProject.link" class="btn btn-outline" target="_blank" rel="noopener noreferrer">
                Ver Repositorio
              </a>
            </div>
          </Transition>
        </div>

      </div>

      <div class="global-github-link">
        <a href="https://github.com/tomasvilche" class="btn btn-primary" target="_blank" rel="noopener noreferrer">
          Ver todos mis repositorios en GitHub <i class="fa-brands fa-github"></i>
        </a>
      </div>

    </div>
  </section>
</template>

<script setup>
import { ref, computed } from 'vue'

// 1. Índice de la solapa activa (empezamos en 0)
const activeProjectIndex = ref(0)

// 2. Actualizamos tu array de 'projects' para incluir el CÓDIGO de ejemplo
const projects = [
  { 
    name: "Portfolio Github Grupal BitWars", 
    desc: "Mi portfolio Grupal ", 
    link: "https://github.com/HotCode2025/Bitwars", // Cambia esto al link del portfolio
    code: `// Ejemplo de código de Portfolio (Vue.js)
<template>
  <Transition name="fade">
    <router-view />
  </Transition>
</template>

<style>
.fade-enter-active,
.fade-leave-active {
  transition: opacity 0.5s ease;
}
</style>`
  },
  { 
    name: "Sistema de Banco", 
    desc: "sistema de banco - integrador java.", 
    link: "https://github.com/HotCode2025/Bitwars/tree/main/sistema%20de%20banco%20-%20integrador%20java", // Cambia esto al link de la tienda
    code: `// Ejemplo de código de Tienda (JavaScript)
class Cart {
  constructor() {
    this.items = [];
  }

  addItem(product, quantity) {
    this.items.push({ product, quantity });
    this.updateDOM();
  }
}`
  }
]

// 3. Computed property para obtener el proyecto activo
const activeProject = computed(() => {
  return projects[activeProjectIndex.value]
})
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

/* Base de la sección (copiado de otras) */
.projects-section.cyberpunk {
  padding: 10rem 2rem 6rem 2rem; /* Con padding superior para el header */
  min-height: 100vh;
  text-align: left; /* Lo cambiamos a 'left' para los tabs */
  background-color: var(--cyber-dark-bg);
  font-family: 'Share Tech Mono', monospace;
  overflow: hidden;
  position: relative;
}

.container {
  max-width: 900px;
  margin: 0 auto;
  z-index: 10;
}

/* Título Glitch (copiado de otras) */
.glitch {
  font-family: 'Orbitron', sans-serif;
  font-size: 4rem;
  font-weight: 700;
  color: var(--cyber-primary);
  text-shadow: 0 0 10px var(--cyber-primary), 0 0 20px var(--cyber-primary), 0 0 30px var(--cyber-secondary);
  animation: glitch 2.5s infinite alternate;
  position: relative;
  margin-bottom: 1rem;
  text-align: center; /* Centramos solo el título */
}

/* ... (animación glitch completa) ... */
.glitch::before, .glitch::after { content: attr(data-text); position: absolute; top: 0; left: 0; width: 100%; height: 100%; background: var(--cyber-dark-bg); overflow: hidden; clip: rect(0, 900px, 0, 0); text-shadow: 0 0 10px var(--cyber-primary); }
.glitch::before { left: -2px; text-shadow: 0 0 10px var(--cyber-secondary); animation: glitch-left 3s infinite alternate-reverse; }
.glitch::after { left: 2px; text-shadow: 0 0 10px var(--cyber-primary); animation: glitch-right 3s infinite alternate; }
@keyframes glitch { 0% { transform: translate(0); } 20% { transform: translate(-2px, 2px); } 40% { transform: translate(-2px, -2px); } 60% { transform: translate(2px, 2px); } 80% { transform: translate(2px, -2px); } 100% { transform: translate(0); } }
@keyframes glitch-left { 0% { clip: rect(40px, 9999px, 80px, 0); } 25% { clip: rect(10px, 9999px, 60px, 0); } 50% { clip: rect(70px, 9999px, 120px, 0); } 75% { clip: rect(20px, 9999px, 90px, 0); } 100% { clip: rect(40px, 9999px, 80px, 0); } }
@keyframes glitch-right { 0% { clip: rect(80px, 9999px, 40px, 0); } 25% { clip: rect(60px, 9999px, 10px, 0); } 50% { clip: rect(120px, 9999px, 70px, 0); } 75% { clip: rect(90px, 9999px, 20px, 0); } 100% { clip: rect(80px, 9999px, 40px, 0); } }
/* --- Fin Glitch --- */

.subtitle {
  font-family: 'Share Tech Mono', monospace;
  font-size: 1.2rem;
  color: var(--cyber-text-color);
  margin-bottom: 3rem;
  text-shadow: 0 0 5px rgba(0, 255, 255, 0.5);
  text-align: center; /* Centramos el subtítulo */
}

/* --- ESTILOS DE TABS MINIMALISTAS --- */
.tabs-container {
  width: 100%;
}

.tabs-nav {
  display: flex;
  border-bottom: 2px solid var(--cyber-light-bg);
  margin-bottom: 2rem;
}

.tabs-nav button {
  font-family: 'Share Tech Mono', monospace;
  background: transparent;
  border: none;
  color: var(--cyber-text-color);
  font-size: 1.2rem;
  padding: 1rem 1.5rem;
  cursor: pointer;
  position: relative;
  top: 2px; /* Para que el borde 'active' se alinee con el borde del nav */
  border-bottom: 2px solid transparent;
  transition: all 0.3s ease;
}

.tabs-nav button:hover {
  color: var(--cyber-primary);
  background: rgba(0, 255, 255, 0.05);
}

.tabs-nav button.active {
  color: var(--cyber-primary);
  border-bottom-color: var(--cyber-primary);
  text-shadow: 0 0 8px var(--cyber-primary);
}

/* Panel de Contenido */
.tab-panel {
  background: var(--cyber-light-bg);
  border: 1px solid var(--cyber-primary);
  box-shadow: 0 0 20px rgba(0, 255, 255, 0.2);
  border-radius: 8px;
  padding: 2rem;
  color: var(--cyber-text-color);
}

.tab-panel h3 {
  font-family: 'Orbitron', sans-serif;
  font-size: 2rem;
  color: var(--cyber-primary);
  margin-bottom: 1rem;
}

.tab-panel p {
  font-size: 1.1rem;
  line-height: 1.6;
  margin-bottom: 1.5rem;
  opacity: 0.9;
}

/* El bloque de código */
.code-snippet {
  margin: 2rem 0;
}

.code-snippet pre {
  background: #0d021f; /* Un púrpura más oscuro que el fondo */
  border: 1px solid var(--cyber-secondary);
  border-radius: 8px;
  padding: 1.5rem;
  overflow-x: auto; /* Para que haya scroll horizontal si el código es largo */
  box-shadow: 0 0 15px rgba(255, 0, 255, 0.2);
}

.code-snippet code {
  font-family: 'Share Tech Mono', monospace;
  font-size: 0.95rem;
  color: #E0E0E0;
  white-space: pre; /* Mantiene los espacios y saltos de línea */
}

/* Link global de GitHub */
.global-github-link {
  text-align: center;
  margin-top: 4rem;
  padding-top: 2rem;
  border-top: 1px dashed var(--cyber-light-bg);
}


/* --- Botones (Copiados de Hero.vue para consistencia) --- */
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
  margin-right: 1rem; /* Espacio entre botones */
}
.btn i { margin-left: 0.5rem; }

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
@keyframes btn-glitch { 0% { transform: translate(0); } 25% { transform: translate(-2px, 2px); } 50% { transform: translate(2px, -2px); } 75% { transform: translate(-2px, -2px); } 100% { transform: translate(0); } }

/* Transición para el panel */
.fade-panel-enter-active,
.fade-panel-leave-active {
  transition: opacity 0.3s ease;
}
.fade-panel-enter-from,
.fade-panel-leave-to {
  opacity: 0;
}
</style>