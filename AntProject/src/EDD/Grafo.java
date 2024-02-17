/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Diego Mendez
 */
public class Grafo {
    //Atributos de la clase
    private ListaSimple Cities;
    
    //Constructor
    public Grafo(ListaSimple Cities) {
        this.Cities = Cities;
    }
    
    
    //getters y setters de la clase

    public ListaSimple getCities() {
        return Cities;
    }

    public void setCities(ListaSimple Cities) {
        this.Cities = Cities;
    }
   
    
    
}
