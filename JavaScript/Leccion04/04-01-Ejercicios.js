
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


//Evitar repetir tu codigo
//Dry don't repeat yourself
//let days = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo'];
let days = '1'

switch (days) {
    case '1':
        console.log('hoy es Lunes');
        break;
    case '2':
        console.log('hoy es Martes');
        break;
    case '3':
        console.log('hoy es Miercoles');
        break;
    case '4':
        console.log('hoy es Jueves');
        break;
    case '5':
        console.log('hoy es Viernes');
        break;
    case '6':
        console.log('hoy es Sabado');
        break;
    case '7':
        console.log('hoy es Domingo');
        break;
    default:
        break;
}

//Esta es la opcion mejorada

let days2 = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo'];

function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days[n-1];
}

console.log(getDay(5));


//Hacer un ejercicio similar al que estaa hecho, pero ahora con los
//meses del año, debes hacerlo con la estructura switch y luego con
//la funcion en la opcion mejorada

let month = 11;
switch (month) {
    case 1:
        console.log('Es Enero')
        break;
    case 2:
        console.log('Es Febrero')
        break;
    case 3:
        console.log('Es Marzo')
        break;
    case 4:
        console.log('Es Abril')
        break;
    case 5:
        console.log('Es Mayo')
        break;
    case 6:
        console.log('Es Junio')
        break;
    case 7:
        console.log('Es Julio')
        break;
    case 8:
        console.log('Es Agosto')
        break;
    case 9:
        console.log('Es Septiembre')
        break;
    case 10:
        console.log('Es Octubre')
        break;
    case 11:
        console.log('Es Noviembre')
        break;
    case 12:
        console.log('Es Diciembre')
        break;
    default:
        console.log("Error en el ingreso del mes del año");
        break;
}

//Opcion mejorada
let month2 = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
function getMonth(n) {
    if (n < 1 || n > 12) {
        throw new Error("out of range");
    }
    return month2[n-1];
}
console.log(getMonth(1));