<script setup>
import fotoPerfil from '/src/assets/fotomia.jpeg'; 

const title = 'Valentín Castillo';
const descripcion = 'Técnico Universitario en Programación - UTN';
const presentacion = 'Hola, bienvenido a mi portafolio individual. Tengo 20 años y estudio la Tecnicatura Universitaria en Programación en la UTN.';
</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <div class="perfil">
        <img :src="fotoPerfil" alt="Foto de Valentín Castillo" class="foto-perfil" />
      </div>
      <h1>{{ title }}</h1>
      <h2>{{ descripcion }}</h2>
      <p>{{ presentacion }}</p>

      <ul class="container-lista">
        <li v-for="red in redesSociales" :key="red.id">
          <a :href="red.url" target="_blank" rel="noopener noreferrer">
            <img class="icon-redsocial" :src="red.src" :alt="red.name" />
          </a>
        </li>
      </ul>
    </div>
  </section>
</template>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Orbitron:wght@400;600&display=swap');

/* ====== SECCIÓN GENERAL ====== */
.datos-personales {
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 3rem 1rem;
  min-height: 100vh;
  background: transparent; /* SIN FONDO */
  font-family: 'Orbitron', sans-serif;
  color: #e8f0ff;
}

/* ====== CARD PRINCIPAL ====== */
.card {
  background: transparent; /* SIN FONDO */
  border: 1px solid rgba(0, 255, 213, 0.25);
  border-radius: 20px;
  box-shadow: 0 0 20px rgba(0, 255, 213, 0.15),
              inset 0 0 10px rgba(0, 255, 213, 0.1);
  padding: 2.5rem 3rem;
  max-width: 700px;
  text-align: center;
  transition: all 0.3s ease;
}

.card:hover {
  box-shadow: 0 0 25px rgba(0, 255, 213, 0.35),
              inset 0 0 12px rgba(0, 255, 213, 0.25);
  transform: translateY(-4px);
}

/* ====== FOTO DE PERFIL ====== */
.perfil {
  display: flex;
  justify-content: center;
  margin-bottom: 1.5rem;
}

.foto-perfil {
  width: 160px;
  height: 160px;
  object-fit: cover;
  border-radius: 50%;
  border: 2px solid rgba(0, 255, 213, 0.4);
  box-shadow: 0 0 20px rgba(0, 255, 213, 0.4),
              0 0 40px rgba(0, 255, 213, 0.2);
  transition: all 0.4s ease;
}

.foto-perfil:hover {
  transform: scale(1.05);
  box-shadow: 0 0 30px rgba(0, 255, 213, 0.6),
              0 0 60px rgba(0, 255, 213, 0.3);
}

/* ====== TEXTOS ====== */
h1 {
  font-size: 2.4rem;
  color: #00fff0;
  text-shadow: 0 0 8px #00fff0, 0 0 16px #00e0ff;
  margin-bottom: 0.5rem;
}

h2 {
  font-size: 1.3rem;
  color: #a8cfff;
  font-weight: 400;
  margin-bottom: 1.5rem;
}

p {
  font-size: 1.1rem;
  color: #e0faff;
  line-height: 1.6;
  margin-bottom: 1.5rem;
}


/* ====== DETALLES ====== */
h3, h4 {
  color: #9cdfff;
  font-size: 1rem;
  margin-top: 1rem;
  letter-spacing: 1px;
}

h3 span {
  color: #00fff0;
}

/* ====== RESPONSIVE ====== */
@media (max-width: 768px) {
  .card {
    padding: 1.8rem;
  }

  .foto-perfil {
    width: 120px;
    height: 120px;
  }

  h1 {
    font-size: 2rem;
  }

  p {
    font-size: 1rem;
  }
}
</style>
