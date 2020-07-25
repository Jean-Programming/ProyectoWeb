

package modelo;


public class sucursal {

    private String idSucursal;
    private String sucursal;
    private String direc;
    private String telefono;

    public sucursal() {
    }

    public sucursal(String idSucursal, String sucursal, String direc, String telefono) {
        this.idSucursal = idSucursal;
        this.sucursal = sucursal;
        this.direc = direc;
        this.telefono = telefono;
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    

   
    
    
}
