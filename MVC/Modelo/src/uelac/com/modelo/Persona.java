/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uelac.com.modelo;

/**
 *
 * @author LENOVO
 */
public class Persona {
    private int ID;
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Genero;
    private String Direccion;
    private int Edad;

    public Persona() {
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "ID=" + ID + ", Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Genero=" + Genero + ", Direccion=" + Direccion + ", Edad=" + Edad + '}';
    }
    
}
