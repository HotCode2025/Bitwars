let x = 10; // variable de tipo primitiva 
console.log(x.length); // undefined

let persona = {
    nombre: "Franco",
    apellido: "Gonzalez",
    email: "Frangonzalez@gmail.com",
    edad: 30,
    nombreCompleto: function(){
        return this.nombre + " " + this.apellido;
    }
};

console.log(persona.nombre); // Franco
console.log(persona.apellido); // Gonzalez
console.log(persona.email); // Frangonzalez@gmail.com
console.log(persona.edad); // 30
console.log(persona); // muestra todo el objeto completo
console.log(persona.nombreCompleto()); // Franco Gonzalez

// crear otro objeto con new Object()
let persona2 = new Object(); 
persona2.nombre = "juancruz";
persona2.direccion = "salada 777";
persona2.telefono = "2604777777";

console.log(persona2.telefono); // 2604777777

// for in -> recorre las propiedades del objeto
for (let propiedad in persona) {
    console.log(propiedad); // muestra las claves: nombre, apellido, email, edad, nombreCompleto
    console.log(persona[propiedad]); // muestra los valores correspondientes
}

persona.apellido = "colo"; //Cambiamos dinamicamente un valor del objeto 
delete persona.apellido; //Eliminamos el valor
console.log(persona); // { nombre: "Franco", email : "Frangonzalez@gmail.com" }
