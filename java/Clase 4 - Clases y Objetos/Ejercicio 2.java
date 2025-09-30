public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //Llamamos al constructor
        persona1.nombre = "Francesco";
        persona1.apellido = "Cornachione";
        persona1.obtenerInformacion();
        
    }
}