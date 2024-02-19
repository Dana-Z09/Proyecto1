/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Diego Mendez
 */
public class Path {
    //Atributos de la clase Path
    private City origin;
    private City destination;
    private double distance;
    private double pheromones;

    //Constructor de la clase Path
    public Path(City origin, City destiny, double distance) {
        this.destination = destiny;
        this.origin = origin;
        this.distance = distance;
        this.pheromones = 0;
    }

    
    
    
    //Getters y setters de la clase Path
    public City getDestination() {
        return destination;
    }

    public void setDestination(City destination) {
        this.destination = destination;
    }

    public City getOrigin() {
        return origin;
    }

    public void setOrigin(City origin) {
        this.origin = origin;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    public double getPheromones() {
        return pheromones;
    }

    public void setPheromones(int pheromones) {
        this.pheromones = pheromones;
    }
    
    //Primitivas

 
    
}
