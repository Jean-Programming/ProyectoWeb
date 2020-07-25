

package modelo;


public class inventario {

    private String idProducto;
    private String nomProd;        
    private int cantidad;
    private int precio;        
    private String talla;        
    private char genero;       
    private String idSucursal;       

    public inventario() {
    }

    public inventario(String idProducto, String nomProd, int cantidad, int precio, String talla, char genero, String idSucursal) {
        this.idProducto = idProducto;
        this.nomProd = nomProd;
        this.cantidad = cantidad;
        this.precio = precio;
        this.talla = talla;
        this.genero = genero;
        this.idSucursal = idSucursal;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    
    
}
