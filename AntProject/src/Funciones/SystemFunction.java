 package Funciones;

import EDD.City;
import EDD.Grafo;
import EDD.Path;
import EDD.ListaSimple;
import antSystem.Ant;

/**
 *
 * @author Daniela Zambrano
 */
public class SystemFunction {
    public ListaSimple initializeAnts(int numAnts, City startCity){
        ListaSimple listAnts = new ListaSimple();
        for (int i = 0; i < numAnts; i++) {
            Ant ant = new Ant();
            ant.setCurrentCity(startCity);
            listAnts.addEnd(ant);
        }
        return listAnts;
    }
    
    public void initializePheromones(Grafo grafo){
        double startPheromones = 1/grafo.citiesQuantity();
        int numCities=grafo.citiesQuantity();
        for (int i = 0; i < numCities; i++) {
            City auxCity = (City) grafo.getCities().getContentByIndex(i);
            int numAdyCities= auxCity.getListAdy().getSize();
            for (int j = 0; j < numAdyCities; j++) {
                Path auxPath= (Path) auxCity.getListAdy().getContentByIndex(i);
                auxPath.setPheromones(startPheromones);
            }
            
        }
    
    
    }
    
    
    
    
}
