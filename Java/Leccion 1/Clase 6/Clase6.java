
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
        
    