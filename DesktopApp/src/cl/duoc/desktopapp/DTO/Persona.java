/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.desktopapp.DTO;

/**
 *
 * @author Cetecom
 */
public class Persona {
    private String nombre;
    private String rut;
    private String sexo;
    private boolean mayorEdad;

    public Persona(String nombre, String rut, String sexo, boolean mayorEdad) {
        this.nombre = nombre;
        this.rut = rut;
        this.sexo = sexo;
        this.mayorEdad = mayorEdad;
    }
    
    public Persona(){
        this.nombre = "";
        this.rut = "";
        this.sexo = "";
        mayorEdad = true;
    }
    
    @Override
    public String toString(){
        return
                this.nombre.getNombre() + ", " +
                this.rut.getRut() + ", " +
                this.sexo.getSexo() + ", " +
                (this.mayorEdad.getMayorEdad() ? "Si" : "No");
    }
}
