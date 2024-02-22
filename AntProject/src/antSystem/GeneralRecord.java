package antSystem;

/**
 *
 * @author Daniela Zambrano
 */
public class GeneralRecord {
    private String title; //numero del ciclo
    private String antRecords; //Los records de cada hormiga
    private String bestRoute; //La mejor ruta, la más optima
    private double bestDistance; //La mejor distancia, la más óptima

    public GeneralRecord(String title, String antRecords, String bestRoute, double bestDistance) {
        this.title = title;
        this.antRecords = antRecords;
        this.bestRoute = bestRoute;
        this.bestDistance = bestDistance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAntRecords() {
        return antRecords;
    }

    public void setAntRecords(String antRecords) {
        this.antRecords = antRecords;
    }

    public String getBestRoute() {
        return bestRoute;
    }

    public void setBestRoute(String bestRoute) {
        this.bestRoute = bestRoute;
    }

    public double getBestDistance() {
        return bestDistance;
    }

    public void setBestDistance(double bestDistance) {
        this.bestDistance = bestDistance;
    }
    
    
}
