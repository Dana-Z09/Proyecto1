package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Mendez y Daniela Zambrano
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
    public City(int numCity) {
        this.numCity = numCity;
        this.listAdy = new ListaSimple();
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
    /**
     * Agrega un camino a la ciudad en cuestion siempre y cuando el camino no exista ya 
     * @param path recibe un camino a agregar
     */
    public void addPath(Path path) {
        if (searchPathByPath(path) == false) {
            listAdy.addEnd(path);
        }else {
            JOptionPane.showMessageDialog(null, "El camino solicitado ya existe", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     *Elimina un camino de la ciudad en cuestion siempre y cuando el camino no exista ya 
     * @param path recibe un camino a agregar
     */
    public void deletePath(Path path) {
        if (searchPathByPath(path) == true) {
            listAdy.deleteElemC(path);
        }else {
            JOptionPane.showMessageDialog(null, "El camino solicitado no existe", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    /**
     *Busca si existe un camino en la ciudad en cuestion
     * @param path recibe un camino a agregar
     * @return true si la ciudad ya existe
     */
    public boolean searchPathByPath(Path path) {
        
        if (path.getOrigin().getNumCity() == this.numCity){
            for (int i = 0; i < listAdy.getSize(); i++) {
                Path auxPath = (Path) listAdy.getContentByIndex(i);
                if(auxPath.getDestination().getNumCity() == path.getDestination().getNumCity()) {
                    return true;
                }   
            }
            return false;
        }
        return false;
        
    }
    /**
     *(Prueba) Busca si existe un camino en la ciudad en cuestion
     * @param path recibe un camino a agregar
     * @return true si la ciudad ya existe
     */
    public boolean searchPath(Path path) {
        return listAdy.isInList(path);
        
    }
    
    /**
     *Busca una ciudad y la retorna a partir de su numero 
     * @param numCity recibe el numero de la ciudad
     * @return retorna la ciudad a la que pertenece el numero
     */
    public City searchPathByNumCity(int numCity) {
        if (numCity != this.numCity){
            for (int i = 0; i < listAdy.getSize(); i++) {
                Path auxPath = (Path) listAdy.getContentByIndex(i);
                if(auxPath.getDestination().getNumCity() == numCity) {
                    return auxPath.getDestination();
                }
            }
            return null;
        }
        return null;
        
    }
    public Path searchPathByNumCity2(int numCity) {
        if (numCity != this.numCity){
            for (int i = 0; i < listAdy.getSize(); i++) {
                Path auxPath = (Path) listAdy.getContentByIndex(i);
                if(auxPath.getDestination().getNumCity() == numCity) {
                    return auxPath;
                }
            }
            return null;
        }
        return null;
        
    }
    
    
}
