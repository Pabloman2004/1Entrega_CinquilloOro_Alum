
package es.uvigo.esei.aed1.core;

import lista.Lista;
import lista.ListaEnlazada;


public class Partida {
    private Lista<Palo>Espadas;
    private Lista<Palo>oros;
    private Lista<Palo>copas;
    private Lista<Palo>bastos;
    Baraja baraja;
    
    public Partida(){
        baraja=new Baraja();
        Espadas=new ListaEnlazada();
    }
    public Baraja getBaraja(){
        return baraja;
    }
    
    
}
