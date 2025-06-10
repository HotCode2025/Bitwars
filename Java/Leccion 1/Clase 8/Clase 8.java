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

        //Ejercicio 2 - Clase 8:  El mayor de dos números (Operador Ternario)
        var entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        double numero1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite otro numero: ");
        double numero2 = Double.parseDouble(entrada.nextLine());
        var resultado = (numero1 > numero2) ? "el primer numero es mayor que el segundo" : "el segundo numero es mayor que el primero";
        System.out.println("Resultado: " + resultado);
        

      