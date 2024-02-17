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
    private float distance;

    //Constructor de la clase Path
    public Path(City destiny, City origin, float distance) {
        this.destiny = destiny;
        this.origin = origin;
        this.distance = distance;
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

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
    
    //Primitivas
}
