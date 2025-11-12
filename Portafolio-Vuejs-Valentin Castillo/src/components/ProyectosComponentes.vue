<script setup>
import proyecto1 from '/src/assets/pagg.jpg';
import proyecto2 from '/src/assets/bancoo.png';
import { ref } from 'vue';

const misProyectos = ref([
  {
    id: 1,
    src: proyecto1,
    titulo: "Portafolio Grupal",
    descripcion:
      "Aca vas a encontrar nuestro portafolio grupal de mi grupo llamado Bitwars, donde van a encontrar nuestros proyectos y la informacion de cada uno",
    projectoLink: "https://github.com/HotCode2025/Bitwars",
  },
  {
    id: 2,
    src: proyecto2,
    titulo: "Sistema de Banco",
    descripcion:
      "Este es el integrador de Java que hicimos con mi grupo, que es un sistema de banco para depositar, transferir dinero y demás",
    projectoLink: "https://github.com/HotCode2025/Bitwars",
  },
]);
</script>

<template>
  <div class="galeria">
    <div class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
      <div class="img-container">
        <img :src="proyecto.src" :alt="proyecto.titulo" />
        <div class="overlay">
          <h3>{{ proyecto.titulo }}</h3>
        </div>
      </div>
      <div class="proyecto-info">
        <p>{{ proyecto.descripcion }}</p>
        <div class="proyecto-links">
          <a
            :href="proyecto.projectoLink"
            class="btn-ver-mas"
            target="_blank"
            rel="noopener noreferrer"
          >
            Ver Proyecto
          </a>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Orbitron:wght@400;600&display=swap');

/* === CONTENEDOR GALERÍA === */
.galeria {
  width: 100%;
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(250px, 1fr)); /* columnas adaptables */
  gap: 2rem;
  padding: 3rem;
  justify-items: center;
  font-family: 'Orbitron', sans-serif;
  background: transparent; 
}

/* === TARJETA DE PROYECTO === */
.proyecto {
  background: transparent;
  border: 1px solid rgba(0, 255, 213, 0.3);
  border-radius: 15px;
  overflow: hidden;
  box-shadow: 0 0 20px rgba(0, 255, 213, 0.15);
  transition: all 0.4s ease;
  max-width: 300px;
  text-align: center;
}

.proyecto:hover {
  box-shadow: 0 0 25px rgba(0, 255, 213, 0.5);
  transform: translateY(-8px);
}

/* === IMAGEN CON OVERLAY === */
.img-container {
  position: relative;
  width: 100%;
  height: 200px;
  overflow: hidden;
}

.img-container img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  transition: all 0.4s ease;
}

.proyecto:hover img {
  transform: scale(1.1);
  filter: brightness(0.6);
}

.overlay {
  position: absolute;
  inset: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  background: rgba(0, 255, 213, 0.1);
  color: #00fff0;
  opacity: 0;
  transition: opacity 0.4s ease;
  text-shadow: 0 0 8px #00fff0, 0 0 15px #00e0ff;
}

.img-container:hover .overlay {
  opacity: 1;
}

/* === INFORMACIÓN === */
.proyecto-info {
  padding: 1.5rem;
  color: #b7eaff;
}

.proyecto-info p {
  font-size: 0.95rem;
  color: #d9f7ff;
  line-height: 1.4;
}

/* === BOTÓN === */
.proyecto-links {
  margin-top: 1rem;
}

.btn-ver-mas {
  display: inline-block;
  background: transparent;
  color: #00fff0;
  border: 1px solid #00fff0;
  border-radius: 8px;
  padding: 0.6rem 1.2rem;
  text-decoration: none;
  transition: all 0.3s ease;
  font-weight: 600;
  letter-spacing: 0.5px;
  box-shadow: 0 0 10px rgba(0, 255, 213, 0.3);
}

.btn-ver-mas:hover {
  background: #00fff0;
  color: #04022f;
  box-shadow: 0 0 20px #00fff0, 0 0 40px rgba(0, 255, 213, 0.4);
}
</style>
