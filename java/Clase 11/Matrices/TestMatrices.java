package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5; //Llenamos la matriz
        edades[0][1] = 7; //Es una diferente columna
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 2;
        edades[2][1] = 9;
        
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);
        
        System.out.println("Recorremos la matriz a través del ciclo for");
        
        for (int r = 0; r < edades.length; r++) { // r = renglones (filas)
            for (int c = 0; c < edades[r].length; c++) { // c = columnas
                System.out.println("edades " + r + "-" + c + ": " + edades[r][c]);
            }
        }
        
        //Sintaxis resumida o simplificada
        String frutas[][] = {{"Limón", "Pomelo"}, {"Banana", "Pera"}};
        
        imprimir(frutas); // Llamada al nuevo método
        
        //Matriz de Objetos
        Persona personas[][] = new Persona[2][2];
        personas[0][0] = new Persona("Ariel");
        personas[0][1] = new Persona("Liliana");
        personas[1][0] = new Persona("Osvaldo");
        personas[1][1] = new Persona("Felicia");
        
        System.out.println("Matriz personas:");
        imprimir(personas); // Llamada al nuevo método
    }
    
    // Método nuevo para imprimir cualquier matriz de tipo Object
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + "-" + j + ": " + matriz[i][j]);
            }
        }
    }
}