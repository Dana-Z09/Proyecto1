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
    private ListaSimple cities;
    
    //Constructor
    public Grafo(ListaSimple cities) {
        this.cities = cities;
    }
    
    
    //getters y setters de la clase

    public ListaSimple getCities() {
        return cities;
    }

    public void setCities(ListaSimple cities) {
        this.cities = cities;
    }
   
    //Primtivas
    
        /**
     * Verifica si el grafo esta vacio
     * @return true si el grafo no tiene ninguna ciudad
     */
    public boolean grafoIsEmpty() {
        return cities.getHead() == null;
        
    }
    
     /**
     * Muestra cuantas ciudades hay en el hormiguero
     * @return cuantas ciudades tiene el hormiguero
     */
    public int citiesQuantity(){
        return cities.getSize();
    }
    
    /**
     * Muestra si un camino existe en el hormiguero
     * @return true si un camino (Path) existe en el hormiguero
     */
    
    
    /**
     * Muestra si una ciudad existe en el hormiguero
     * @return true si una ciudad (City) existe en el hormiguero
     */
    
    
    /**
     * Agrega una ciudad al hormiguero siempre y cuando no se repita
     * @return true si una ciudad (City) existe en el hormiguero
     */
    
    
    /**
     * Agrega un camino al hormiguero siempre y cuando no se repita
     * @return true si una ciudad (City) existe en el hormiguero
     */
    
    
}
