/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jorgerush;

import static examen2p2_jorgerush.EfectoEstado.Aturdido;
import static examen2p2_jorgerush.EfectoEstado.Congelado;
import static examen2p2_jorgerush.EfectoEstado.Quemadura;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jorge Rush
 */
public class Luchador {

    String Nombre;
    String Reino;
    double Vida;
    String Ataque;
    double Velocidad;
    double probabilidad;
    double  BonoHabilidad;
    boolean reducirMitad=false;
    boolean jugabilidad=true;
    ArrayList<Habilidad> habilidades = new ArrayList<>();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getReino() {
        return Reino;
    }

    public void setReino(String Reino) {
        this.Reino = Reino;
    }

    public double getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public String getAtaque() {
        return Ataque;
    }

    public void setAtaque(String Ataque) {
        this.Ataque = Ataque;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

    public double getBonoHabilidad() {
        return BonoHabilidad;
    }

    public void setBonoHabilidad(double BonoHabilidad) {
        this.BonoHabilidad = BonoHabilidad;
    }

    public ArrayList<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }
    Random R = new Random();

    public double GolpeNormal(int dañoHabilidad) {
        int eleccion = R.nextInt(1, 5);
        double elegido = 0;
        if (eleccion != 1) {
            if (eleccion == 2) {
                elegido = 0.8;
            } else if (eleccion == 3) {
                elegido = 0.6;
            } else if (eleccion == 4) {
                elegido = 0.4;
            } else if (eleccion == 5) {
                elegido = 0.2;
            }
        } else {
            elegido = 1;
        }
        double daño=(dañoHabilidad*elegido)*0.5;
        return daño;
    }
    public double LanzarHabilidad (Enum estado,double bonoHabilidad,double daño){
        double dañoCausado=0;
        boolean verf=false;
        if(estado==Quemadura){
            verf=true;
            dañoCausado=((daño/70)*25)/3;
        }else if (estado==Congelado){
            reducirMitad=true;
        }else if(estado==Aturdido){
            jugabilidad=false;
        }
        
        if(verf==true){
            return dañoCausado;
        }else{
            return -1;
        }
        
    }
    

}
