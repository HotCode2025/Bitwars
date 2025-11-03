<script setup>
import profile from '/src/assets/pfp.jpg'
import linkedin from '/src/assets/linkedin_icon.svg'
import github from '/src/assets/github_icon.svg'
import cv from '/src/assets/cv_icon.svg'

const title = 'Francesco Cornachione'
const descripcion = 'Data Engineer'
const presentacion = 'Soy un Ingeniero de Datos apasionado por transformar datos en soluciones reales. Manejo herramientas como PySpark, Airflow, Power BI, DuckDB y AWS, siempre buscando optimizar pipelines y mejorar la calidad de los datos.'
const redesSociales = [
  { id: 1, name: 'linkedin', src: linkedin, url: 'https://www.linkedin.com/in/francesco-cornachione/' },
  { id: 2, name: 'github', src: github, url: 'https://github.com/fran-cornachione' },
  { id: 3, name: 'cv', src: cv, url: '/cv_resume.pdf', download: 'Francesco_Cornachione_CV.pdf' }
]
</script>

<template>
  <section class="perfil-section">
    <div class="perfil-card">
      <div class="perfil-left">
        <img :src="profile" alt="Foto de Francesco" class="perfil-img"/>
        <ul class="social-list">
          <li v-for="red in redesSociales" :key="red.id">
            <a :href="red.url" target="_blank" rel="noopener noreferrer">
              <img class="icon-redsocial" :src="red.src" :alt="red.name"/>
            </a>
          </li>
        </ul>
      </div>
      <div class="perfil-right">
        <h1>{{ title }}</h1>
        <h2>{{ descripcion }}</h2>
        <p>{{ presentacion }}</p>
      </div>
    </div>
  </section>
</template>

<style scoped>
.perfil-section {
  display: flex;
  justify-content: center;
  padding: 2rem;
}

.perfil-card {
  display: flex;
  background-color: #1b1b1b;
  border-radius: 15px;
  border: 1px solid #333;
  max-width: 900px;
  width: 100%;
  padding: 2rem;
  gap: 2rem;
}

.perfil-left {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 1.5rem;
}

.perfil-img {
  width: 200px;
  height: 200px;
  border-radius: 50%;
  object-fit: cover;
  border: 1px solid #333;
}

.social-list {
  display: flex;
  gap: 1rem;
  list-style: none;
  padding: 0;
  margin: 0;
}

.icon-redsocial {
  width: 40px;
  height: 40px;
  transition: transform 0.2s ease;
}

.icon-redsocial:hover {
  transform: scale(1.1);
}

.perfil-right {
  flex: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
  color: #aaa;
  text-align: left;
}

.perfil-right h1 {
  font-size: 2.2rem;
  color: #f1f1f1;
  text-align: left;
  width: 100%;
}

.perfil-right h2 {
  font-size: 1.3rem;
  color: #9bc3ff;
  margin-bottom: 1rem;
  text-align: left;
  width: 100%;
}

.perfil-right p {
  font-size: 1.1rem;
  line-height: 1.5;
  text-align: left;
  width: 100%;
}

/* Si sigue sin funcionar, prueba esto: */
.perfil-right h1,
.perfil-right h2,
.perfil-right p {
  text-align: left !important;
  align-self: flex-start;
}
</style>



