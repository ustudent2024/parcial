package Parcialp.Parcialp;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    private boolean esAdmin;

    public Usuario(String nombre, String correo, String contrasena, boolean esAdmin) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.esAdmin = esAdmin;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", esAdmin=" + esAdmin +
                '}';
    }
}

