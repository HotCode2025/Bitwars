
import java.util.Scanner;

public class HolaMundoo {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo desde Java");
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
         */
        //--------------------------------------------------------------------------------------------------------------------------------------------------

        //Var -inferencia de tipos de Java
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        //Para ejecutar = shift + f6
        
        //Reglas para definir una variable en Java
        
        var usuario = "Diego";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        
        //Ejercicio: Carecteres Especiales con Java
        var nombre = "Nazareno";
        System.out.println("`\nNueva linea: \n"+nombre); //Diagonal inversa y letra n
        System.out.println("Tabulador: \t"+nombre);//Tabulador un espacio para centrar
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroseso: \b\b"+nombre);//Caracter de Retroceso
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas dobles: \""+nombre+"\"");
         */
        //Clase Scanner
        /*Scanner entrada = new Scanner(System.in); 
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);
         */
        //---------------------------------------------------------------------------------------------------------------------------------------
        /*
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte:"+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte:"+ Byte.MAX_VALUE);
        
        
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short:"+ Short.MIN_VALUE);
        System.out.println("Valor maximo del Short:"+ Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int:"+ Integer.MIN_VALUE);
        System.out.println("Valor maximo del int:"+ Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del int:"+ Long.MIN_VALUE);
        System.out.println("Valor maximo del int:"+ Long.MAX_VALUE);
        
        
        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float:"+ Float.MIN_VALUE);
        System.out.println("El valor maximo de float:"+ Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de double:"+ Double.MIN_VALUE);
        System.out.println("El valor maximo de double:"+ Double.MAX_VALUE);
         */
        //-------------------------------------------------------------------------------------------------------------------------------------------
        /*
        //Inferencia de tipos var y tipos primitivos
        var numEntero = 20; //Las laterales sin punto automaticamente son tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //Automaticamente con el punto se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
         */
 /*
        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //Valor decimal del jurgo de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //UN caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
         char varCaracter1 = '\u0024'; //Indicamos a Java la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal1 = 36; //Valor decimal del jurgo de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo1 = '$'; //UN caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
         */
        //----------------------------------------------------------------------------------------------------------------------------------------------------
        /*
        //Tipos primitivos tipos booleanos
        var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool){
            System.out.println("La bandera es verde");
        }
        else{
            System.out.println("La bandera es roja");
        }
    
        
        //Algoritmo: ¿Es mayor de edad?
        var edad = 18; //Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; //Literal tener presente la inferencia de tipos
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
         */
 /*
        //Conversion de tipos primitivos
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        var entrada = new Scanner(System.in);
        System.out.println("Digite su edad:");
        edad = Integer.parseInt( entrada.nextLine());
        System.out.println("edad = " + edad);
         */
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " +  solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo entero de la division
        System.out.println("solucion = " + solucion); // 5/4
        
        if (num1 % 2 == 0)
            System.out.println("Es un numero Par");
        else
            System.out.println("Es un numero Impar");

         */
 /*
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; // Una operacion
        System.out.println("varNum3 = " + varNum3);
        
//     -=   *=  /=  %=
        varNum1 += 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 &= 6;
        System.out.println("varNum1 = " + varNum1);
         */
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
            //Operadores Unarios: Cambio de  Signo
          var varA = 7;
          var varB = -varA;
          System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);  // El resultado sera numero negativo
        
        // Operador de Negacion
        var varC = true; //Esta literal por default en Java es de tipo boolean
        var varD = !varC; //Aqui esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadore Unarios de Incremento: Preincremento
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //Simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad                                                                
        System.out.println("varF = " + varF); //Va a sumar uno
        
        //Postincremento (el simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++; //Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI); //La variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //Postdecremento
        var varK = 8;
        varL = varK--; //Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); //Aca va a decrementar en 1
        System.out.println("varL = " + varL);
         */
 /*
        //Operadores de igualdad y Relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum != bNum; // > >= < <= == !=
        System.out.println("gVar = " + gVar);

        if (bNum % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }
        
        var edad = 30;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
         */
         /*
        //Operador Condicional And
        var valorA = 10;
        var valorMinimo = 0; //rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establrcido");
        }
        
        var vacaciones = false;
        var diaLibre = true; 
        if(vacaciones  || diaLibre)
            System.out.println("Papa puede asistir al juego de su hijo");
        else
            System.out.println("Papa no puede asistir al juego de su hijo");
        */
          
         /*
        //Operador Ternario
        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es Par" : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);
        */
         /*
         var x = 5;
         var y = 10;
         var z = ++x + y--;
         System.out.println("x = " + x); // 6
         System.out.println("y = " + y); // 9
         System.out.println("z = " + z); // 16
         
         var solucionAritmetica = 4 + 5 * 6 / 3; // 4 + ((5 * 6) / 3) = 30 / 3 = 10 + 4 = 14
         System.out.println("solucionAritmetica = " + solucionAritmetica);
        
         solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
         System.out.println("solucionAritmetica = " + solucionAritmetica);
         */
         
         /*
         //Ejercicio 1 - Clase 8: Sacar área y perímetro de un rectángulo
          var entrada = new Scanner(System.in);
        System.out.println("Digite el alto del rectángulo en cm: ");
        double alto = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite el ancho del rectángulo en cm: ");
        double ancho = Double.parseDouble(entrada.nextLine());
        var area = alto * ancho;
        System.out.println("El área es: " + area + " cm²");
        var perimetro = (alto + ancho) * 2;
        System.out.println("El perímetro es: " + perimetro + " cm");
        */

        
        //Ejercicio 2 - Clase 8:  El mayor de dos números (Operador Ternario)
        var entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        double numero1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite otro numero: ");
        double numero2 = Double.parseDouble(entrada.nextLine());
        var resultado = (numero1 > numero2) ? "el primer numero es mayor que el segundo" : "el segundo numero es mayor que el primero";
        System.out.println("Resultado: " + resultado);
        
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    }
}
