<template>
  <nav class="nav">
    <div class="left">
      <img src="/src/assets/logo_b.png" class="logo"/>
      <div class="title">
        <h1>itWars</h1>
        <small>Portafolios Grupal</small>
      </div>
    </div>

    <ul class="links">
      <li><router-link to="/"> inicio</router-link></li>
      <li><router-link to="/proyectos"> proyectos</router-link></li>
      <li><router-link to="/lenguajes"> Habilidades</router-link></li>
      <li><router-link to="/contacto"> contacto</router-link></li>
    </ul>

    <div class="actions">
      <button class="theme-btn" @click="$emit('toggle-theme')">
        <span v-if="theme==='dark'">☀️</span>
        <span v-else>🌙</span>
      </button>
    </div>
  </nav>
</template>

<script>
export default {
  props: ['theme']
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Press+Start+2P&display=swap');

.nav {
  font-family: 'Press Start 2P', cursive;
  position: relative;
  z-index: 10;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 14px 20px;
  background: rgba(20, 10, 40, 0.6);
  border-bottom: 3px solid #9b5cff;
  box-shadow: 0 0 10px #9b5cff55;
}

.left {
  display: flex;
  align-items: center;
  gap: 10px;
}

.logo {
  width: 64px;
  height: 64px;
  image-rendering: pixelated;
}

.title h1 {
  font-size: 20px;
  color: #9b5cff;
  margin: 0;
}

.title small {
  font-size: 10px;
  color: #aaa;
}

.links {
  list-style: none;
  display: flex;
  gap: 14px;
  margin: 0;
  padding: 0;
}

.links a {
  font-size: 15px; /* agregale esto para ajustar el tamaño de texto del menú */
  color: #fff;
  text-decoration: none;
  padding: 8px 12px;
  border: 2px solid transparent;
  background: rgba(255, 255, 255, 0.05);
  border-radius: 8px;
  transition: 0.2s;
  box-shadow: 0 0 4px #000;
}

.links a:hover {
  border-color: #9b5cff;
  box-shadow: 0 0 10px #9b5cff;
  background: rgba(155, 92, 255, 0.15);
  transform: scale(1.05);
}

.theme-btn {
  border: 2px solid #9b5cff;
  color: #fff;
  background: rgba(155, 92, 255, 0.1);
  padding: 6px 10px;
  border-radius: 8px;
  cursor: pointer;
  transition: 0.2s;
}

.theme-btn:hover {
  background: rgba(155, 92, 255, 0.3);
  box-shadow: 0 0 8px #9b5cff;
}

</style>
