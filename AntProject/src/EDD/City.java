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
    /**
     * Agrega un camino a la ciudad en cuestion siempre y cuando el camino no exista ya 
     * @param path recibe un camino a agregar
     */
    public void addPath(Path path) {
        if (searchPath(path) == false) {
            listAdy.addEnd(path);
        }else {
            JOptionPane.showMessageDialog(null, "El camino solicitado ya existe", "Info", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    /**
     *Elimina un camino de la ciudad en cuestion siempre y cuando el camino no exista ya 
     * @param path recibe un camino a agregar
     */
    public void deletePath(Path path) {
        if (searchPath(path) == true) {
            listAdy.deleteElemC(path);
        }else {
            JOptionPane.showMessageDialog(null, "El camino solicitado no existe", "Info", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    /**
     *Busca si existe un camino en la ciudad en cuestion
     * @return true si la ciudad ya existe
     * @param path recibe un camino a agregar
     */
    public boolean searchPath(Path path) {
        if (path.getOrigin().getNumCity() == numCity){
            for (int i = 0; i < listAdy.getSize(); i++) {
                Path auxPath = (Path) listAdy.getContent(i);
                if(auxPath.getDestiny().getNumCity() == path.getDestiny().getNumCity()) {
                    return true;
                }
                
            }
        }
        return false;
        
    }
    /**
     *(Prueba) Busca si existe un camino en la ciudad en cuestion
     * @return true si la ciudad ya existe
     * @param path recibe un camino a agregar
     */
    public boolean searchPath2(Path path) {
        return listAdy.isInList(path);
        
    }
}
