/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antSystem;

import EDD.City;
import EDD.ListaSimple;
import javax.swing.JOptionPane;

/**
 *
 * @author dams2
 */
public class Ant {
   private City currentCity;
    private ListaSimple visitedCities;
    private double walked;

    public Ant() {
        this.currentCity = null;
        this.visitedCities = new ListaSimple();
        this.walked = 0;
    }

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

    public double getWalked() {
        return walked;
    }

    public void setWalked(double walked) {
        this.walked = walked;
    }
    
    public void move(int numCity, double distance){
        if(!visited(numCity)){
            City nextCity = this.currentCity.searchPathByNumCity(numCity);
            this.setCurrentCity(nextCity);
            this.visitedCities.addEnd(nextCity);
            this.walked += distance;
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
