<script setup>
import pythonIcon from '/src/components/icons/python.svg'
import sparkIcon from '/src/components/icons/spark.svg'
import polarsIcon from '/src/components/icons/polars.svg'
import duckdbIcon from '/src/components/icons/duckdb.svg'
import airflowIcon from '/src/components/icons/airflow.svg'
import powerbiIcon from '/src/components/icons/power_bi.svg'
import postgresIcon from '/src/components/icons/postgres.svg'
import mysqlIcon from '/src/components/icons/mysql.svg'
import gitIcon from '/src/components/icons/git.svg'

import { ref } from 'vue'

const habilidades = ref([
  {
    id: 1,
    nombre: 'Lenguajes de Programación',
    skills: [
      { id: 1, nombre: 'Python', icono: pythonIcon }
    ]
  },
  {
    id: 2,
    nombre: 'Herramientas de Datos',
    skills: [
      { id: 1, nombre: 'Airflow', icono: airflowIcon },
      { id: 2, nombre: 'Spark', icono: sparkIcon },
      { id: 3, nombre: 'Polars', icono: polarsIcon },
      { id: 4, nombre: 'DuckDB', icono: duckdbIcon },
      { id: 5, nombre: 'Power BI', icono: powerbiIcon }
    ]
  },
  {
    id: 3,
    nombre: 'Bases de Datos',
    skills: [
      { id: 1, nombre: 'PostgreSQL', icono: postgresIcon },
      { id: 2, nombre: 'MySQL', icono: mysqlIcon }
    ]
  },
  {
    id: 4,
    nombre: 'Control de Versiones',
    skills: [
      { id: 1, nombre: 'Git', icono: gitIcon }
    ]
  }
])
</script>

<template>
  <section class="skills-container">
    <div v-for="categoria in habilidades" :key="categoria.id" class="skills-category">
      <h3>{{ categoria.nombre }}</h3>
      <ul class="skills-list">
        <li v-for="skill in categoria.skills" :key="skill.id" class="skill-item">
          <img v-if="skill.icono" :src="skill.icono" :alt="skill.nombre" />
          <span>{{ skill.nombre }}</span>
        </li>
      </ul>
    </div>
  </section>
</template>

<style scoped>
.skills-container {
  background-color: #1a1a1a;
  border: #333 1px solid;
  padding: 3rem 2rem;
  border-radius: 20px;
  display: flex;
  flex-direction: column;
  gap: 2.5rem;
}

.skills-category h3 {
  color: #aaa;
  font-size: 1.3rem;
  font-weight: 600;
  margin-bottom: 1rem;
  padding-left: 10px;
}

.skills-list {
  display: flex;
  flex-wrap: wrap;
  gap: 15px;
  margin: 0;
  padding: 0;
  list-style: none;
}

.skill-item {
  display: flex;
  align-items: center;
  gap: 12px;
  background-color: #222;
  border-radius: 10px;
  border: #333 solid 1px;
  padding: 10px 16px;
  min-width: 200px;
  transition: transform 0.25s ease, background-color 0.25s ease;
}

.skill-item:hover {
  background-color: #2c2c2c;
  transform: translateY(-2px);
}

.skill-item img {
  width: 28px;
  height: 28px;
  display: block;
}

.skill-item span {
  color: #ccc;
  font-size: 0.95rem;
}

@media (max-width: 768px) {
  .skills-list {
    justify-content: center;
  }
  .skill-item {
    min-width: 160px;
  }
}
</style>

