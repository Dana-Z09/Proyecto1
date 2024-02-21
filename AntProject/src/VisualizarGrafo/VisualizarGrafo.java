/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisualizarGrafo;

import EDD.Grafo;
import EDD.City;
import EDD.ListaSimple;
import EDD.Nodo;
import EDD.Path;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class VisualizarGrafo {
    
    // Método para visualizar el grafo
    public static void visualizarGrafo(Grafo grafo) {
        // Crear un nuevo grafo de GraphStream
        Graph graph = new SingleGraph("Grafo");
        
        // Configurar el estilo de los nodos
        graph.setAttribute("ui.stylesheet", "node { size: 20px; shape: circle; fill-color: blue; text-size: 15px; text-alignment: center; }");

        // Agregar nodos al grafo
        ListaSimple listaNodos = grafo.getCities();
        Nodo nodoActual = listaNodos.getHead();
        for (int i = 0; i < listaNodos.getSize(); i++) {
            City ciudad = (City) nodoActual.getContent();
            graph.addNode(Integer.toString(ciudad.getNumCity())).setAttribute("ui.label", Integer.toString(ciudad.getNumCity()));
            nodoActual = nodoActual.getpNext();
        }
        
        // Recorrer nuevamente los nodos para agregar las aristas
        nodoActual = listaNodos.getHead();
        for (int i = 0; i < listaNodos.getSize(); i++) {
            City ciudad = (City) nodoActual.getContent();
            ListaSimple listaAdyacentes = ciudad.getListAdy();
            Nodo nodoAdyacente = listaAdyacentes.getHead();
            for (int j = 0; j < listaAdyacentes.getSize(); j++) {
                Path camino = (Path) nodoAdyacente.getContent();
                City destino = camino.getDestination();
                graph.addEdge(Integer.toString(ciudad.getNumCity()) + "-" + Integer.toString(destino.getNumCity()), 
                               Integer.toString(ciudad.getNumCity()), 
                               Integer.toString(destino.getNumCity()), true);
                nodoAdyacente = nodoAdyacente.getpNext();
            }
            nodoActual = nodoActual.getpNext();
        }

        // Visualizar el grafo
        graph.display();
    }
}
