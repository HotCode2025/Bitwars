//let autos =new Array("Ferrari", "Renault", "BMW");
//esta es la sintaxis vieja
const autos = ["Ferrari", "Renault", "BMW"]; //para declararun arreglo
console.log(autos);

//Recorremos los elementos de un arreglo
console.log(autos[0]); //se accede desde el indice cero
console.log(autos[2]);

for(let i=0;i<autos.length; i++){
    console.log(i+":"+autos[i]);
}