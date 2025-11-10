<template>
  <section class="proyectos">
    <div class="proyecto-item" v-for="p in proyectos" :key="p.name">
      <div class="img-container">
        <img :src="p.img" :alt="p.name + ' preview'" class="proy-img" />
        <a :href="p.github" target="_blank" class="github-icon" title="Ver en GitHub">
          <i class="fab fa-github"></i>
        </a>
      </div>
      <div class="info">
        <div class="name">{{p.name}}</div>
        <div class="desc">{{p.desc}}</div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  data() {
    return {
      proyectos: [
        { 
          name: 'Trabajos Tecnica', 
          desc: 'Proyectos de Java, Python y JavaScript', 
          img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg', 
          github: 'https://github.com/HotCode2025/Bitwars'
        },
        { 
          name: 'Sistema de Banco', 
          desc: 'Proyecto completo de gestión bancaria', 
          img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg', 
          github: 'https://github.com/HotCode2025/Bitwars/tree/main/sistema%20de%20banco%20-%20integrador%20java'
        }
      ]
    }
  }
}
</script>

<style scoped>
@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css');
@import url('https://fonts.googleapis.com/css2?family=Press+Start+2P&display=swap');

.proyectos {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
  gap: 30px;
  padding: 40px 20px;
}

.proyecto-item {
  background: #0d1117;
  border-radius: 12px;
  overflow: hidden;
  transition: transform 0.3s, box-shadow 0.3s;
  cursor: pointer;
  display: flex;
  flex-direction: column;
}

.proyecto-item:hover {
  transform: translateY(-8px);
  box-shadow: 0 0 25px #42b883;
}

.img-container {
  position: relative;
  width: 100%;
  height: 150px;
  overflow: hidden;
  display: flex;
  justify-content: center;
  align-items: center;
  background: #161b22;
}

.proy-img {
  width: 80px;
  height: 80px;
  object-fit: contain;
  filter: drop-shadow(0 0 5px #42b883);
}

.github-icon {
  position: absolute;
  top: 8px;
  right: 8px;
  font-size: 20px;
  color: #fff;
  background: rgba(0,0,0,0.6);
  padding: 5px;
  border-radius: 50%;
  transition: transform 0.2s, background 0.2s;
}

.github-icon:hover {
  transform: scale(1.2);
  background: rgba(66, 184, 131, 0.9);
}

.info {
  padding: 10px 15px;
  background: #161b22;
}

.info .name {
  font-family: 'Press Start 2P', cursive;
  font-size: 14px;
  color: #42b883;
  margin-bottom: 5px;
}

.info .desc {
  font-size: 11px;
  color: #aaa;
}
</style>
