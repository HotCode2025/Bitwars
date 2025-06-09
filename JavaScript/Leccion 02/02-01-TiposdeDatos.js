//Tipos de Datos en JavaScript
/*
La sintaxis en lo que es comentarios 
es muy similar a la de Java
realmente diriamos que es identica
*/
var nombre = 'Valentin'; // Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3
console.log(typeof nombre);
//Tipo numerico
var numero = 3000; // Tipo numerico
console.log(numero);
//Tipo object
var objeto = {
    nombre : "Valentin",
    apellido : "Castillo",
    telefono : "2604038884"
}

console.log(typeof objeto);

// Tipo de dato booleano
var bandera = true;
console.log(bandera);

//Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

//Tipo de dato clase 
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido  = apellido;
    }
}

console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

// null: significa ausencia de valor
var y = null; //null es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

// Tipo de dato array y Empty String
var autos = ["Citroen","Audi","BMW","Ford"];
console.log(autos);
console.log(typeof autos); // Preguntamos que tipo de dato es:

var z = " ";
console.log(z); // Se refiere a que es una cadena vacia
console.log(typeof z);