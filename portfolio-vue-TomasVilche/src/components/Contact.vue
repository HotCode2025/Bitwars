<template>
  <section class="contact-section cyberpunk">
    <div class="container">
      <h2 class="glitch" data-text="CONTACTO">CONTACTO</h2>
      <p class="subtitle">Conectemos en la red. Tu mensaje es mi próximo dato.</p>

      <div class="contact-grid">
        <a 
          href="https://wa.me/542604267904" 
          class="contact-card cyberpunk-card whatsapp-neon" 
          title="WhatsApp - Enviame un mensaje" 
          target="_blank" 
          rel="noopener noreferrer"
        >
          <div class="card-content">
            <i class="fa-brands fa-whatsapp whatsapp-icon-neon"></i>
            <h3 class="card-title">CHAT CONMIGO</h3>
            <span class="card-info">Envía un mensaje neural.</span>
          </div>
          <div class="card-glow"></div>
        </a>
      </div>
    </div>
  </section>
</template>

<script setup>
// No se necesita script
</script>

<style scoped>
/* Colores y Variables Cyberpunk */
:root {
  --cyber-primary: #00FFFF; /* Aqua Neón */
  --cyber-secondary: #FF00FF; /* Magenta Neón */
  --cyber-dark-bg: #1a0a2e; /* Fondo oscuro casi negro-púrpura */
  --cyber-light-bg: #2d0e4a; /* Fondo más claro para elementos */
  --cyber-text-color: #E0E0E0; /* Texto claro */
  --cyber-border-glow: rgba(0, 255, 255, 0.7);
  --cyber-shadow-glow: rgba(255, 0, 255, 0.4);
}

/* Base de la sección de contacto */
.contact-section.cyberpunk {
  padding: 8rem 2rem;
  text-align: center;
  background-color: var(--cyber-dark-bg);
  min-height: calc(100vh - 80px); /* Ajusta si tu header tiene otra altura */
  display: flex;
  align-items: center;
  justify-content: center;
  overflow: hidden; /* Para efectos de neón y fondo */
  position: relative;
  font-family: 'Share Tech Mono', monospace; /* Una fuente que le da toque tech */
}

/* Asegúrate de que Font Awesome está cargado, si no, puedes necesitar otra fuente para los íconos */

.container {
  max-width: 800px;
  margin: 0 auto;
  z-index: 10; /* Para que el contenido esté por encima de los efectos de fondo */
  position: relative;
}

/* Título estilo Glitch */
.glitch {
  font-family: 'Orbitron', sans-serif; /* Otra fuente cyberpunk popular */
  font-size: 4rem;
  font-weight: 700;
  color: var(--cyber-primary);
  text-shadow: 
    0 0 10px var(--cyber-primary),
    0 0 20px var(--cyber-primary),
    0 0 30px var(--cyber-secondary);
  animation: glitch 2.5s infinite alternate;
  position: relative;
  margin-bottom: 1rem;
}

.glitch::before,
.glitch::after {
  content: attr(data-text);
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: var(--cyber-dark-bg);
  overflow: hidden;
  clip: rect(0, 900px, 0, 0);
  text-shadow: 0 0 10px var(--cyber-primary);
}

.glitch::before {
  left: -2px;
  text-shadow: 0 0 10px var(--cyber-secondary);
  animation: glitch-left 3s infinite alternate-reverse;
}

.glitch::after {
  left: 2px;
  text-shadow: 0 0 10px var(--cyber-primary);
  animation: glitch-right 3s infinite alternate;
}

@keyframes glitch {
  0% { transform: translate(0); }
  20% { transform: translate(-2px, 2px); }
  40% { transform: translate(-2px, -2px); }
  60% { transform: translate(2px, 2px); }
  80% { transform: translate(2px, -2px); }
  100% { transform: translate(0); }
}

@keyframes glitch-left {
  0% { clip: rect(40px, 9999px, 80px, 0); }
  25% { clip: rect(10px, 9999px, 60px, 0); }
  50% { clip: rect(70px, 9999px, 120px, 0); }
  75% { clip: rect(20px, 9999px, 90px, 0); }
  100% { clip: rect(40px, 9999px, 80px, 0); }
}

@keyframes glitch-right {
  0% { clip: rect(80px, 9999px, 40px, 0); }
  25% { clip: rect(60px, 9999px, 10px, 0); }
  50% { clip: rect(120px, 9999px, 70px, 0); }
  75% { clip: rect(90px, 9999px, 20px, 0); }
  100% { clip: rect(80px, 9999px, 40px, 0); }
}


.subtitle {
  font-family: 'Share Tech Mono', monospace;
  font-size: 1.2rem;
  color: var(--cyber-text-color);
  margin-bottom: 4rem;
  text-shadow: 0 0 5px rgba(0, 255, 255, 0.5);
}

.contact-grid {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 2rem; /* Por si en el futuro agregas más cards */
}

/* Estilo de la tarjeta única de WhatsApp */
.cyberpunk-card {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  padding: 4rem;
  background: linear-gradient(135deg, var(--cyber-light-bg) 0%, rgba(45, 14, 74, 0.7) 100%);
  border-radius: 15px;
  position: relative;
  overflow: hidden;
  text-decoration: none;
  border: 2px solid var(--cyber-primary);
  box-shadow: 
    0 0 15px var(--cyber-primary), 
    inset 0 0 10px var(--cyber-primary);
  transition: all 0.4s cubic-bezier(0.25, 0.8, 0.25, 1);
  max-width: 450px;
  width: 100%;
}

.cyberpunk-card::before {
  content: '';
  position: absolute;
  top: -50%;
  left: -50%;
  width: 200%;
  height: 200%;
  background: linear-gradient(
    60deg, 
    rgba(0,255,255,0) 0%, 
    rgba(0,255,255,0.1) 50%, 
    rgba(0,255,255,0) 100%
  );
  transform: rotate(45deg);
  opacity: 0;
  transition: opacity 0.5s ease;
}

.cyberpunk-card:hover::before {
  opacity: 1;
  animation: card-hover-scanline 1s infinite linear;
}

@keyframes card-hover-scanline {
  0% { transform: translate(-100%, -100%) rotate(45deg); opacity: 0.5; }
  100% { transform: translate(100%, 100%) rotate(45deg); opacity: 0; }
}


.cyberpunk-card:hover {
  transform: translateY(-8px) scale(1.02);
  border-color: var(--cyber-secondary);
  box-shadow: 
    0 0 25px var(--cyber-secondary), 
    inset 0 0 15px var(--cyber-secondary);
}

.card-content {
  position: relative;
  z-index: 2; /* Para que el contenido esté por encima del glow */
  display: flex;
  flex-direction: column;
  align-items: center;
}

/* Icono de WhatsApp con Neón */
.whatsapp-icon-neon {
  font-size: 6rem; /* Ícono más grande */
  color: #25D366; /* Verde WhatsApp original */
  text-shadow: 
    0 0 10px #25D366,
    0 0 20px #25D366,
    0 0 30px #25D366,
    0 0 40px #25D366;
  margin-bottom: 2rem;
  animation: pulsate-whatsapp 2s infinite alternate;
}

@keyframes pulsate-whatsapp {
  0% { text-shadow: 0 0 10px #25D366, 0 0 20px #25D366; }
  100% { text-shadow: 0 0 20px #25D366, 0 0 35px #25D366, 0 0 50px #25D366; }
}


.card-title {
  font-family: 'Orbitron', sans-serif;
  font-size: 2.2rem;
  color: var(--cyber-primary);
  text-shadow: 0 0 10px var(--cyber-primary);
  margin-bottom: 0.75rem;
  letter-spacing: 2px;
}

.card-info {
  font-family: 'Share Tech Mono', monospace;
  font-size: 1.1rem;
  color: var(--cyber-text-color);
  text-shadow: 0 0 5px var(--cyber-secondary);
  opacity: 0.8;
}

/* Efecto de GLOW detrás de la tarjeta */
.card-glow {
  position: absolute;
  top: 50%;
  left: 50%;
  width: 90%;
  height: 90%;
  background: radial-gradient(circle, var(--cyber-secondary) 0%, rgba(255, 0, 255, 0) 70%);
  filter: blur(40px);
  transform: translate(-50%, -50%) scale(0.8);
  opacity: 0.3;
  transition: transform 0.4s ease, opacity 0.4s ease;
  z-index: 1;
}

.cyberpunk-card:hover .card-glow {
  transform: translate(-50%, -50%) scale(1.1);
  opacity: 0.6;
}

/* Media Queries para responsividad */
@media (max-width: 768px) {
  .glitch {
    font-size: 2.8rem;
  }
  .subtitle {
    font-size: 1rem;
  }
  .cyberpunk-card {
    padding: 3rem 2rem;
  }
  .whatsapp-icon-neon {
    font-size: 5rem;
  }
  .card-title {
    font-size: 1.8rem;
  }
  .card-info {
    font-size: 1rem;
  }
}

@media (max-width: 480px) {
  .glitch {
    font-size: 2rem;
  }
  .subtitle {
    font-size: 0.9rem;
  }
  .cyberpunk-card {
    padding: 2.5rem 1.5rem;
    max-width: 90%;
  }
  .whatsapp-icon-neon {
    font-size: 4rem;
  }
  .card-title {
    font-size: 1.5rem;
  }
  .card-info {
    font-size: 0.9rem;
  }
}
</style>