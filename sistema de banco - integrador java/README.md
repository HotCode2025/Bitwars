## **Proyecto Integrador Java** 

### **Requisitos**

**El proyecto debe cumplir con:**

- Ejecución funcional y completa
- Posibilidad de añadir mejoras
- Subido en la organización de GitHub

**Requisitos Técnicos**

- Menú interactivo
- Programación Orientada a Objetos (POO)
- Bucles
- Condicionales

_**Fecha de entrega:**_ 10 de Noviembre

---

## Sistema de Banco

**Grupo:** Bitwars

**Integrantes:** Francesco Cornachione, María José Sela, Tomás Vilche, Valentín Castillo, Pablo García


### Funciones

- **Sistema de Login y Encriptación:** Implementamos un sistema de login, donde el usuario puede registrarse con su usuario y contraseña, y luego iniciar sesión, las contraseñas son encriptadas con `MessageDigest` o `BCrypt`, para seguir buenas prácticas de seguridad. El usuario también puede restablecer su contraseña.
- **Ingresar y Transferir Dinero:** El usuario puede ingresar dinero, y luego transferirlo. El sistema valida que el usuario tenga el dinero suficiente.
- Ver el Saldo disponible: El usuario puede ver el saldo disponible en su cuenta, este se actualiza cada vez que se hace una transacción.

### Funciones Avanzadas

- **Historial de Transacciones:** Cada transacción se guarda, y luego puede ser visualizada (fecha, hora, tipo, monto, saldo resultante).
