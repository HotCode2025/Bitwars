<template>
  <div class="contacto-container">
    <h3>Te dejo algunos datos para que podamos comunicarnos</h3>
    <h3>¡Contactame!</h3>

     <ul class="contact-info">
      <li>📧 <strong>Mi Correo:</strong> {{ email }}</li>
      <li>📍 <strong>Ubicación:</strong> {{ ubicacion }}</li>
    </ul>

    <div class="contact-buttons">
      <a
        href="https://www.instagram.com/coloo.castillo/"
        target="_blank"
        class="contact-btn instagram"
      >
        <img src="/src/assets/instagram_icon.svg" alt="Instagram" />
        Instagram
      </a>

      <a
        href="https://github.com/colo-castillo"
        target="_blank"
        class="contact-btn github"
      >
        <img src="/src/assets/github_icon.svg" alt="GitHub" />
        GitHub
      </a>

      <a
        href="https://wa.me/5492604038884"
        target="_blank"
        class="contact-btn whatsapp"
      >
        <img src="/src/assets/whatsappa.svg" alt="WhatsApp" />
        WhatsApp
      </a>
    </div>
  </div>
</template>

<script setup>
const email = 'colocross97@gmail.com'
const ubicacion = 'San Rafael, Mendoza, Argentina'
</script>

<style scoped>
.contacto-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 4rem 2rem;
  text-align: center;
  color: #fff;
}

/* ===== Título ===== */
.contacto-container h3 {
  font-size: 2rem;
  margin-bottom: 2rem;
  font-family: 'Orbitron', sans-serif;
  text-shadow: 0 0 10px #0ff;
}

/* ===== Info Personal ===== */
.contact-info {
  list-style: none;
  margin-bottom: 2rem;
  padding: 0;
  font-size: 1.2rem;
  font-family: 'Orbitron', sans-serif;
  text-align: center;
}

.contact-info li {
  margin-bottom: 0.8rem;
  text-shadow: 0 0 5px #00f0ff;
}

/* ===== Botones ===== */
.contact-buttons {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 1.5rem;
}

.contact-btn {
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 1rem 2rem;
  border-radius: 10px;
  text-decoration: none;
  font-size: 1.2rem;
  font-family: 'Orbitron', sans-serif;
  font-weight: bold;
  letter-spacing: 1px;
  transition: all 0.3s ease;
  box-shadow: 0 0 15px rgba(0, 255, 255, 0.5);
}

.contact-btn img {
  width: 25px;
  height: 25px;
}

/* ===== Colores personalizados ===== */
.instagram {
  background: linear-gradient(45deg, #f58529, #dd2a7b, #8134af);
  color: white;
}

.github {
  background: linear-gradient(45deg, #333, #111);
  color: #fff;
}

.whatsapp {
  background: linear-gradient(45deg, #25d366, #128c7e);
  color: white;
}

/* ===== Efecto hover ===== */
.contact-btn:hover {
  transform: translateY(-3px) scale(1.05);
  box-shadow: 0 0 25px rgba(0, 255, 255, 0.8);
}
</style>