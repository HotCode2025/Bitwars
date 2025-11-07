// Ejercicio 1: Función que valide una contraseña (mínimo 8 caracteres, 1 número, 1 mayúscula)
function validatePassword(password) {
    // 1. Chequear la longitud
    if (password.length < 8) {
        return false;
    }

    // 2. Chequear si contiene al menos un número (regex: /[0-9]/)
    const hasNumber = /[0-9]/.test(password);

    // 3. Chequear si contiene al menos una mayúscula (regex: /[A-Z]/)
    const hasUppercase = /[A-Z]/.test(password);

    // Devuelve true solo si ambas condiciones (número y mayúscula) se cumplen
    return hasNumber && hasUppercase;
}

console.log(validatePassword("Abc12345")); // true
console.log(validatePassword("weak")); // false
console.log(validatePassword("passwordlargo")); // false (falta número y mayúscula)
console.log(validatePassword("PASSWORD123")); // true
console.log(validatePassword("password123")); // false (falta mayúscula)