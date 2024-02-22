package antSystem;

import EDD.City;
import EDD.ListaSimple;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Mendez y Daniela Zambrano
 */
public class Ant {
   private City currentCity;
    private ListaSimple visitedCities;
    private double walkedDistance;
    
    
    //Constructor
    public Ant() {
        this.currentCity = null;
        this.visitedCities = new ListaSimple();
        this.walkedDistance = 0;
    }
    
    //Setters and Getters///////////////////////////////////////////////////////
    public City getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(City currentCity) {
        this.currentCity = currentCity;
    }

    public ListaSimple getVisitedCities() {
        return visitedCities;
    }

    public void setVisitedCities(ListaSimple visitedCities) {
        this.visitedCities = visitedCities;
    }

    public double getWalkedDistance() {
        return walkedDistance;
    }

    public void setWalkedDistance(double walkedDistance) {
        this.walkedDistance = walkedDistance;
    }
    ////////////////////////////////////////////////////////////////////////////
    
    /**
     * Metodo que hace que la hormiga se mueva por las ciudades y guarda las ciudad en la que se mueve y la nueva distancia recorrida
     * @param numCity
     * @param distance 
     */
    public void move(int numCity, double distance){
        if(!visited(numCity)){
            City nextCity = this.currentCity.searchPathByNumCity(numCity);
            this.setCurrentCity(nextCity);
            this.visitedCities.addEnd(nextCity);
            this.walkedDistance += distance;
        }else{
            JOptionPane.showMessageDialog(null, "La hormiga ha recorrido todos los caminos");
        }
    }
    
    
    /**
     * Metodo para probar si la ciudad ya ha sido visitada por la hormiga 
     * @param numCity recibe el numero de la ciudad a comparar
     * @return true si la ciudad ya ha sido visitada
     */    
    public boolean visited(int numCity){
        for (int i = 0; i < this.getVisitedCities().getSize(); i++) {
            City currentCity = (City) this.getVisitedCities().getContentByIndex(i);
            if(currentCity.getNumCity() == numCity){
                return true;
            }
        }
        return false;
    } 
}
