package integrador3;


  //Representa una cuenta de usuario con saldo y contraseña.
  //Versión simplificada usando 'double' para el saldo.
 
public class Usuario {
    
    // Variables de instancia
    private String nombreUsuario;
    private String contrasena; 
    private double saldo; // Usamos double

    public Usuario(String nombreUsuario, String contrasena, double saldoInicial) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.saldo = saldoInicial;
    }

    //  Métodos de Lógica 
    
    public boolean verificarContrasena(String passwordIngresada) {
        return this.contrasena.equals(passwordIngresada);
    }
    
    public boolean depositar(double monto) {
        if (monto > 0) { 
            this.saldo = this.saldo + monto;
            return true;
        }
        return false;
    }

    public boolean retirar(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo = this.saldo - monto;
            return true;
        }
        return false;
    }

   
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public double getSaldo() {
        return saldo;
    }
}