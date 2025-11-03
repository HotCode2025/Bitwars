<template>
  <nav class="navbar">
    <div class="navbar-menu">
      <ul>
        <a
          v-for="nav in navegacion"
          :key="nav.id"
          :href="nav.enlace"
          class="nav-item"
        >
          {{ nav.nombre }}
        </a>
      </ul>
    </div>
  </nav>
</template>

<script setup>
import { ref } from 'vue'

const navegacion = ref([
  { id: 1, nombre: 'Certificaciones', enlace: '#educacion' },
  { id: 2, nombre: 'Proyectos', enlace: '#proyectos' },
  { id: 4, nombre: 'Habilidades', enlace: '#habilidades' }
])
</script>

<style scoped>
.navbar {
  color: #f5f5f5;
  padding: 18px 40px;
  display: flex;
  justify-content: center;
}

.navbar-menu ul {
  display: flex;
  gap: 20px;
  list-style: none;
  margin: 0;
  padding: 0;
}

.nav-item {
  color: #ddd;
  text-decoration: none;
  padding: 7px 18px;
  border: 1px solid #333;
  border-radius: 10px;
  background-color: #222;
  transition: all 0.3s ease;
  font-weight: 500;
  font-size: 0.95rem;
}

.nav-item:hover {
  background-color: #333;
  color: #fff;
  border-color: #555;
  transform: translateY(-1px);
}

@media (max-width: 768px) {
  .navbar {
    padding: 15px 25px;
  }

  .navbar-menu ul {
    flex-wrap: wrap;
    gap: 10px;
    justify-content: center;
  }

  .nav-item {
    padding: 8px 14px;
    font-size: 0.9rem;
  }
}
</style>
