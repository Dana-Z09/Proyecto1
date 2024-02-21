/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validaciones;

import java.io.File;
import java.util.Map;
import EDD.Grafo;
import EDD.City;


public class Validaciones {

    /**
     * Verifica si el número de ciclos especificado es un número entero positivo.
     * @param numCiclos El número de ciclos a verificar.
     * @return true si el número de ciclos es un entero positivo, false de lo contrario.
     */
    public static boolean validarNumeroCiclos(int numCiclos) {
        return numCiclos > 0;
    }

    
    
    
    /**
     * Asegura que el número de hormigas sea un número entero positivo y no exceda un cierto límite razonable.
     * @param numHormigas El número de hormigas a verificar.
     * @param limiteSuperior El límite superior para el número de hormigas.
     * @return true si el número de hormigas es un entero positivo y no excede el límite superior, false de lo contrario.
     */
    public static boolean validarNumeroHormigas(int numHormigas, int limiteSuperior) {
        return numHormigas > 0 && numHormigas <= limiteSuperior;
    }

    
    
    
    /**
     * Verifica que los valores de α, β y ρ estén dentro de un rango específico y sean números válidos.
     * @param alfa Valor de α a verificar.
     * @param beta Valor de β a verificar.
     * @param rho Valor de ρ a verificar.
     * @return true si los valores de α, β y ρ están dentro del rango específico y son números válidos, false de lo contrario.
     */
    public static boolean validarValores(double alfa, double beta, double rho) {
        return alfa >= 0 && beta >= 0 && rho >= 0;
    }

    
    
    /**
     * Comprueba que las ciudades de partida y llegada sean ciudades válidas en el grafo.
     * @param ciudadPartida Ciudad de partida a verificar.
     * @param ciudadLlegada Ciudad de llegada a verificar.
     * @param grafo Grafo de ciudades en el que buscar las ciudades.
     * @return true si las ciudades de partida y llegada son ciudades válidas en el grafo, false de lo contrario.
     */
    public static boolean validarCiudades(City ciudadPartida, City ciudadLlegada, Grafo grafo) {
        return grafo.contieneCiudad(ciudadPartida) && grafo.contieneCiudad(ciudadLlegada);
    }

    
    
    
    /**
     * Verifica que el nombre de la ciudad no esté vacío ni sea nulo, que sea único en el grafo
     * y que las distancias proporcionadas a otras ciudades sean números válidos y no negativos.
     * @param nombreCiudad Nombre de la ciudad a agregar.
     * @param ciudades Mapa de ciudades existentes en el grafo.
     * @param distancias Distancias a otras ciudades.
     * @return true si todas las validaciones son exitosas, false de lo contrario.
     */
    public static boolean validarAgregarCiudad(String nombreCiudad, Map<String, City> ciudades, double[] distancias) {
        if (nombreCiudad == null || nombreCiudad.isEmpty() || ciudades.containsKey(nombreCiudad)) {
            return false;
        }
        for (double distancia : distancias) {
            if (distancia < 0) {
                return false;
            }
        }
        return true;
    }

    
    
    
    /**
     * Verifica que la ciudad a eliminar exista en el grafo.
     * @param ciudad Ciudad a eliminar.
     * @param grafo Grafo de ciudades en el que buscar la ciudad.
     * @return true si la ciudad a eliminar existe en el grafo, false de lo contrario.
     */
    public static boolean validarEliminarCiudad(City ciudad, Grafo grafo) {
        return grafo.contieneCiudad(ciudad);
    }

    
    
    
    /**
     * Comprueba que el archivo exista y sea accesible, y valida su formato para asegurarse de que contiene datos de grafo válidos.
     * @param nombreArchivo Nombre del archivo a cargar.
     * @return true si el archivo existe, es accesible y su formato es válido, false de lo contrario.
     */
    public static boolean validarCargarGrafo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        return file.exists() && file.isFile() && file.canRead();
    }

    
    
    
    /**
     * Verifica que se pueda escribir en la ubicación especificada
     * y valida que el grafo a guardar contenga datos válidos y no esté vacío.
     * @param grafo Grafo de ciudades a guardar.
     * @return true si se puede escribir en la ubicación especificada y el grafo contiene datos válidos, false de lo contrario.
     */
    public static boolean validarGuardarGrafo(Grafo grafo) {
        return !grafo.getCiudades().isEmpty();
    }
}
