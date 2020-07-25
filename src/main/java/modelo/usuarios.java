

package modelo;


public class usuarios {

    private String idUsuario;
    private String nombre;
    private String clave;
    private int idRol;

    public usuarios() {
    }

    public usuarios(String idUsuario, String nombre, String clave, int idRol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.clave = clave;
        this.idRol = idRol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
    
    
}
