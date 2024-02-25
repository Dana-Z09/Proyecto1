package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Mendez
 */
public class Grafo {

    //Atributos de la clase
    private ListaSimple cities;

    //Constructor
    
    public Grafo() {
    }

    public Grafo(ListaSimple cities) {
        this.cities = cities;
    }

    //getters y setters de la clase
    public ListaSimple getCities() {
        return cities;
    }

    public void setCities(ListaSimple cities) {
        this.cities = cities;
    }

    //Primtivas
    /**
     * Verifica si el grafo esta vacio
     *
     * @return true si el grafo no tiene ninguna ciudad
     */
    public boolean grafoIsEmpty() {
        return cities.getHead() == null;

    }

    /**
     * Muestra cuantas ciudades hay en el hormiguero
     *
     * @return cuantas ciudades tiene el hormiguero
     */
    public int citiesQuantity() {
        return cities.getSize();
    }

    /**
     * Muestra si un camino existe en el hormiguero
     *
     * @return true si un camino (Path) existe en el hormiguero
     * @param path recibe el camino a buscar
     */
    public boolean searchPathGrafo(Path path) {
        for (int i = 0; i < cities.getSize(); i++) {
            City auxCity = (City) cities.getContentByIndex(i);
            if (auxCity.searchPathByPath(path) == true) {
                return true;
            }
        }
        return false;

    }

    /**
     * Muestra si una ciudad existe en el hormiguero
     *
     * @return true si una ciudad (City) existe en el hormiguero
     * @param city recibe la ciudad a buscar
     */
    public boolean searchCityGrafo(City city) {
        Nodo aux = this.getCities().getHead();
        City c;
        for (int i = 0; i < cities.getSize(); i++) {
            c = (City) aux.getContent();

            //    City auxCity = new City((int)cities.getContentByIndex(i));
            if (c.getNumCity() == city.getNumCity()) {
                return true;
            }
            aux = aux.getpNext();
        }
        return false;
    }

    /**
     * Agrega una ciudad al hormiguero siempre y cuando no se repita
     *
     * @param city recibe la ciudad a agregar
     */
    public void addCity(City city) {
        if (searchCityGrafo(city) == false) {
            cities.addEnd(city);
            JOptionPane.showMessageDialog(null, "Ciudad agregada correctamente", "Info", 0);
        } else {
            JOptionPane.showMessageDialog(null, "La ciudad ya existe", "Info", 0);
        }
    }

    /**
     * Conecta dos ciudades del hormiguero siempre y cuando no esten ya
     * conectadas
     *
     * @param path recibe el camino a agregar (No terminado)
     */
    public void connectCity(Path path) {
        if (searchPathGrafo(path) == false) {
            for (int i = 0; i < cities.getSize(); i++) {
                City auxCity = (City) cities.getContentByIndex(i);
                if (auxCity.getNumCity() == path.getOrigin().getNumCity()) {
                    auxCity.getListAdy().addEnd(path);

                } else if (auxCity.getNumCity() == path.getDestination().getNumCity()) {
                    Path auxPath = new Path(auxCity, path.getOrigin(), path.getDistance());
                    auxCity.getListAdy().addEnd(auxPath);

                }
                JOptionPane.showMessageDialog(null, "Camino agregado", "info", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El camino ya existe", "info", 0);
        }
    }

    /**
     * Borra una ciudad del hormiguero si existe
     *
     * @param city recibe la ciudad a borrar
     */
    public void deleteCity(City city) {
        if (searchCityGrafo(city) == true) {
            cities.deleteElemC(city);
            JOptionPane.showMessageDialog(null, "Ciudad borrada correctamente", "info", 0);
        } else {
            JOptionPane.showMessageDialog(null, "La ciudad a borrar no existe", "info", 0);
        }
    }

    /**
     * Borra un camino del hormiguero si existe
     *
     * @param path indica el camino a eliminar
     */
    public void disconnectCity(Path path) { ///Hay que cambiar esta funcion 
        if (searchPathGrafo(path) == true) {
            for (int i = 0; i < cities.getSize(); i++) {
                City auxCity = (City) cities.getContentByIndex(i);
                if (auxCity.getNumCity() == path.getOrigin().getNumCity()) {
                    auxCity.getListAdy().deleteElemC(path);

                } else if (auxCity.getNumCity() == path.getDestination().getNumCity()) {
                    Path auxPath = new Path(auxCity, path.getOrigin(), path.getDistance());
                    auxCity.getListAdy().deleteElemC(auxPath);

                }
                JOptionPane.showMessageDialog(null, "Camino eliminado", "info", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El camino no existe", "info", 0);
        }
    }

    
    /**
     * Convierte un grafo a un string donde muestra la estructura en Ciudades y Caminos
     */
    public String toString() {
        StringBuilder show = new StringBuilder();
        show.append("Ciudades:\n");
        ListaSimple lG = this.cities;
        Nodo n = lG.getHead();
        for (int i = 0; i < lG.getSize(); i++) {
            City c = (City) n.getContent();
            int num = c.getNumCity();
            show.append(String.valueOf(num)).append("\n");
            n=n.getpNext();
        }
        show.append("Aristas:\n");
        n = lG.getHead();
        for (int j = 0; j < lG.getSize(); j++) {
            City c = (City) n.getContent();
            Nodo n2 = c.getListAdy().getHead();
            for (int i = 0; i < c.getListAdy().getSize(); i++) {
                Path p = (Path) n2.getContent();
                if (p.getOrigin().getNumCity()<p.getDestination().getNumCity()){
                show.append(String.valueOf(p.getOrigin().getNumCity())).append(",").append(String.valueOf(p.getDestination().getNumCity())).append(",").append(String.valueOf(p.getDistance()));
                show.append("\n");
                }
                n2=n2.getpNext();
            }
            
            n=n.getpNext();
        }
        return show.toString();
    }
}
