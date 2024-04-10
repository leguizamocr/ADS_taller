package Modelos;

public class Departamento {
    private String nombre;
    private String capital;
    private int poblacion;
    private String descripcion;

    //Constructor por defecto
    public Departamento(){}

    //Constructor por parametros
    public Departamento(String nombre, String capital, int poblacion, String descripcion) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.descripcion = descripcion;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getCapital(){
        return capital;
    }
    public int getPoblacion(){
        return poblacion;
    }
    public String getDescripcion(){
        return descripcion;
    }

}