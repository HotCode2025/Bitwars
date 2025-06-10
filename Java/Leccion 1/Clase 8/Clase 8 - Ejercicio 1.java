
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

        

      