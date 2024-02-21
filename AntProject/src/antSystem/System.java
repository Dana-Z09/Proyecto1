/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antSystem;

import EDD.City;
import EDD.Grafo;
import EDD.ListaSimple;

/**
 *
 * @author dams2
 */
public class System {
   private Grafo grafo;
    private int cycle;
    private ListaSimple listAnts;
    private double alfa;
    private double beta;
    private double rho;
    private City startCity;
    private City endCity;
    private ListaSimple bestPath;
    private double bestDistance;
    private ListaSimple history;

    public System(Grafo grafo, int cycle, ListaSimple listAnts, double alfa, double beta, double rho, City startCity, City endCity) {
        this.grafo = grafo;
        this.cycle = cycle;
        this.listAnts = listAnts;
        this.alfa = alfa;
        this.beta = beta;
        this.rho = rho;
        this.startCity = startCity;
        this.endCity = endCity;
        this.bestPath = new ListaSimple();
        this.bestDistance = 0;
        this.history = new ListaSimple();
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    public int getCycle() {
        return cycle;
    }

    public void setCycle(int cycle) {
        this.cycle = cycle;
    }

    public ListaSimple getListAnts() {
        return listAnts;
    }

    public void setListAnts(ListaSimple listAnts) {
        this.listAnts = listAnts;
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

    public ListaSimple getBestPath() {
        return bestPath;
    }

    public void setBestPath(ListaSimple bestPath) {
        this.bestPath = bestPath;
    }

    public double getBestDistance() {
        return bestDistance;
    }

    public void setBestDistance(double bestDistance) {
        this.bestDistance = bestDistance;
    }

    public ListaSimple getHistory() {
        return history;
    }

    public void setHistory(ListaSimple history) {
        this.history = history;
    }
    
    public void simulation(){
        for (int i = 0; i < this.cycle; i++) {
            for (int j = 0; j < listAnts.getSize(); j++) {
                Ant ant = (Ant) listAnts.getContentByIndex(i);
                this.route(ant);
                this.increasePheromones();
            }
            this.evaporatePheromones();
        }
    }
    
    public void route(Ant ant){
        for (int i = 0; i < grafo.citiesQuantity(); i++) {
            break;
        }
    
    }
    
    public ListaSimple getNominatedCities(Ant ant){
        return null;
    }
    
    public ListaSimple probability(ListaSimple nominatedCities){
        return null;
    }
    
    public City chooseNextCity(ListaSimple probability, ListaSimple nominatedCities){
        return null;
    }
    
    public void increasePheromones(){
        
    }
    
    public void evaporatePheromones(){
    
    } 
}
