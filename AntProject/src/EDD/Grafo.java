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
     * @param path recibe el camino a buscar
     */
    public boolean searchPath(Path path) {
        for ( int i = 0; i < cities.getSize();i++ ) {
            City auxCity = (City) cities.getContent(i);
            if( auxCity.searchPath(path) == true ) {
                return true;
            }
        }
        return false;
    
}
    
    
    /**
     * Muestra si una ciudad existe en el hormiguero
     * @return true si una ciudad (City) existe en el hormiguero
     * @param city recibe la ciudad a buscar
     */
    public boolean searchCity(City city) {
        for (int i = 0; i < cities.getSize();i++) {
            City auxCity = (City) cities.getContent(i);
            if(auxCity.getNumCity() == city.getNumCity()) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Agrega una ciudad al hormiguero siempre y cuando no se repita
     */
    
    
    /**
     * Agrega un camino al hormiguero siempre y cuando no se repita
     */
    
    /**
     * Borra una ciudad del hormiguero si existe
     */
    
    /**
     * Borra un camino del hormiguero si exitse
     */
}
