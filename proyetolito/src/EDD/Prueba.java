/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Username
 */
public class Prueba {
    public static void main(String[] args) {
    
    City b1 = new City(1);
    City b2 = new City(2);
    City b3 = new City(3);
    
    Path path1 = new Path(b1, b2, 3);
    Path path2 = new Path(b2, b3, 10);
    
    ListaSimple Lista1 = new ListaSimple();
    ListaSimple Lista2 = new ListaSimple();
    
   Lista1.addEnd(path1);
   Lista2.addEnd(path2);
   
   b1.setAdyacent(Lista1);
   b2.setAdyacent(Lista2);
   
   ListaSimple superlista = new ListaSimple();
   superlista.addEnd(b1);
   superlista.addEnd(b2);
   superlista.addEnd(b3);
   
   Grafo gafo = new Grafo(superlista);
   
    System.out.println("hola" + gafo.toString());
    }
}
