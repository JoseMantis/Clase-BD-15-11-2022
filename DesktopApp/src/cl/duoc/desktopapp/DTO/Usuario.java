/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.desktopapp.DTO;

/**
 *
 * @author Cetecom
 */
public class Usuario extends Persona{
    private int codigo;

    public Usuario(String nombre, String rut, String sexo, boolean mayorEdad, int codigo) {
        super(nombre, rut, sexo, mayorEdad);
        codigo = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
