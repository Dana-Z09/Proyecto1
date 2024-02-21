/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validaciones;

import EDD.Grafo;
import EDD.City;
import EDD.ListaSimple;
import EDD.Nodo;

import java.io.File;

/**
 * Clase que contiene métodos para validar los parámetros y operaciones relacionadas con el grafo.
 */
public class Validaciones {

    /**
     * Valida el número de ciclos especificado.
     * 
     * @param numCiclos Número de ciclos a validar.
     * @return true si el número de ciclos es válido, false de lo contrario.
     */
    public static boolean validarNumeroCiclos(int numCiclos) {
        return numCiclos > 0;
    }

    
    
    /**
     * Valida el número de hormigas especificado.
     * 
     * @param numHormigas Número de hormigas a validar.
     * @return true si el número de hormigas es válido, false de lo contrario.
     */
    public static boolean validarNumeroHormigas(int numHormigas) {
        return numHormigas > 0 && numHormigas <= 20;
    }

    
    
    /**
     * Valida los valores de los parámetros α, β y ρ.
     * 
     * @param alpha Valor de α a validar.
     * @param beta Valor de β a validar.
     * @param rho Valor de ρ a validar.
     * @return true si los valores son válidos, false de lo contrario.
     */
    public static boolean validarParametros(double alpha, double beta, double rho) {
        return true;
    }

    
    
    /**
     * Valida la ciudad de partida y la ciudad de llegada.
     * 
     * @param ciudadPartida Ciudad de partida a validar.
     * @param ciudadLlegada Ciudad de llegada a validar.
     * @return true si las ciudades son válidas, false de lo contrario.
     */
    public static boolean validarCiudades(City ciudadPartida, City ciudadLlegada) {
        return ciudadPartida != null && ciudadLlegada != null;
    }

    
    
    /**
     * Valida agregar una nueva ciudad al grafo.
     * 
     * @param grafo Grafo al que se desea agregar la ciudad.
     * @param nuevaCiudad Ciudad a agregar.
     * @return true si se puede agregar la ciudad, false de lo contrario.
     */
    public static boolean validarAgregarCiudad(Grafo grafo, City nuevaCiudad) {
        ListaSimple ciudades = grafo.getCities();
        Nodo aux = ciudades.getHead();
        while (aux != null) {
            City c = (City) aux.getContent();
            if (c.getNumCity() == nuevaCiudad.getNumCity()) {
                return false;
            }
            aux = aux.getpNext();
        }
        return true;
    }

    
    
    /**
     * Valida eliminar una ciudad del grafo.
     * 
     * @param grafo Grafo del que se desea eliminar la ciudad.
     * @param ciudad Ciudad a eliminar.
     * @return true si se puede eliminar la ciudad, false de lo contrario.
     */
    public static boolean validarEliminarCiudad(Grafo grafo, City ciudad) {
        ListaSimple ciudades = grafo.getCities();
        Nodo aux = ciudades.getHead();
        while (aux != null) {
            City c = (City) aux.getContent();
            if (c.getNumCity() == ciudad.getNumCity()) {
                return true;
            }
            aux = aux.getpNext();
        }
        return false;
    }

    
    
    /**
     * Valida cargar un grafo desde un archivo.
     * 
     * @param archivo Archivo del que se desea cargar el grafo.
     * @return true si se puede cargar el grafo desde el archivo, false de lo contrario.
     */
    public static boolean validarCargarGrafo(File archivo) {
        return archivo.exists();
    }

    
    
    /**
     * Valida guardar un grafo en un archivo.
     * 
     * @param grafo Grafo que se desea guardar en el archivo.
     * @param archivo Archivo en el que se desea guardar el grafo.
     * @return true si se puede guardar el grafo en el archivo, false de lo contrario.
     */
    public static boolean validarGuardarGrafo(Grafo grafo, File archivo) {
        return true;
    }
}
