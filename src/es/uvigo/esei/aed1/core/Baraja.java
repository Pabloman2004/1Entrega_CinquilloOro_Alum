/*
* Representa la baraja española pero con 8 y 9, en total 48 cartas, 4 palos, valores de las cartas de 1 a 12. 
* Estructura: se utilizará un TAD adecuado
* Funcionalidad: barajar las cartas, devolver la carta situada encima del montón de cartas
 */

package es.uvigo.esei.aed1.core;
import lista.IteradorLista;
import lista.Lista;
import lista.ListaEnlazada;
import pila.*;


public class Baraja {
    private Pila<Carta> cartas;

    public Baraja() {
        cartas=new EnlazadaPila<Carta>(); 
        this.crearBaraja();
        this.barajar();
        
    }

    public Baraja(Pila<Carta> baraja) {
        this.cartas = baraja;
        
    }

    public Pila<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(Pila<Carta> cartas) {
        this.cartas = cartas;
    }

    
    public void crearBaraja(){
        for (int i = 1; i <=12 ; i++) {            
            for (Palo x : Palo.values()) {
                Carta c=new Carta(i,x);
                this.cartas.push(c);
                
            }
        
        }
      
        
    }
    
    public void barajar(){
        int n1,n2;
        Carta cx;
        Carta monton[]=new Carta [48];
        for (int i = 0; i < monton.length; i++) {
            monton[i]=cartas.pop();
        }
        for (int i = 0; i < 100; i++) {
            n1=(int)(Math.random()*47);
            n2=(int)(Math.random()*47);
            cx=monton[n1];
            monton[n1]=monton[n2];
            monton[n2]=cx;
        }
        for (int i = 0; i < monton.length; i++) {
            cartas.push(monton[i]);
        }
        
            
        }
    
    
    public Carta repartirBaraja(){
        return this.cartas.pop();
    }
    
    public String toString(){
        StringBuilder sb=new StringBuilder();
        Lista <Carta>l=new ListaEnlazada<>();
        for (int i = 0; i < 48; i++) {
            l.insertarPrincipio(cartas.pop());
        }
        IteradorLista<Carta>iterador=l.iteradorLista();
        while(iterador.hasNext()){
            
           sb.append(iterador.next());
           sb.append(" \n");   
           
        }
        while(iterador.hasNext()){
            cartas.push(iterador.next());
        }
            

   return sb.toString();
   }
    
   
}
