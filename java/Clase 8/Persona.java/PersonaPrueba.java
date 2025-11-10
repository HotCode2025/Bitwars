package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona personal = new Persona("Osvaldo", 57.000, false);
        System.out.println("personal su nombre es: " + personal.getNombre());

        //Modificar a través de los métodos
        personal.setNombre("Juan Ignacio");

        //Estas líneas darían error porque el atributo es private:
        //personal.nombre = "Juan Ignacio"; //Ya no se puede utilizar
        //System.out.println("Nombre es: "+personal.nombre); //Error

        System.out.println("personal con su nombre modificado: " + personal.getNombre());
        System.out.println("personal el resultado para el sueldo: " + personal.getSueldo());
        System.out.println("personal para obtener el booleano: " + personal.isEliminado());

        //Tarea: Crear otro objeto de tipo Persona, asignar valores de manera inicial
        //y/imprimir, luego modificar sus valores y volver a imprimir

        // ---- NUEVO CÓDIGO AÑADIDO EN ESTE VIDEO ----
        System.out.println("personal: " + personal.toString());
        System.out.println("personal: " + personal);
        // ---------------------------------------------
    }
}