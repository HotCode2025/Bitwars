<script setup>
import proyecto1 from '/src/assets/multiple_etl.png';
import proyecto2 from '/src/assets/multiple_etl.png';
import proyecto3 from '/src/assets/multiple_etl.png';

import { ref } from 'vue';

const misProyectos = ref([
  {
    id: 1,
    src: proyecto1,
    titulo: "Multiple Source ETL",
    descripcion: "Este proyecto ETL extrae desde múltiples fuentes (AWS S3, MySQL, .CSV, .PARQUET files), los transforma, y los carga en Postgres, usando Polars",
    projectoLink: "https://github.com/fran-cornachione/Multiple_Source_ETL"
  },
  {
    id: 2,
    src: proyecto2,
    titulo: "CSV - S3 ETL",
    descripcion: "CSV to S3 ETL with Databricks",
    projectoLink: "https://github.com/fran-cornachione/DATABRICKS-AWS-ETL"
  },
  {
    id: 3,
    src: proyecto3,
    titulo: "Spotify ETL - Dashboard",
    descripcion: "Este proyecto extrae datos de la API de Spotify, realiza las transformaciones necesarias y guarda los resultados como archivos CSV en una carpeta de destino. Finalmente, genera paneles interactivos mediante Streamlit.",
    projectoLink: "https://github.com/fran-cornachione/SpotifyETL"
  }
])
</script>

<template>
  <div class="galeria">
    <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
      <img :src="proyecto.src" :alt="proyecto.titulo">
      <div class="proyecto-info">
        <h3>{{ proyecto.titulo }}</h3>
        <p>{{ proyecto.descripcion }}</p>
        <div class="proyecto-links">
          <a :href="proyecto.projectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">
            Ver Proyecto
          </a>
        </div>
      </div>
    </li>
  </div>
</template>

<style scoped>
.galeria {
  width: 100%;
  display: flex;
  flex-direction: column;
  gap: 25px;
  padding: 40px;
  justify-content: center;
  border-radius: 20px;
}

.proyecto {
  display: flex;
  flex-direction: row;
  align-items: center;
  background-color: #1b1b1b;
  border: 1px solid #333;
  border-radius: 16px;
  overflow: hidden;
  width: 100%;
  max-width: 900px;
  margin: 0 auto;
  transition: transform 0.25s ease, box-shadow 0.25s ease;
}

.proyecto:hover {
  transform: translateY(-5px);
}

.proyecto img {
  width: 45%;
  height: 100%;
  object-fit: cover;
  border-right: 1px solid #333;
}

.proyecto-info {
  flex: 1;
  padding: 30px;
  text-align: left;
}

.proyecto-info h3 {
  margin-bottom: 10px;
  font-size: 30px;
  color: #f0f0f0;
  font-weight: 600;
}

.proyecto-info p {
  font-size: 1em;
  color: #bbb;
  line-height: 1.6;
  margin-bottom: 25px;
}

.proyecto-links {
  display: flex;
  align-items: center;
  gap: 15px;
}

.btn-ver-mas {
  background-color: #444;
  color: #fff;
  padding: 10px 18px;
  border-radius: 8px;
  text-decoration: none;
  transition: background-color 0.3s;
  font-weight: 500;
}

.btn-ver-mas:hover {
  background-color: #555;
}

.github-link {
  color: #aaa;
  font-size: 0.9em;
  text-decoration: none;
  transition: color 0.3s;
}

.github-link:hover {
  color: #fff;
}
</style>

