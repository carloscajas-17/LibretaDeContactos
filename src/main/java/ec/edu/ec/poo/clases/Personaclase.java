package ec.edu.ec.poo.clases;

public class Personaclase {//los atributos no deben tenr una información inicial
//los atributos siempre tiene que se privados

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public void setCedula(String cedula) {
        this.cedula = cedula;  //this hace referencia  a metodos,atributos
    }
    public String getCedula() {
        return cedula;
    }

}
