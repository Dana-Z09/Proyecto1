package antSystem;

/**
 *
 * @author Daniela Zambrano
 */
public class AntRecord {
    private int numAnt; //numero de identificacion de la hormiga
    private String visitedCities; //es una lista de ciudades recorridas por la hormiga como un string <- me falta hacer una funcion que convierta la lista en un string
    private String walkedDistance; //longitud recorrida de  la hormiga como un string

    //Constructor///////////////////////////////////////////////////////////////
    public AntRecord(int numAnt, String visitedCities, String walkedDistance) {
        this.numAnt = numAnt;
        this.visitedCities = visitedCities;
        this.walkedDistance = walkedDistance;
    }

    public AntRecord() {
    }

    public int getNumAnt() {
        return numAnt;
    }

    public void setNumAnt(int numAnt) {
        this.numAnt = numAnt;
    }

    public String getVisitedCities() {
        return visitedCities;
    }

    public void setVisitedCities(String visitedCities) {
        this.visitedCities = visitedCities;
    }

    public String getWalkedDistance() {
        return walkedDistance;
    }

    public void setWalkedDistance(String walkedDistance) {
        this.walkedDistance = walkedDistance;
    }
    
    
}
