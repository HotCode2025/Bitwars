package integrador3;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;



 
public class Integrador3 {

    private final Map<String, Usuario> usuarios = new HashMap<>();

    public static void main(String[] args) {
        Integrador3 app = new Integrador3();
        app.iniciarAplicacion();
    }
    
    public void iniciarAplicacion() {
        boolean salir = false;
        Usuario usuarioLogueado = null;
        
        while (!salir) {
            
            if (usuarioLogueado == null) {
                String menuAcceso = "Elija una opción:\n1. REGISTRARSE\n2. INICIAR SESIÓN\n3. SALIR";
                String opcion = JOptionPane.showInputDialog(null, menuAcceso, "Menú Principal", JOptionPane.QUESTION_MESSAGE);
                
                if (null == opcion) {
                    salir = true;
                } else switch (opcion) {
                    case "3":
                        salir = true;
                        break;
                    case "1":
                        handleRegistro();
                        break;
                    case "2":
                        usuarioLogueado = handleLogin();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                        break;
                }
            } 
            else {
                usuarioLogueado = mostrarMenuOperaciones(usuarioLogueado);
            }
        }
        JOptionPane.showMessageDialog(null, "Aplicación cerrada. ¡Adiós!");
    }

    // Lógica de Registro 
    private void handleRegistro() {
        String user = JOptionPane.showInputDialog("Ingrese un nuevo usuario:");
        String pass = JOptionPane.showInputDialog("Ingrese una contraseña:");
        String passConfirm = JOptionPane.showInputDialog("Confirme la contraseña:");

        if (user == null || pass == null || passConfirm == null) return; 

        if (user.trim().isEmpty() || pass.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El usuario y la contraseña no pueden estar vacíos.");
        } else if (usuarios.containsKey(user)) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe.");
        } else if (!pass.equals(passConfirm)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
        } else {
            Usuario nuevoUsuario = new Usuario(user, pass, 0.0);
            this.usuarios.put(user, nuevoUsuario);
            // CAMBIO: Mensaje sin símbolos
            JOptionPane.showMessageDialog(null, "Registro exitoso. Ahora puedes iniciar sesión.");
        }
    }
    
    // ógica de Login 
    private Usuario handleLogin() {
        int intentos = 3;
        while (intentos > 0) {
            String user = JOptionPane.showInputDialog("Ingrese su usuario:");
            String pass = JOptionPane.showInputDialog("Ingrese su contraseña:");
            
            if (user == null || pass == null) return null;

            Usuario usuario = this.usuarios.get(user); 

            if (usuario != null && usuario.verificarContrasena(pass)) {
                return usuario;
            } else {
                intentos--;
                
                String msg;
                if (intentos > 0) {
                    // CAMBIO: Mensaje sin símbolos
                    msg = "Usuario o contraseña incorrectos. Intentos restantes: " + intentos;
                } else {
                    // CAMBIO: Mensaje sin símbolos
                    msg = "Acceso bloqueado. Ha agotado sus intentos.";
                }
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        return null;
    }

    // Menú de Operaciones 
    private Usuario mostrarMenuOperaciones(Usuario usuario) {
        // CAMBIO: Se usa suma de texto (+) en lugar de String.format
        // El saldo puede mostrarse con muchos decimales (ej: 100.0)
        String menu = "Bienvenido, " + usuario.getNombreUsuario() + ".\n" +
                      "Saldo: $" + usuario.getSaldo() + "\n\n" +
                      "Elija una opción:\n" +
                      "1. Depositar\n" +
                      "2. Retirar\n" +
                      "3. Transferir\n" +
                      "4. Cerrar Sesión";

        String opcion = JOptionPane.showInputDialog(null, menu, "Menú Bancario", JOptionPane.QUESTION_MESSAGE);
        
        if (opcion == null || opcion.equals("4")) {
            return null; // Cierra la sesión
        }
        
        try {
            switch (opcion) {
                case "1": handleTransaccion(usuario, "Depositar"); break;
                case "2": handleTransaccion(usuario, "Retirar"); break;
                case "3": handleTransferencia(usuario); break;
                default: JOptionPane.showMessageDialog(null, "Opción no reconocida.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado.");
        }
        return usuario;
    }

    // Lógica de Transacción (Depósito/Retiro) 
    private void handleTransaccion(Usuario usuario, String tipo) {
        String input = JOptionPane.showInputDialog("Monto a " + tipo.toLowerCase() + ":");
        if (input == null) return;

        try {
            double monto = Double.parseDouble(input);
            
            boolean exito;
            if (tipo.equals("Depositar")) {
                exito = usuario.depositar(monto);
            } else {
                exito = usuario.retirar(monto);
            }

            if (exito) {
                // CAMBIO: Se usa suma de texto (+)
                JOptionPane.showMessageDialog(null, tipo + " exitoso. Nuevo saldo: $" + usuario.getSaldo());
            } else {
                String mensaje = (tipo.equals("Depositar")) ? "El monto debe ser positivo." : "Fondos insuficientes o monto inválido.";
                // CAMBIO: Mensaje sin símbolos
                JOptionPane.showMessageDialog(null, "Fallo en " + tipo + ": " + mensaje);
            }
        } catch (NumberFormatException e) {
            // CAMBIO: Mensaje sin símbolos
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
        }
    }

    // Lógica de Transferencia 
    private void handleTransferencia(Usuario origen) {
        String destinoUser = JOptionPane.showInputDialog("Usuario a transferir:");
        if (destinoUser == null) return;

        Usuario destino = this.usuarios.get(destinoUser);
        
        if (destino == null || destino == origen) {
            // CAMBIO: Mensaje sin símbolos
            JOptionPane.showMessageDialog(null, "Usuario destino no encontrado o es la misma cuenta.");
            return;
        }

        String inputMonto = JOptionPane.showInputDialog("Monto a transferir a " + destinoUser + ":");
        if (inputMonto == null) return;

        try {
            double monto = Double.parseDouble(inputMonto);
            
            if (origen.retirar(monto)) {
                destino.depositar(monto);
                // CAMBIO: Se usa suma de texto (+)
                JOptionPane.showMessageDialog(null, "Transferencia de $" + monto + " a " + destinoUser + " exitosa.\n" +
                                                    "Su nuevo saldo: $" + origen.getSaldo());
            } else {
                // CAMBIO: Mensaje sin símbolos
                JOptionPane.showMessageDialog(null, "Fondos insuficientes o monto inválido.");
            }
        } catch (NumberFormatException e) {
            // CAMBIO: Mensaje sin símbolos
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
        }
    }
}