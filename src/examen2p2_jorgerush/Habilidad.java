/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jorgerush;

/**
 *
 * @author Jorge Rush
 */
public class Habilidad {
    String Nombre;
    double daño;
    String efectoEstado;

    public Habilidad(String Nombre, double daño, String efectoEstado) {
        this.Nombre = Nombre;
        this.daño = daño;
        this.efectoEstado = efectoEstado;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }
    
}
