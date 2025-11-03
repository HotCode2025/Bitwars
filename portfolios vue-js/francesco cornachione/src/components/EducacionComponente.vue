<template>
  <section class="certifications-section">
    <div class="certifications-list">
      <a v-for="cert in certifications" :key="cert.nombre" :href="cert.url" target="_blank" rel="noopener noreferrer" class="cert-card">
        <img :src="cert.icono" :alt="cert.nombre" class="cert-icon" />
        <div class="cert-info">
          <h3 class="cert-title">{{ cert.nombre }}</h3>
          <p class="cert-desc">{{ cert.descripcion }}</p>
        </div>
      </a>
    </div>
  </section>
</template>

<script setup>
const certifications = [
  {
    nombre: "Airflow 3 Fundamentals – Astronomer",
    descripcion: "Certficación de Apache Airflow 3, certificado por Astronomer.",
    icono: "src/components/icons/astronomer.svg",
    url: "https://www.credly.com/badges/90996be7-2594-4880-a99e-427061c71e1d/linked_in_profile"
  },
  {
    nombre: "SQL Advanced - HackerRank",
    descripcion: "Nivel de SQL avanzado, certificado por HackerRank.",
    icono: "src/components/icons/hackerrank.svg",
    url: "https://www.hackerrank.com/certificates/2d5ce4115c10"
  },
  {
    nombre: "Git Fundamentals",
    descripcion: "Comandos básicos de Git, certificado por Alura Latam.",
    icono: "src/assets/github_icon.svg",
    url: "https://app.aluracursos.com/certificate/7a81f47e-3c4d-4450-b451-98ccf1effa18?lang"
  },
];
</script>

<style scoped>
.certifications-section {
  color: #ddd;
  border-radius: 15px;
  padding: 3rem 0;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.section-title {
  font-size: 1.6rem;
  font-weight: 600;
  margin-bottom: 2rem;
  color: #e0e0e0;
}

.certifications-list {
  display: flex;
  flex-direction: column;
  gap: 1.5rem;
}

.cert-card {
  display: flex;
  align-items: center;
  background-color: #1b1b1b;
  border: 1px solid #333;
  border-radius: 12px;
  width: 650px;
  height: 200px;
  padding: 1.5rem;
  transition: background-color 0.2s ease, transform 0.2s ease;
  text-decoration: none;
  color: inherit;
  cursor: pointer;
}

.cert-card:hover {
  background-color: #222;
  transform: translateY(-3px);
}

.cert-icon {
  width: 120px;
  height: 120px;
  border-radius: 20px;
  object-fit: cover;
  background-color: #222;
  padding: 20px;
  margin-right: 1.5rem;
  flex-shrink: 0;
}

.cert-info {
  flex: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
}

.cert-title {
  font-size: 1.2rem;
  font-weight: 600;
  color: #f1f1f1;
  margin-bottom: 0.5rem;
}

.cert-desc {
  font-size: 0.95rem;
  color: #aaa;
  line-height: 1.4;
}
</style>


