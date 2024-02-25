package Funciones;

import EDD.City;
import EDD.Grafo;
import EDD.ListaSimple;
import EDD.Path;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniela Zambrano
 */
public class uploadTXT {
    /**
    *
    * 
     * @param txt Ingresas un String con el contenido del grafo
     * @return Grafo Retorna un grafo a partir de un string 
     * 
    */
    public Grafo convertString(String txt){
        txt=txt.replace("\r", "");
        String[] lines=txt.split("\n");
        ListaSimple cities = new ListaSimple(); 
        String wordCity = "ciudad";
        Grafo grafo = new Grafo();
        
        
        boolean isCity= true;
        
        for (String line: lines){
            if (line.equals("aristas")){
                isCity=false;
                continue;}
                
            if (isCity){                
                if(!line.equals(wordCity)){
                    int cityNum = Integer.parseInt(line);
                    City c = new City(cityNum);
                    cities.addEnd(c);
                    }
                
                }
            else{
                String[] elements = line.split(",");
                                
                int origin= Integer.parseInt(elements[0]);
                int destination= Integer.parseInt(elements[1]);
                double distance= Double.parseDouble(elements[2]);
                
                City cityA = searchCity(origin, cities);
                City cityB = searchCity(destination, cities);
                Path pathA=new Path(cityA,cityB, distance);
                Path pathB=new Path(cityB,cityA, distance);
                
                cityA.getListAdy().addEnd(pathA);
                cityB.getListAdy().addEnd(pathB);
                     
            }
            
                
        }
        
        
        grafo.setCities(cities);
        JOptionPane.showMessageDialog(null, "Se ha creado el grafo exitosamente", "Info", 1);
        return grafo;
    }
    
    
    public City searchCity(int num, ListaSimple cities){
        if (!cities.isEmpty()){
            for (int i = 0; i < cities.getSize(); i++) {
                City c = (City) cities.getContentByIndex(i);
                if (c.getNumCity()==num){return c;}}
            return null;
        }
        return null;
    }
}