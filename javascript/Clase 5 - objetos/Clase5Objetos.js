// --- Primitivos ---
let x = 10; // Variable primitiva (número)
console.log(x.length); // undefined (los primitivos no tienen propiedades como .length)

// --- Objeto Literal 'persona' ---
// Es la forma más común de crear un objeto.
let persona = {
    // Propiedades (pares clave-valor)
    nombre: "Franco",
    apellido: "Gonzalez",
    email: "Frangonzalez@gmail.com",
    edad: 30,
    idioma: "ES",

    // Método Getter: Se accede como si fuera una propiedad (sin paréntesis)
    // Obtiene (get) un valor, usualmente procesándolo.
    get lang() {
        return this.idioma.toUpperCase();
    },

    // Método Setter: Se usa para asignar un valor (con el signo =)
    // Establece (set) un valor, usualmente validándolo o procesándolo.
    set lang(lang) {
        this.idioma = lang.toUpperCase();
    },

    // Método tradicional: Es una función dentro de un objeto.
    // Necesita paréntesis () para ser llamado.
    nombreCompleto: function () {
        return this.nombre + " " + this.apellido;
    },

    // Otro Getter
    get nombreEdad() {
        return "El nombre es: "C" + this.nombre + ", Edad: " + this.edad;
    }
};

// --- Acceso al objeto 'persona' ---
console.log(persona.nombre); // Accede a la propiedad 'nombre'
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona); // Muestra el objeto completo
console.log(persona.nombreCompleto()); // Llama al método (requiere paréntesis)

// --- Objeto con 'new Object()' ---
// Es otra forma (menos común) de crear un objeto.
let persona2 = new Object();
// Se asignan las propiedades por fuera
persona2.nombre = "juancruz";
persona2.direccion = "ensalada 777";
persona2.telefono = "2604777777";

console.log(persona2.telefono);

// --- 'for...in': Recorrer propiedades ---
// Itera sobre todas las *claves* (nombres de propiedad) del objeto.
for (let propiedad in persona) {
    console.log(propiedad); // Muestra la clave (ej: "nombre", "apellido")
    console.log(persona[propiedad]); // Muestra el valor (ej: "Franco")
}

// --- Modificar y Eliminar Propiedades ---
persona.apellido = "colo"; // Sobrescribe el valor de 'apellido'
delete persona.apellido; // Elimina la propiedad 'apellido' del objeto
console.log(persona);

// --- Usando Get y Set ---
console.log(persona.nombreEdad); // Llama al getter 'nombreEdad' (sin paréntesis)
persona.lang = "en"; // Llama al setter 'lang' (asigna "en")
console.log("comenzamos con el metodo get para idiomas");
console.log(persona.lang); // Llama al getter 'lang' (devuelve "EN")

// --- Función Constructor (Molde para objetos) ---
function Persona3(nombre, apellido, email) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;

    // Se agrega un método DENTRO del constructor
    // Todos los objetos creados (padre, madre) tendrán este método.
    this.nombreCompleto = function() {
        return this.nombre + " " + this.apellido;
    }
}

// --- Uso de prototype ---
// 'prototype' permite agregar una propiedad a la *plantilla* (constructor)
// Afectará a TODOS los objetos creados (padre, madre, etc.)
Persona3.prototype.telefono = '2618383832'; // Valor por defecto para todos

// --- Creación de Instancias (Objetos) ---
// 'new' crea un objeto nuevo usando la plantilla 'Persona3'.
let padre = new Persona3('Luis', 'Lopez', 'lopezl@gmail.com');
// padre.nombre = 'Luis'; // Esta línea se modifica en el video 6

let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');

// Se llama al método 'nombreCompleto' de cada objeto
console.log(padre.nombreCompleto());
console.log(madre.nombreCompleto());

// Se puede sobrescribir el valor del prototipo para un objeto específico
madre.telefono = '5492618383832'; // 'madre' tendrá un teléfono diferente

console.log(padre.telefono); // Muestra '2618383832' (el valor del prototipo)
console.log(madre.telefono); // Muestra '5492618383832' (el valor propio que sobrescribió)


// --- Diferentes formas de crear objetos ---

// --- Caso 1: Objeto (Formal)
let miObjeto = new Object(); // Esta es una opcion formal
    
// --- Caso 2: Objeto (Recomendada)
let miObjeto2 = {}; // Esta opcion es breve y recomendada

// --- Caso 1: String (Formal)
let miCadena1 = new String('Hola'); // Sintaxis formal
    
// --- Caso 2: String (Recomendada)
let miCadena2 = 'Hola'; // Esta es la sintaxis simplificada y recomendada

// --- Caso 1: Número (Formal - No recomendable)
let miNumero = new Number(1); // Es formal no recomendable
    
// --- Caso 2: Número (Recomendada)
let miNumero2 = 1; // Sintaxis recomendada (crea un primitivo)

// --- Caso 1: Boolean (Formal)
let miBoolean = new Boolean(false); // Formal
    
// --- Caso 2: Boolean (Recomendada)
let miBoolean2 = false; // Sintaxis recomendada (crea un primitivo)

// --- Caso 1: Arreglo (Formal)
let miArreglo1 = new Array(); // Formal
    
// --- Caso 2: Arreglo (Recomendada)
let miArreglo2 = []; // Sintaxis recomendada

// --- Caso 1: Función (Formal)
let miFuncion1 = new function(){}; // Todo despues de new es considerado objeto
    
// --- Caso 2: Función (Recomendada)
let miFuncion2 = function(){}; // Notacion simplificada y recomendada


// --- Uso de .call() y .apply() ---
// Ambos permiten a un objeto "tomar prestado" un método de otro objeto.

// Objeto 'persona4' SÍ tiene el método 'nombreCompleto2'
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    // Este método recibe 'titulo' y 'telefono' como argumentos
    nombreCompleto2: function(titulo, telefono) {
        // 'this' se refiere al objeto que llama al método
        return titulo + ': ' + this.nombre + ' ' + this.apellido + ', ' + telefono;
    }
};

// Objeto 'persona5' NO tiene el método 'nombreCompleto2'
let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
};

// 1. Llamada normal: 'persona4' usa su propio método
console.log(persona4.nombreCompleto2('Lic.', '5492618484845'));

// 2. Llamada con .call():
// 'persona5' usa el método de 'persona4'
// .call() pasa los argumentos uno por uno, separados por comas.
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '5492618585856'));

// 3. Llamada con .apply():
// Es igual a .call(), pero pasa los argumentos en un ARREGLO.
let arreglo = ['Ing.', '5492618686865'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
