//Ejercicio para encontrar numeros pares
let parImpar = 10;
if(parImpar % 2 == 0){
    console.log("Es un numero PAR");
}
else{
    console.log("Es un numero IMPAR");
}

//Ejercicio: es mayor de edad
let edad = 18, adulto = 18;
if( edad >= adulto ){
    console.log("Usted es una pesona adulta");
}
else{
    console.log("Usted es una persona menor de edad")
}

//Ejercicio: Dentro de un rango
let dentrorango = 10; //aqui vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if( dentrorango >= valMin && dentrorango <= valMax){
    console.log("Esta dentro del rango establecido")
}
else{
    console.log("Esta fuera del rango establecido")
}

// Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Lepes"; una constante no puede ser modificada
console.log(apellido2)

//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = true, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir el juego de su hijo")
}
else{
    console.log("El padre No puede asistir al juego de su hijo")
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)
let numero = 12; 
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2)



//Convertir String a Numbrer
let miNumero = "21"; //Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //Esta es una funcion
console.log(typeof edad2);
//Funcion isNaN
if(isNaN(edad2)){ //No es un numero = is Not a Number(devuelve un resultado booleano)
    console.log("Esta variable no contiene solo numeros");
}
else{
    if (edad2 >= 18){
    console.log("Puede votar");
    }
    else{
        console.log("Muy joven para votar")
    }
}

//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);