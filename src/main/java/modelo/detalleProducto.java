
package modelo;


public class detalleProducto {

    private String idProducto;
    private String marca;
    private int precioCosto;

    public detalleProducto() {
    }

    public detalleProducto(String idProducto, String marca, int precioCosto) {
        this.idProducto = idProducto;
        this.marca = marca;
        this.precioCosto = precioCosto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(int precioCosto) {
        this.precioCosto = precioCosto;
    }
    
    
}
