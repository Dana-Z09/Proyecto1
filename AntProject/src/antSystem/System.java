/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antSystem;

import EDD.City;
import EDD.Grafo;
import EDD.ListaSimple;
import EDD.Path;

/**
 *
 * @author Diego Mendez y Daniela Zambrano
 */
public class System {
    private Grafo grafo; //lo da el usuario
    private int numCycles; //lo da
    private ListaSimple antsList;
    private double alfa;//grado de impotancia de la feromona, valor recomendado: 1
    private double beta;//grado de visibilidad de la ciudad, valor recomendado: 2
    private double rho;
    private City startCity;
    private City endCity;
    private ListaSimple bestRoute;//ruta mas optima
    private double bestDistance; //Distancia mas optima
    private ListaSimple mainRecord; //Historial de todas los recorridos de todas las hormigas
    private ListaSimple auxRecord; //Historial de cada hormiga 
    private double q; //aprendizaje de las hormigas, valor recomendado: 1

    
    //Constructor de la clase///////////////////////////////////////////////////
    public System(Grafo grafo, int numCycles, ListaSimple listAnts, double alfa, double beta, double rho, City startCity, City endCity,double q) {
        this.grafo = grafo;
        this.numCycles = numCycles;
        this.antsList = listAnts;
        this.alfa = alfa;
        this.beta = beta;
        this.rho = rho;
        this.startCity = startCity;
        this.endCity = endCity;
        this.bestRoute = new ListaSimple();
        this.bestDistance = 0;
        this.mainRecord = new ListaSimple();
        this.auxRecord= new ListaSimple();
        this.q=q;
    }

    //Getters and Setters///////////////////////////////////////////////////////
    
    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public int getNumCycles() {
        return numCycles;
    }

    public void setNumCycles(int numCycles) {
        this.numCycles = numCycles;
    }

    public ListaSimple getAntsList() {
        return antsList;
    }

    public void setAntsList(ListaSimple antsList) {
        this.antsList = antsList;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getRho() {
        return rho;
    }

    public void setRho(double rho) {
        this.rho = rho;
    }

    public City getStartCity() {
        return startCity;
    }

    public void setStartCity(City startCity) {
        this.startCity = startCity;
    }

    public City getEndCity() {
        return endCity;
    }

    public void setEndCity(City endCity) {
        this.endCity = endCity;
    }

    public ListaSimple getBestRoute() {
        return bestRoute;
    }

    public void setBestRoute(ListaSimple bestRoute) {
        this.bestRoute = bestRoute;
    }

    public double getBestDistance() {
        return bestDistance;
    }

    public void setBestDistance(double bestDistance) {
        this.bestDistance = bestDistance;
    }

    public ListaSimple getMainRecord() {
        return mainRecord;
    }

    public void setMainRecord(ListaSimple mainRecord) {
        this.mainRecord = mainRecord;
    }
    
    public ListaSimple getAuxRecord() {
        return auxRecord;
    }

    public void setAuxRecord(ListaSimple auxRecord) {
        this.auxRecord = auxRecord;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
    
    //Funcion que resetea las hormigas de la lista de hormigas 
    public void restarAntsList(){
        for (int i = 0; i < this.antsList.getSize(); i++) {
            Ant antReset= (Ant) antsList.getContentByIndex(i);
            antReset.setCurrentCity(this.startCity);//se resetea la ciudad de inicio
            antReset.getVisitedCities().resetList();//se resetea la lista de ciudades visitadas
            antReset.setWalkedDistance(0);// se resetea la distancia recorrida
            antsList.changeContent(i, antReset);
        }
    }
    
    //Funcion que a partir de la lista de probabilidades da una ciudad siguiente 
    //todavia falta
    public City chooseNextCity(ListaSimple probability, ListaSimple candidateCities){
        return null;
    }
    
    
    //Funcion de incrementacion de feromonas en el camino
    public void increasePheromones(Ant ant){
        double RoadVisibilityFactor= q/ant.getWalkedDistance();
        
        for (int i = 0; i < ant.getVisitedCities().getSize(); i++) {
            City auxCity= (City) ant.getVisitedCities().getContentByIndex(i);
            City nextAuxCity= (City) ant.getVisitedCities().getContentByIndex(i);
            
            double totalPheromones=RoadVisibilityFactor+auxCity.searchPathByNumCity2(nextAuxCity.getNumCity()).getPheromones();
            auxCity.searchPathByNumCity2(nextAuxCity.getNumCity()).setPheromones(totalPheromones);
        }
        
    }
    
    //Funcion de evaporacion de feromonas
    public void evaporatePheromones(){
        for (int i = 0; i < grafo.getCities().getSize(); i++) {
            City currentCity= (City) grafo.getCities().getContentByIndex(i);
            for (int j = 0; j < currentCity.getListAdy().getSize(); j++) {
                Path currentPath = (Path) currentCity.getListAdy().getContentByIndex(j);
                double evaporatePheromones = (1-this.rho)* currentPath.getPheromones();
                currentPath.setPheromones(evaporatePheromones);
            }
        }
    
    } 
    
    //Funcion para que la hormiga recorra el hormiguero completo 
    public void completeRoute(Ant ant){
        for (int i = 0; i < grafo.citiesQuantity(); i++) {
            if (ant.getCurrentCity().getNumCity()!=this.endCity.getNumCity()){
                ListaSimple candidateCities = getCandidateCities(ant);
                if (candidateCities.getSize()!=0){ //Esto es para verificar que no haya llegado a una ciudad ciega
                    ListaSimple probability = getProbabilitysList(candidateCities);
                    City nextCity = chooseNextCity(probability,candidateCities);
                    City  auxCity = ant.getCurrentCity();
                    Path path = auxCity.searchPathByNumCity2(nextCity.getNumCity()); 
                    ant.move(nextCity.getNumCity(), path.getDistance());}
                else{break;}}
            else{break;}}
        
        if (this.bestDistance==0){
            this.setBestDistance(ant.getWalkedDistance());
            this.setBestRoute(ant.getVisitedCities());
        }else{
            if(ant.getWalkedDistance()<this.getBestDistance() && ant.getCurrentCity().getNumCity()== this.endCity.getNumCity()){
                this.setBestDistance(ant.getWalkedDistance());
                this.setBestRoute(ant.getVisitedCities());
            }
        }
        this.increasePheromones(ant);
    
    }
    
    //Funcion para obtener una lista con ciudades que son candidatas para que la hormiga se mueva
    public ListaSimple getCandidateCities(Ant ant){
        City auxCity = ant.getCurrentCity();
        ListaSimple candidateCities = new ListaSimple();
        for (int i = 0; i < auxCity.getListAdy().getSize(); i++) {
            Path auxPath = (Path) auxCity.getListAdy().getContentByIndex(i);
            if(!ant.visited(auxPath.getDestination().getNumCity())){
                candidateCities.addEnd(auxPath);
            }            
        }
        return candidateCities;
    }
    
    
    //Funcion de probabilidades
    //falta el resto de los calculos
    public ListaSimple getProbabilitysList(ListaSimple candidateCities){
        ListaSimple probabilityList= new ListaSimple();
        for (int i = 0; i < candidateCities.getSize(); i++) {
            Path auxPath= (Path) candidateCities.getContentByIndex(i);
            double result1= Math.pow(auxPath.getPheromones(), this.alfa);
            probabilityList.addEnd(result1);
            
        }
        return probabilityList;
    }
   
/**
 * 
 * Esta es la funcion simulacion, la funcion principal donde va a ocurrir toda la magia. 
 * 
 */
    public void simulation(){
        String numCycle;
        AntRecord auxRecordAnt=null;
        for (int i = 0; i < this.numCycles; i++) {
            for (int j = 0; j < this.antsList.getSize(); j++) {
                Ant auxAnt = (Ant) antsList.getContentByIndex(j);
                this.completeRoute(auxAnt);
                auxRecordAnt = new AntRecord(j, auxAnt.getVisitedCities().toStringCities(),String.valueOf(auxAnt.getWalkedDistance())); // Aqui me falta colocar el resto de argumentos del contructor pero necesito crear una funcion que convierta una lista a una lista de strings o a una cadena separada por algo significativo
                this.auxRecord.addEnd(auxRecordAnt);
                
                this.increasePheromones(auxAnt);
            }
            numCycle="Ciclo numero "+(i+1);
            String antRecords= auxRecordAnt.toString();    
            MainRecord mainrecord = new MainRecord(numCycle,auxRecordAnt.toString(), this.bestRoute.toString(),this.bestDistance);
            this.mainRecord.addEnd(mainrecord);
            this.evaporatePheromones();
            this.restarAntsList();
        }
    }
    
    public String toStringRecord(){
    String LastRecord="";
            for (int i = 0; i < this.mainRecord.getSize(); i++){
                MainRecord auxrecord=(MainRecord)  this.mainRecord.getContentByIndex(i);
                LastRecord+=auxrecord.toString()+"\n";}
            return LastRecord;
}
}
