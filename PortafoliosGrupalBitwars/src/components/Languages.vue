<template>
  <section class="lenguajes">
    <!-- Título centrado -->
    <h2 class="section-title">Habilidades que manejamos</h2>

    <div class="languages-grid">
      <div class="lang-item" v-for="l in languages" :key="l.name" :style="{ '--color': l.color }">
        <img :src="l.img" :alt="l.name + ' logo'" class="lang-logo" />
        <div class="info">
          <div class="name">{{l.name}}</div>
          <div class="desc">{{l.desc}}</div> 
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  data() {
    return {
      languages: [
        { name: 'HTML', desc: 'maquetado y estructura', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg', color: '#e34c26' },
        { name: 'CSS', desc: 'estilos y diseño', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg', color: '#264de4' },
        { name: 'Sass', desc: 'CSS avanzado con variables', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/sass/sass-original.svg', color: '#cc6699' },
        { name: 'Javascript', desc: 'interactividad y lógica', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg', color: '#f0db4f' },
        { name: 'Vue.js', desc: 'framework progresivo', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vuejs/vuejs-original.svg', color: '#42b883' },
        { name: 'Java', desc: 'backend y lógica de servidor', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg', color: '#007396' },
        { name: 'Python', desc: 'programación general y ciencia de datos', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/python/python-original.svg', color: '#306998' },
        { name: 'C#', desc: 'desarrollo de apps', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/csharp/csharp-original.svg', color: '#68217a' },
        { name: 'Node.js', desc: 'backend con javascript', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/nodejs/nodejs-original.svg', color: '#83cd29' },
        { name: 'React', desc: 'UI dinámica y componentes', img: 'https://cdn.jsdelivr.net/gh/devicons/devicon/icons/react/react-original.svg', color: '#61dafb' }
      ]
    }
  }
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Press+Start+2P&display=swap');

.section-title {
  font-family: 'Press Start 2P', cursive;
  font-size: 22px;
  color: #fff;
  text-align: center;
  margin-bottom: 25px;
  text-shadow: 0 0 15px #9b5cff;
}

.languages-grid {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 20px;
}

.lang-item {
  background: #1a1a1a;
  border: 2px solid var(--color);
  border-radius: 12px;
  padding: 20px;
  text-align: center;
  transition: transform 0.3s, box-shadow 0.3s;
  cursor: pointer;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 10px;
  width: 120px;
}

.lang-item:hover {
  transform: translateY(-10px);
  box-shadow: 0 0 20px var(--color);
}

.lang-logo {
  width: 60px;
  height: 60px;
  object-fit: contain;
  filter: drop-shadow(0 0 5px var(--color));
}

.name {
  font-family: 'Press Start 2P', cursive;
  font-size: 12px;
  color: var(--color);
  text-shadow: 0 0 5px var(--color);
}

.desc {
  font-size: 9px;
  color: #aaa;
}
</style>
