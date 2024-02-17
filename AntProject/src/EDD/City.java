package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Mendez
 */
public class City {
    //Atributos de la clase City
    private int numCity;
    private ListaSimple listAdy;     

    //Constructor de la clase City
    public City(int numCity, ListaSimple adyacent) {
        this.numCity = numCity;
        this.listAdy = adyacent;
    }

    
    //getters and setters de la clase City
    public int getNumCity() {
        return numCity;
    }

    public void setNumCity(int numCity) {
        this.numCity = numCity;
    }

    public ListaSimple getAdyacent() {
        return listAdy;
    }

    public void setAdyacent(ListaSimple adyacent) {
        this.listAdy = adyacent;
    }
    
    //Primitivas
    
    public void addPath(Path path) {
        if (searchPath(path)) {
            listAdy.addEnd(path);
        }else {
            JOptionPane.showMessageDialog(null, "El camino solicitado ya existe", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void deletePath(Path path) {
        if (searchPath(path)) {
            listAdy.deleteElemC(path);
        }else {
            JOptionPane.showMessageDialog(null, "El camino solicitado no existe", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public boolean searchPath(Path path) {
        
        return listAdy.isInList(path);
        
    }
}
