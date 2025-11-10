package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final int miDni = 39555278;
        System.out.println("miDni = " + miDni);
        //miDni = 20312321; // No se puede modificar
        
        //Persona.CONSTANTE_AQUI = 9; //No se modifica
        System.out.println("Mi atributo constante es: "+Persona.CONSTANTE_AQUI);
        
        final Persona personal = new Persona();
        //personal = new Persona(); //No se puede asignar una nueva referencia
        
        personal.setNombre("Ariel Betancud");
        System.out.println("personal nombre: "+personal.getNombre());
        personal.setNombre("Liliana");
        System.out.println("personal nombre: "+personal.getNombre());
    }
}