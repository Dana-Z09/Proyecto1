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
    private City destiny;
    private City origin;
    private double distance;
    private int pheromones;

    //Constructor de la clase Path
    public Path(City destiny, City origin, double distance) {
        this.destiny = destiny;
        this.origin = origin;
        this.distance = distance;
        this.pheromones = 0;
    }

    //Getters y setters de la clase Path
    public City getDestiny() {
        return destiny;
    }

    public void setDestiny(City destiny) {
        this.destiny = destiny;
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
    
    public int getPheromones() {
        return pheromones;
    }

    public void setPheromones(int pheromones) {
        this.pheromones = pheromones;
    }
    
    //Primitivas

 
    
}
