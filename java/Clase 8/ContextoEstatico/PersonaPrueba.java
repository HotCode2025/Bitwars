package test;

import contextoestatico.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona personal = new Persona("Ariel");
        System.out.println("personal = " + personal);
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
    }
}