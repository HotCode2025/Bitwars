<script setup>
import NavBar from './components/NavBar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import ProyectosComponentes from './components/ProyectosComponentes.vue';
import HabilidadesTecnologias from './components/HabilidadesTecnologias.vue';
import MiContacto from './components/MiContacto.vue';
</script>

<template>
  <div class="app-container">
    <header id="top">
      <NavBar />
      <DatosPersonales />
    </header>

    <main>
      <section id="proyectos" class="section">
        <h2>Proyectos</h2>
        <ProyectosComponentes />
      </section>

      <section id="tecnologias" class="section">
        <h2>Tecnologías</h2>
        <HabilidadesTecnologias />
      </section>

      <section id="contacto" class="section">
        <h2>Contacto</h2>
        <MiContacto />
      </section>

    </main>
    

    <footer>
      <a href="#top">Inicio</a>
      <p>© Valentin Castillo - Portafolio web - UTN FRSR</p>
    </footer>
  </div>
</template>

<style>
/* ===== RESETEO GLOBAL ===== */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

/* ===== EVITA EL DESBORDE ===== */
html, body {
  width: 100%;
  height: 100%;
  overflow-x: hidden;
  background: radial-gradient(circle at top left, #021526, #031c3a 40%, #000000 90%);
}

/* ===== CONTENEDOR GENERAL ===== */
.app-container {
  min-height: 100vh;
  width: 100%;
  color: #e8f0ff;
  font-family: 'Orbitron', sans-serif;
  display: flex;
  flex-direction: column;
  align-items: center;
  animation: backgroundMove 20s ease infinite;
}

/* ===== SECCIONES ===== */
.section {
  width: 100%;
  max-width: 1300px;
  padding: 3rem 1rem;
  margin: 0 auto;
}

/* ===== TITULOS ===== */
.section h2 {
  text-align: center;
  font-size: 2.5rem;
  margin-bottom: 2rem;
  text-transform: uppercase;
  letter-spacing: 3px;
  color: #00f0ff;
  text-shadow: 0 0 10px #00f0ff, 0 0 20px #0077ff;
}

/* ===== FOOTER ===== */
footer {
  width: 100vw; /* Ocupar todo el ancho visible */
  margin: 0;
  padding: 2rem 0;
  background: rgba(5, 10, 25, 0.85); /* Fondo translúcido tipo neón */
  backdrop-filter: blur(10px);
  color: #e8f0ff;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border-top: 1px solid rgba(0, 255, 255, 0.2);
  box-shadow: 0 0 20px #00f0ff20;
  font-family: 'Orbitron', sans-serif;
  text-align: center;
}

/* ===== LINK DE INICIO ===== */
footer a {
  color: #00f0ff;
  text-decoration: none;
  margin-bottom: 0.5rem;
  font-size: 1.2rem;
  transition: color 0.3s ease, text-shadow 0.3s ease;
}

footer a:hover {
  color: #00ffd5;
  text-shadow: 0 0 10px #00ffd5;
}

/* ===== TEXTO COPYRIGHT ===== */
footer p {
  margin: 0;
  font-size: 1rem;
  opacity: 0.85;
  letter-spacing: 1px;
}

/* ===== QUITA CUALQUIER SCROLL LATERAL ===== */
html, body {
  margin: 0;
  padding: 0;
  overflow-x: hidden;
}


/* ===== ANIMACIÓN DEL FONDO ===== */
@keyframes backgroundMove {
  0% { background-position: 0% 50%; }
  50% { background-position: 100% 50%; }
  100% { background-position: 0% 50%; }
}

</style>
