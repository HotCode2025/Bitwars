
//Aplicando el uso de var let y const
/*
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
Un error es que se sobreescriba
*/

var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre);

function saludar(){
    var nombre3 = "Natalia";
    console.log(nombre3);
}
//console.log(nombre3); //Aqui no lee el dato en la funcion


if (true){
    var edad = 34;
    console.log(edad)
}
console.log(edad); //En la funcion funciono correctamente, en la estructrura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar2(){
    let nombre2 = "Ariel";
    console.log(nombre2);
}
console.log(nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}

//console.log(edad2);

/*
consr se utiliza para valores constantes que no pueden ser resignadas
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //solo se ejecura el console anterior

//----------------------------------------------------------------------------------------------------------------------------------------------------



//Ejercicio 1: Calcular la estacion del año
let mes = 4;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
        estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera"
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estacion de: "+estacion);


//Ejercicio 2: Hora del dia

let horaDia = 15;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening";   
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night";
} 
else{
    mensaje = "Valor incorrecto";
}
console.log(mensaje);

//Estructura switch(la sintaxis es igual a Java)
switch(mes){ //Solo se pueden utilizar numero,tambien cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estacion de: "+estacion);