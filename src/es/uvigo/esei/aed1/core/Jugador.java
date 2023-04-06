/*
 * Representa a un jugador, identificado por el nombre y sus cartas de la mano
 * Estructura mano: se utilizará un TAD adecuado
 * Funcionalidad: Añadir carta a la mano, convertir a String el objeto Jugador (toString)
 */

package es.uvigo.esei.aed1.core;
import java.util.ArrayList;
import es.uvigo.esei.aed1.iu.IU;


public class Jugador {

    private String nombre;
    ArrayList<Carta>mano;
    private int puntos;
    
    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano=new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public void anhadirAMano(Carta c){
        mano.add(c);
    }
    
    public ArrayList<Carta> getMano(){
        return mano;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
       
            sb.append("jugador ");
            sb.append(": ");sb.append(getNombre());
            sb.append(" ");       
            for (int i = 0; i < mano.size(); i++) {
            sb.append(getMano()); 
            sb.append(" ");
            }
            
            
   
        return sb.toString();
      
    }
     
    
    
            
}
