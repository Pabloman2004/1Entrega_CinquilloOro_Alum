/**
 * Representa el juego del Cinquillo-Oro, con sus reglas (definidas en el documento Primera entrega). 
 * Se recomienda una implementación modular.
 */

package es.uvigo.esei.aed1.core;

import es.uvigo.esei.aed1.iu.IU;
import java.util.ArrayList;
import java.util.List;


public class Juego{
  private final IU iu;
  private int numJugadores;
  private List<Jugador>jugadores;
          
public Juego(IU iu){
    this.iu = iu;
    jugadores=new ArrayList();
}

public void CrearJugadores(){  
    //Controlar numero de jugadores
    
    numJugadores=iu.leeNum("numero de jugadores");
    
    
    String nombre;
    for (int i = 0; i < numJugadores; i++) {
        Jugador jugador=new Jugador();
        nombre=iu.leeString("Nombre del jugador");
        jugador.setNombre(nombre);
        jugadores.add(jugador);       
    }
}

public void repartirCartas(Partida p1){
   for (int j = 0; j < 48/numJugadores; j++)  {
       for (int i = 0; i < numJugadores; i++)  { 
            jugadores.get(i).anhadirAMano(p1.getBaraja().repartirBaraja());
        }     
    }
}



public String Comienza(){
    int n=(int)(Math.random()*numJugadores+1);
    return jugadores.get(n).getNombre();
}    

public void jugar(){
    CrearJugadores();
    //aqui repetire para varias partidas
    Partida p1=new Partida();
    
    //reparto de cartas
    repartirCartas(p1);
    System.out.println("El jugador que comienza es: "+Comienza());
}
     


public String toString(){
    StringBuilder sb=new StringBuilder();
    for (int i = 0; i < jugadores.size(); i++) {
        sb.append(jugadores.toString());
    }
 return sb.toString();

}

        
    
}
