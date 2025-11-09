<template>
  <header class="header cyberpunk-header">
    <div class="container">
      <router-link class="logo" to="/">PORTAFOLIOS PERSONAL</router-link>
      
      <nav class="nav">
        <router-link class="nav-link" to="/" style="animation-delay: 0.4s">
          <span data-text="Inicio">Inicio</span>
        </router-link>
        <router-link class="nav-link" to="/technologies" style="animation-delay: 0.5s">
          <span data-text="Tecnologías">Tecnologías</span>
        </router-link>
        <router-link class="nav-link" to="/projects" style="animation-delay: 0.6s">
          <span data-text="Proyectos">Proyectos</span>
        </router-link>
        <router-link class="nav-link" to="/contact" style="animation-delay: 0.7s">
          <span data-text="Contacto">Contacto</span>
        </router-link>
      </nav>
      
      <div class="actions">
        <button 
          class="theme-toggle" 
          @click="$emit('toggle-theme')" 
          title="Alternar tema" 
          style="animation-delay: 0.8s"
        >
          <Transition name="fade-icon" mode="out-in">
            <i v-if="theme === 'light'" class="fa-solid fa-moon" key="moon"></i>
            <i v-else class="fa-solid fa-sun" key="sun"></i>
          </Transition>
        </button>
      </div>
    </div>
  </header>
</template>

<script setup>
// CAMBIO 2 (Script):
// Le decimos al componente que va a recibir un 'prop' llamado 'theme' desde App.vue
defineProps({
  theme: String
})

// El emit para 'toggle-theme' ya estaba funcionando
</script>

<style scoped>
/* --- ANIMACIONES DE CARGA (ya estaban) --- */
@keyframes pulse-neon {
  0% {
    border-color: var(--cyber-primary);
    box-shadow: 0 0 15px rgba(0, 255, 255, 0.4), inset 0 0 10px rgba(0, 255, 255, 0.3);
  }
  50% {
    border-color: #fff;
    box-shadow: 0 0 25px rgba(0, 255, 255, 0.8), inset 0 0 15px rgba(0, 255, 255, 0.5);
  }
  100% {
    border-color: var(--cyber-primary);
    box-shadow: 0 0 15px rgba(0, 255, 255, 0.4), inset 0 0 10px rgba(0, 255, 255, 0.3);
  }
}

@keyframes fade-in-load {
  from { opacity: 0; transform: translateY(-10px); }
  to { opacity: 1; transform: translateY(0); }
}

/* --- NUEVA TRANSICIÓN (para el ícono sol/luna) --- */
.fade-icon-enter-active,
.fade-icon-leave-active {
  transition: opacity 0.2s ease;
}
.fade-icon-enter-from,
.fade-icon-leave-to {
  opacity: 0;
}
/* --- FIN NUEVA TRANSICIÓN --- */


:root {
  --cyber-primary: #00FFFF;
  --cyber-secondary: #FF00FF;
  --cyber-dark-bg: #1a0a2e;
}

.cyberpunk-header {
  position: fixed;
  left: 2.4rem;
  right: 2.4rem;
  top: 2rem;
  z-index: 90;
  
  background: rgba(29, 10, 46, 0.65);
  backdrop-filter: blur(10px);
  border-radius: 12px;
  
  border: 1px solid var(--cyber-primary);
  box-shadow: 0 0 15px rgba(0, 255, 255, 0.4), inset 0 0 10px rgba(0, 255, 255, 0.3);
  animation: pulse-neon 4s infinite alternate;
  
  padding: 1.2rem 2rem;
  
  /* --- CAMBIO 1 (Layout): Quitamos Flex de aquí --- */
}

/* --- CAMBIO 1 (Layout): Añadimos Flex al .container --- */
.cyberpunk-header .container {
  display: flex;
  justify-content: space-between; /* Esto pone Logo a la izq. y (Nav + Actions) a la der. */
  align-items: center;
  width: 100%;
}

.logo {
  font-family: 'Orbitron', sans-serif;
  font-weight: 800;
  color: var(--cyber-primary);
  font-size: 2.2rem;
  text-decoration: none;
  text-shadow: 0 0 5px var(--cyber-primary), 0 0 10px var(--cyber-primary), 0 0 20px var(--cyber-secondary);
  transition: all 0.3s ease;
  
  opacity: 0;
  animation: fade-in-load 0.6s ease 0.2s forwards;
  
  /* --- CAMBIO 1 (Layout): Aseguramos que el logo no se encoja --- */
  flex-shrink: 0;
}

.logo:hover {
  color: #fff;
  text-shadow: 0 0 10px var(--cyber-primary), 0 0 30px var(--cyber-secondary);
}

.nav {
  display: flex;
  gap: 2.2rem;
  font-family: 'Share Tech Mono', monospace;

  /* --- CAMBIO 1 (Layout): Empujamos la nav al centro/izquierda --- */
  margin-left: auto; /* Mueve la nav lo más a la izquierda posible (lejos del logo) */
}

.nav-link {
  color: var(--cyber-text-color);
  text-decoration: none;
  font-size: 1.6rem;
  padding: .4rem .6rem;
  border-radius: 8px;
  position: relative;
  overflow: hidden;
  transition: color 0.3s ease;
  
  opacity: 0;
  animation: fade-in-load 0.5s ease forwards;
}

/* (El resto de estilos de .nav-link y .theme-toggle no cambian) */
/* ... (tu código de .nav-link:hover, .router-link-active, etc.) ... */
.nav-link span {
  position: relative;
  z-index: 2;
  transition: all 0.3s ease;
}
.nav-link::before {
  content: '';
  position: absolute;
  top: 0;
  left: -100%;
  width: 100%;
  height: 100%;
  background: var(--cyber-primary);
  transition: left 0.3s ease;
  z-index: 1;
  opacity: 0.8;
}

.nav-link:hover span {
  color: var(--cyber-dark-bg);
}
.nav-link:hover::before {
  left: 0;
}

.nav-link.router-link-active {
  color: var(--cyber-primary);
  text-shadow: 0 0 8px var(--cyber-primary);
}
.nav-link.router-link-active:hover {
  color: var(--cyber-dark-bg);
}

.actions {
  /* --- CAMBIO 1 (Layout): Damos espacio entre Nav y Botón --- */
  margin-left: 2.5rem;
  flex-shrink: 0;
}

.theme-toggle {
  background: transparent;
  border: 1px solid var(--cyber-primary);
  color: var(--cyber-primary);
  cursor: pointer;
  font-size: 1.6rem;
  padding: .6rem;
  border-radius: 8px;
  transition: all 0.3s ease;
  box-shadow: 0 0 10px rgba(0, 255, 255, 0.5);

  opacity: 0;
  animation: fade-in-load 0.5s ease forwards;
  
  /* --- NUEVO: Para que el ícono quepa bien --- */
  width: 42px; /* Ancho fijo para que no "salte" */
  text-align: center;
}

.theme-toggle:hover {
  background: var(--cyber-primary);
  color: var(--cyber-dark-bg);
  box-shadow: 0 0 20px var(--cyber-primary);
  transform: scale(1.1);
}

@media (max-width: 768px) { /* Ajuste de media query */
  .nav { display: none; }
  .actions { margin-left: auto; } /* En móvil, el botón se alinea solo a la derecha */
}
</style>