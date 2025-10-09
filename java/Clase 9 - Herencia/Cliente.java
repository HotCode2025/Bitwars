import java.util.Date;

public class Cliente extends Persona {
    // Atributos propios de Cliente
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip; // Variable de tipo boolean para "es VIP"

    // Constructor
    // Debe llamar al constructor de la clase padre (Persona) usando 'super()'
    public Cliente(String nombre, char genero, int edad, String direccion, 
                   int idCliente, Date fechaRegistro, boolean vip) {
        
        // Llamada al constructor de Persona (clase padre)
        super(nombre, genero, edad, direccion); 
        
        // Inicialización de los atributos propios de Cliente
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // Getters y Setters específicos para los atributos de Cliente

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    // Getter para boolean (por convención, se usa 'is' en lugar de 'get')
    public boolean isVip() {
        return vip;
    }

    // Setter
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    // Método para cambiar el estado VIP (operación adicional)
    // El diagrama solo sugiere un 'setVip' pero una función de registro es útil.
    public void registrarVip(boolean esVip) {
        this.vip = esVip;
        String estado = esVip ? "registrado como VIP" : "quitado el estado VIP";
        System.out.println("Cliente " + super.getNombre() + " ha sido " + estado);
    }


    // Sobrescritura del método toString para incluir los datos de Cliente
    @Override
    public String toString() {
        // Llama al toString de la clase padre (Persona) y añade los datos de Cliente
        return "Cliente{" +
               "idCliente=" + idCliente +
               ", fechaRegistro=" + fechaRegistro +
               ", vip=" + vip +
               ", datosPersona=" + super.toString() +
               '}';
    }
}