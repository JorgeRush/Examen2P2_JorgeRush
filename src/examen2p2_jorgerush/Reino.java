/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jorgerush;

import java.util.ArrayList;

/**
 *
 * @author Jorge Rush
 */
public class Reino {
    String Nombre;
    ArrayList <Luchador> Luchadores;
    public Reino(String Nombre){
        this.Nombre=Nombre;
        Luchadores=new ArrayList<>();
    }
    public void añadirLuchadores(Luchador luchador){
        Luchadores.add(luchador);
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Luchador> getLuchadores() {
        return Luchadores;
    }

    public void setLuchadores(ArrayList<Luchador> Luchadores) {
        this.Luchadores = Luchadores;
    }

    @Override
    public String toString() {
        int contador=0;
        String LuchaU="";
        for (int i = 0; i < Luchadores.size(); i++) {
            contador++;
            LuchaU+="\n"+i+" ."+Luchadores.get(i).getNombre();
        }
        
        
        return "---- REINO "+Nombre+" ----\n"+
                "Numero de luchadores: "+contador+"\n"+
                "Luchadores: \n"+LuchaU;
    }
    
}
