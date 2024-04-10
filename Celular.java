package Modelos;

public class Celular {
    private String marca;
    private String referencia;
    private int precio;
    private String descripcion;
    private boolean disponibilidad;
    public Celular(String marca, int precio, String descripcion,String referencia, boolean disponibilidad) {
        this.marca = marca;
        this.precio = precio;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
