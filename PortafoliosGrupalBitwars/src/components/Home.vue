<template>
  <section class="home">
    <div class="people-grid">
      <div v-for="p in people" :key="p.name" class="person-card" @click="selectPerson(p)">
        <img :src="p.img" :alt="p.name" class="person-photo" />
        <div class="person-name">{{p.name}}</div>
      </div>
    </div>

    <!-- Modal Flotante -->
    <transition name="modal">
      <div class="modal-backdrop" v-if="selectedPerson" @click.self="closeModal">
        <div class="modal-content">
          <button class="close-btn" @click="closeModal">&times;</button>
          <img :src="selectedPerson.img" :alt="selectedPerson.name" class="modal-photo" />
          <h2>{{selectedPerson.name}}</h2>
          <p>{{selectedPerson.role}}</p>
          <p>{{selectedPerson.bio}}</p>
        </div>
      </div>
    </transition>
  </section>
</template>

<script>
export default {
  data() {
    return {
      people:[
        { name:'María José Sela', role:'', bio:'María José Sela, 37 años, es una profesional residente en Malargüe, que fusiona su base como Ingeniera Química y Docente con la programación. Se encuentra cursando la Tecnicatura en Programación (UTN), enfocada en aplicar el rigor científico al desarrollo de sistemas', img:'/src/assets/Foto1.jpg' },
        { name:'Franchesco Cornachione', role:'', bio:'Soy un Ingeniero de Datos apasionado por transformar datos en soluciones reales. Manejo herramientas como PySpark, Airflow, Power BI, DuckDB y AWS, siempre buscando optimizar pipelines y mejorar la calidad de los datos.', img:'/src/assets/WhatsApp Image 2025-11-09 at 20.36.29.jpeg' },
        { name:'Pablo Garcia', role:'', bio:'Estudiante de Tecnicatura en Programación. Apasionado por el código , la tecnología y la resolución de problemas. Actualmente busco aplicar mis conocimientos y crecer profesionalmente en el desarrollo de software.', img:'/src/assets/WhatsApp Image 2025-11-09 at 23.42.11.jpeg' },
        { name:'Valentin Castillo', role:'', bio:'Tecnicatura en Programación — UTN."Desarrollador y entusiasta del software, siempre explorando nuevas tecnologías y aprendiendo a crear soluciones eficientes."', img:'/src/assets/WhatsApp Image 2025-11-09 at 23.26.25.jpeg' },
        { name:'Tomás Vilche', role:'', bio:'Tecnicatura en Programación — UTN 21 años . Ensambaldor de pc. Creador de contenido. Trader. Especialista en finzas digitales (Criptomonedas)', img:'/src/assets/img_neon.png' }
      ],
      selectedPerson: null
    }
  },
  methods: {
    selectPerson(person) {
      this.selectedPerson = person
    },
    closeModal() {
      this.selectedPerson = null
    }
  }
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Press+Start+2P&display=swap');

/* GRID CONTROLADA: 3 arriba, 2 abajo */
.people-grid {
  display: grid;
  grid-template-columns: repeat(3, 1fr); 
  grid-template-rows: repeat(2, 1fr); 
  gap: 30px;
  padding: 40px;
  justify-items: center; 
  align-items: start; /* asegura alineación superior */
}

/* TARJETAS UNIFORMES */
.person-card {
  background: #1a1a1a;
  border: 2px solid #9b5cff;
  border-radius: 16px;
  text-align: center;
  width: 180px;  /* ancho fijo */
  height: 220px; /* alto fijo */
  padding: 20px;
  cursor: pointer;
  transition: transform 0.3s, box-shadow 0.3s;
  display: flex;
  flex-direction: column;
  justify-content: center; /* centra contenido verticalmente */
  align-items: center;
}

.person-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 0 20px #9b5cff;
}

.person-photo {
  width: 120px;
  height: 120px;
  border-radius: 50%;
  object-fit: cover;
  filter: drop-shadow(0 0 8px #9b5cff);
}

.person-name {
  margin-top: 12px;
  font-family: 'Press Start 2P', cursive;
  font-size: 14px;
  color: #fff;
}

/* MODAL */
.modal-backdrop {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,0.85);
  display: flex;
  justify-content: center;
  align-items: center;
  z-index: 100;
}

.modal-content {
  background: #0d1117;
  border: 2px solid #42b883;
  border-radius: 16px;
  padding: 40px;
  width: 90%;
  max-width: 600px;
  text-align: center;
  position: relative;
  color: #fff;
  animation: popIn 0.3s ease;
}

.modal-photo {
  width: 160px;
  height: 160px;
  border-radius: 50%;
  object-fit: cover;
  margin-bottom: 20px;
  border: 2px solid #42b883;
  filter: drop-shadow(0 0 8px #42b883);
}

.close-btn {
  position: absolute;
  top: 10px;
  right: 15px;
  background: none;
  border: none;
  font-size: 28px;
  color: #fff;
  cursor: pointer;
}

/* ANIMACIONES */
@keyframes popIn {
  0% { transform: scale(0.8); opacity: 0; }
  100% { transform: scale(1); opacity: 1; }
}

.modal-enter-active, .modal-leave-active {
  transition: opacity 0.3s;
}
.modal-enter, .modal-leave-to {
  opacity: 0;
}
</style>
