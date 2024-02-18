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
    public City(int numCity, ListaSimple listAdy) {
        this.numCity = numCity;
        this.listAdy = listAdy;
    }

    
    //getters and setters de la clase City
    public int getNumCity() {
        return numCity;
    }

    public void setNumCity(int numCity) {
        this.numCity = numCity;
    }

    public ListaSimple getListAdy() {
        return listAdy;
    }

    public void setAdyacent(ListaSimple listAdy) {
        this.listAdy = listAdy;
    }
    
    //Primitivas
    
    public void addPath(Path path) {
        if (searchPath(path) == false) {
            listAdy.addEnd(path);
        }else {
            JOptionPane.showMessageDialog(null, "El camino solicitado ya existe", "Info", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void deletePath(Path path) {
        if (searchPath(path) == true) {
            listAdy.deleteElemC(path);
        }else {
            JOptionPane.showMessageDialog(null, "El camino solicitado no existe", "Info", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public boolean searchPath(Path path) {
        
        return listAdy.isInList(path);
        
    }
}
