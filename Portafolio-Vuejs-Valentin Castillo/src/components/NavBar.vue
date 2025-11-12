<template>
  <nav class="navbar">
    <div class="navbar-container">
      <h1 class="navbar-title">Mi Portafolio</h1>

      <ul class="navbar-links">
        <li><a href="#top">Inicio</a></li>
        <li><a href="#proyectos">Proyectos</a></li>
        <li><a href="#tecnologias">Tecnologías</a></li>
        <li><a href="#contacto">Contacto</a></li>
      </ul>
    </div>
  </nav>
</template>

<style scoped>
/* ===== BARRA PRINCIPAL ===== */
.navbar {
  width: 100vw; /* Ocupar todo el ancho visible */
  background: rgba(5, 10, 25, 0.8);
  backdrop-filter: blur(10px);
  box-shadow: 0 0 20px #00f0ff80;
  border-bottom: 1px solid rgba(0, 255, 255, 0.2);
  position: fixed; /* Se mantiene arriba al hacer scroll */
  top: 0;
  left: 0;
  z-index: 1000;
}

/* ===== CONTENEDOR INTERNO ===== */
.navbar-container {
  width: 100%;
  max-width: 1300px;
  margin: 0 auto;
  padding: 1rem 2rem;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

/* ===== TÍTULO ===== */
.navbar-title {
  font-family: 'Orbitron', sans-serif;
  font-size: 1.8rem;
  color: #00f0ff;
  text-shadow: 0 0 10px #00f0ff, 0 0 20px #0077ff;
  letter-spacing: 2px;
}

/* ===== LINKS ===== */
.navbar-links {
  list-style: none;
  display: flex;
  gap: 2rem;
}

.navbar-links li a {
  color: #e8f0ff;
  text-decoration: none;
  font-family: 'Orbitron', sans-serif;
  font-size: 1rem;
  transition: color 0.3s ease, text-shadow 0.3s ease;
}

.navbar-links li a:hover {
  color: #00f0ff;
  text-shadow: 0 0 8px #00f0ff;
}

/* ===== RESPONSIVE ===== */
@media (max-width: 768px) {
  .navbar-container {
    flex-direction: column;
    gap: 1rem;
  }

  .navbar-links {
    flex-direction: column;
    align-items: center;
  }
}
</style>
