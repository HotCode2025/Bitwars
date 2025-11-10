import { createRouter, createWebHistory } from 'vue-router'
import Home from './components/Home.vue'
import Projects from './components/Projects.vue'
import Languages from './components/Languages.vue'
import Contact from './components/Contact.vue'

const routes = [
  { path: '/', component: Home },
  { path: '/proyectos', component: Projects },
  { path: '/lenguajes', component: Languages },
  { path: '/contacto', component: Contact }
]

export default createRouter({
  history: createWebHistory(),
  routes
})
