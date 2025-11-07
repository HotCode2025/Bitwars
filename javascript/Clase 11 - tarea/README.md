function calculateTotalPrice(items) {
  return items.reduce((total, item) => total + item.price, 0);
}

function formatUserInput(input) {
  return input.trim().toLowerCase();
}

function validateEmailAddress(email) {
  const re = /^\S+@\S+\.\S+$/;
  return re.test(String(email).toLowerCase());
}

function convertToCamelCase(str) {
  return str.replace(/([-_][a-z])/ig, ($1) => {
    return $1.toUpperCase()
      .replace('-', '')
      .replace('_', '');
  });
}

function filterActiveUsers(users) {
  return users.filter(user => user.isActive);
}

function handleButtonClick() {
  console.log("Botón presionado.");
}

function onFormSubmit(event) {
  event.preventDefault(); 
  console.log("Formulario enviado.");
}

function toggleDarkMode() {
  document.body.classList.toggle('dark-mode');
}

function updateProgressBar(percentage) {
  const progressBar = document.getElementById('mi-progreso');
  if (progressBar) {
    progressBar.style.width = percentage + '%';
  }
}

async function createNewUser(userData) {
  console.log("Creando usuario...", userData);
}

async function fetchUserData(userId) {
  console.log(`Buscando usuario: ${userId}`);
}

async function updateUserProfile(userId, newData) {
  console.log(`Actualizando ${userId}...`, newData);
}

async function deleteUserAccount(userId) {
  console.warn(`Eliminando ${userId}...`);
}

function generateRandomId() {
  return Math.random().toString(36).slice(2, 9);
}

function formatCurrency(amount, currencyCode = 'USD', locale = 'en-US') {
  return new Intl.NumberFormat(locale, {
    style: 'currency',
    currency: currencyCode,
  }).format(amount);
}

function debounceSearch(func, delay = 300) {
  let timerId;
  return function(...args) {
    clearTimeout(timerId);
    timerId = setTimeout(() => {
      func.apply(this, args);
    }, delay);
  };
}

function sanitizeInput(input) {
  const div = document.createElement('div');
  div.textContent = input;
  return div.innerHTML;
}

function checkPermissions(user, permission) {
  return user?.permissions?.includes(permission) || false;
}