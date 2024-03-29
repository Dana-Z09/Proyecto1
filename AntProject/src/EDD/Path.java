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
    public Path(City origin, City destination, double distance) {
        this.destination = destination;
        this.origin = origin;
        this.distance = distance;
        this.pheromones = 1;
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

    public void setPheromones(double pheromones) {
        this.pheromones = pheromones;
    }
    
    //Primitivas

 
    
}
