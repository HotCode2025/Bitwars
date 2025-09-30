console.log(typeof miFuncion); // Devuelve el tipo de dato de la función
function miFuncionDos(a, b){
  console.log(arguments.length) // Devuelve la cantidad de argumentos de la función
};

miFuncionDos(5, 7, 2, 4);

var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);