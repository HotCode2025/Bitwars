<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import Educacion from './components/EducacionComponente.vue';
import ProyectosComponente from './components/ProyectosComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
</script>

<template>
    <div class="main-container">
        <div class="grid-pattern"></div>
        <header id="top">
            <NavBar />
            <DatosPersonales />
        </header>
        <main>
            <section id="educacion">
                <h2>Certificaciones</h2>
                <Educacion />
            </section>
            <section id="proyectos">
                <h2>Proyectos</h2>
                <ProyectosComponente />
            </section>
            <section id="habilidades">
                <h2>Habilidades</h2>
                <HabilidadesComponente />
            </section>
        </main>
        <footer>
            <a href="#top">Inicio</a>
            <p>© Francesco Cornachione - 2025</p>
        </footer>
    </div>
</template>

<style scoped>
:global(*) {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

:global(body) {
  background-color: #0f0f0f;
  color: #ddd;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
  width: 100%;
  overflow-x: hidden;
}

.main-container {
  min-height: 100vh;
  width: 100%;
  background-color: #0f0f0f;
  position: relative;
  color: white;
}

.grid-pattern {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 0;
  background-image: 
    linear-gradient(to right, #161616 1px, transparent 1px),
    linear-gradient(to bottom, #161616 1px, transparent 1px);
  background-size: 20px 20px;
}

header, main, footer {
  position: relative;
  z-index: 1;
  width: 100%;
}

section {
  background-color: transparent;
  padding: 3rem 1rem;
  margin: 0;
  border: none;
  width: 100%;
}

section h2 {
  margin-bottom: 2rem;
  color: #f1f1f1;
  text-align: center;
  font-size: 1.6rem;
  font-weight: 600;
}

footer {
  margin-top: 2rem;
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 2rem;
  flex-wrap: wrap;
  width: 100%;
}

main {
  background-color: transparent;
  width: 100%;
}

section + section {
  margin-top: 0;
  padding-top: 0;
}


</style>
