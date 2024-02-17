/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Diego Mendez
 */
public class City {
    //Atributos de la clase City
    private int num;
    private ListaSimple adyacent;     

    //Constructor de la clase City
    public City(int num, ListaSimple adyacent) {
        this.num = num;
        this.adyacent = adyacent;
    }

    
    //getters and setters de la clase City
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ListaSimple getAdyacent() {
        return adyacent;
    }

    public void setAdyacent(ListaSimple adyacent) {
        this.adyacent = adyacent;
    }
    
    //Primitivas
}
