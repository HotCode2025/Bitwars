<template>
  <section class="contactos">
    <div class="contact-item" v-for="p in people" :key="p.name">
      <img :src="p.img" :alt="p.name" class="contact-photo" />
      <div class="contact-info">
        <div class="name">{{p.name}}</div>
        <div class="bio">{{p.bio}}</div>
        <div class="icons">
          <a :href="`https://wa.me/${p.whatsapp || ''}`" target="_blank" title="WhatsApp" class="icon-btn whatsapp">
            <i class="fab fa-whatsapp"></i>
          </a>
          <a :href="`mailto:${p.email || ''}`" target="_blank" title="Email" class="icon-btn email">
            <i class="fas fa-envelope"></i>
          </a>
          <a :href="`https://instagram.com/${p.instagram || ''}`" target="_blank" title="Instagram" class="icon-btn insta">
            <i class="fab fa-instagram"></i>
          </a>
        </div>
      </div>
    </div>
  </section>
</template>

<script>
export default {
  data() {
    return {
      people: [
        { name:'María José Sela', bio:'', img:'/src/assets/Foto1.jpg', whatsapp:'+542604320053', Gmail:'mselaalias@gmail.com', instagram:'maria_insta' },
        { name:'Franchesco Cornachione', bio:'', img:'/src/assets/WhatsApp Image 2025-11-09 at 20.36.29.jpeg', whatsapp:'+542604631867', Gmail:'francescocornachione681@gmail.com', instagram:'franchesco_insta' },
        { name:'Pablo Garcia', bio:'', img:'/src/assets/WhatsApp Image 2025-11-09 at 23.42.11.jpeg', whatsapp:'+542604617372', Gmail:'pablo.d.garcia21@gmail.com', instagram:'pablo_insta' },
        { name:'Valentin Castillo', bio:'', img:'/src/assets/WhatsApp Image 2025-11-09 at 23.26.25.jpeg', whatsapp:'+542604038884', Gmail:'colocross97@gmail.com', instagram:'valentin_insta' },
        { name:'Tomás Vilche', bio:'', img:'/src/assets/img_neon.png', whatsapp:'+542604267904', Gmail:'agustinvilchebaron@gmail.com', instagram:'vilche_tomas' }
      ]
    }
  }
}
</script>

<style scoped>
@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css');
@import url('https://fonts.googleapis.com/css2?family=Press+Start+2P&display=swap');

.contactos {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  grid-auto-rows: auto;
  gap: 25px;
  padding: 40px;
  justify-items: center;
}

/* Centrar las dos últimas cards */
.contact-item:nth-child(4),
.contact-item:nth-child(5) {
  justify-self: center;
}

.contact-item {
  background: #111;
  border: 2px solid #9b5cff;
  border-radius: 16px;
  padding: 25px;
  text-align: center;
  transition: transform 0.4s, box-shadow 0.4s;
  cursor: pointer;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 15px;
  width: 220px;
}

.contact-item:hover {
  transform: translateY(-6px);
  box-shadow: 0 0 25px #9b5cff, 0 0 40px #66d1ff;
}

.contact-photo {
  width: 100px;
  height: 100px;
  border-radius: 50%;
  object-fit: cover;
  border: 3px solid #9b5cff;
  filter: drop-shadow(0 0 10px #9b5cff);
}

.contact-info .name {
  font-family: 'Press Start 2P', cursive;
  font-size: 14px;
  color: #fff;
  text-shadow: 0 0 10px #9b5cff;
}

.contact-info .bio {
  font-size: 10px;
  color: #aaa;
  margin-bottom: 10px;
}

.icons {
  display: flex;
  justify-content: center;
  gap: 15px;
}

.icon-btn {
  width: 36px;
  height: 36px;
  display: flex;
  justify-content: center;
  align-items: center;
  background: #111;
  border-radius: 50%;
  border: 2px solid #9b5cff;
  transition: transform 0.3s, box-shadow 0.3s, background 0.3s;
  font-size: 16px;
  color: #fff;
}

.icon-btn:hover {
  transform: scale(1.3) rotate(-10deg);
  background: #9b5cff;
  color: #111;
  box-shadow: 0 0 12px #9b5cff, 0 0 20px #66d1ff;
}

.icon-btn.whatsapp:hover { box-shadow: 0 0 12px #25d366, 0 0 20px #66ff99; background: #25d366; color: #111; }
.icon-btn.email:hover { box-shadow: 0 0 12px #f39c12, 0 0 20px #ffc107; background: #f39c12; color: #111; }
.icon-btn.insta:hover { box-shadow: 0 0 12px #e1306c, 0 0 20px #ff66a3; background: #e1306c; color: #fff; }
</style>
