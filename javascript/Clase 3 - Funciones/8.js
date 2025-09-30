// Sumar todos los argumentos
let respuesta = sumarTodo(2, 4, 6, 8, 10, 12);
console.log(respuesta);

function sumarTodo(){
  let suma = 0;
  for(let i = 0; i < arguments.length; i++){
    suma += arguments[i]; //Arguments es para arreglos
  }
  return suma;
}