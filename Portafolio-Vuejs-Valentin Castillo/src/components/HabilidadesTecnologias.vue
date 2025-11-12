<script setup>

</script>

<template>
  <div class="skills-contenedor">
    <div class="skills-categoria">
      <h3>Mis conocimientos</h3>
      <ul class="skills">
        <li class="skill">
          <img src= "/src/components/icons/git.svg" alt="GitHub" />
          <p>GitHub</p>
        </li>
        <li class="skill">
          <img src="/src/components/icons/html-css.svg" alt="Html-Css" />
          <p>HTML / CSS</p>
        </li>
        <li class="skill">
          <img src="/src/components/icons/java.svg" alt="Java" />
          <p>Java</p>
        </li>
        <li class="skill">
          <img src="/src/components/icons/js.svg" alt="Java Script" />
          <p>JavaScript</p>
        </li>
        <li class="skill">
          <img src="/src/components/icons/node.svg" alt="Node" />
          <p>Node</p>
        </li>
        <li class="skill">
          <img src="/src/components/icons/python.svg" alt="Python" />
          <p>Python</p>
        </li>
        <li class="skill">
          <img src="/src/components/icons/visual.svg" alt="Visual Studio Code" />
          <p>Visual Studio Code</p>
        </li>
        <li class="skill">
          <img src="/src/components/icons/vue.svg" alt="Vue" />
          <p>Vue</p>
        </li>
      </ul>
    </div>
  </div>
</template>

<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Orbitron:wght@400;600&display=swap");

/* ---------- CONTENEDOR GENERAL ---------- */
.skills-contenedor {
  min-height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background: transparent; /* 🟢 fondo eliminado */
  font-family: "Orbitron", sans-serif;
  padding: 3rem;
  color: #e0f7ff;
}

/* ---------- CATEGORÍA ---------- */
.skills-categoria {
  text-align: center;
  width: 100%;
  max-width: 1000px;
}

.skills-categoria h3 {
  font-size: 2.2rem;
  font-weight: 700;
  color: #00fff0;
  margin-bottom: 2rem;
  text-transform: uppercase;
  letter-spacing: 3px;
  text-shadow: 0 0 10px #00fff0, 0 0 25px #00e0ff;
}

/* ---------- GRID DE SKILLS ---------- */
.skills {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 40px;
  list-style: none;
  padding: 0;
  justify-items: center;
}

/* ---------- TARJETAS INDIVIDUALES ---------- */
.skill {
  position: relative;
  width: 160px;
  height: 160px;
  background: transparent;
  border-radius: 20px;
  border: 1px solid rgba(0, 255, 213, 0.2);
  box-shadow: 0 0 15px rgba(0, 255, 213, 0.2);
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  overflow: hidden;
  transition: all 0.4s ease;
  cursor: pointer;
}

/* ---------- EFECTO HOVER NEÓN ---------- */
.skill::before {
  content: "";
  position: absolute;
  inset: 0;
  border-radius: 20px;
  padding: 2px;
  background: linear-gradient(120deg, #00fff0, #007bff, #00e0ff);
  mask: linear-gradient(#000 0 0) content-box, linear-gradient(#000 0 0);
  -webkit-mask: linear-gradient(#000 0 0) content-box, linear-gradient(#000 0 0);
  -webkit-mask-composite: xor;
  mask-composite: exclude;
  opacity: 0;
  transition: opacity 0.4s ease;
}

.skill:hover::before {
  opacity: 1;
}

.skill:hover {
  transform: translateY(-8px);
  box-shadow: 0 0 25px rgba(0, 255, 213, 0.5);
}

/* ---------- IMAGEN ---------- */
.skill img {
  width: 70px;
  height: 70px;
  filter: drop-shadow(0 0 8px rgba(0, 255, 213, 0.5));
  transition: transform 0.3s ease, opacity 0.3s ease;
}

.skill:hover img {
  transform: scale(1.1);
  opacity: 0.9;
}

/* ---------- NOMBRE DE LA TECNOLOGÍA ---------- */
.skill p {
  margin-top: 12px;
  font-size: 1rem;
  font-weight: 600;
  color: #e0faff;
  text-shadow: 0 0 6px rgba(0, 255, 213, 0.6);
}

/* ---------- RESPONSIVE ---------- */
@media (max-width: 900px) {
  .skills {
    grid-template-columns: repeat(3, 1fr);
    gap: 30px;
  }
  .skill {
    width: 140px;
    height: 140px;
  }
}

@media (max-width: 600px) {
  .skills {
    grid-template-columns: repeat(2, 1fr);
  }
  .skill {
    width: 120px;
    height: 120px;
  }
  .skill img {
    width: 55px;
    height: 55px;
  }
  .skill p {
    font-size: 0.9rem;
  }
}
</style>
