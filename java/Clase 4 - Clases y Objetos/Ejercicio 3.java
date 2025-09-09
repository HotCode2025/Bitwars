public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //Llamamos al constructor
        persona1.nombre = "Francesco";
        persona1.apellido = "Cornachione";
        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("Persona 1:" + persona1);
        System.out.println("Persona 2: " + persona2);
        persona2.nombre = "Osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion();
    }
}