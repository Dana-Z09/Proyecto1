package Funciones;

import EDD.City;
import EDD.Grafo;
import EDD.ListaSimple;
import EDD.Path;

/**
 *
 * @author Daniela Zambrano
 */
public class createTXT {
    /*public Grafo convertString(String txt){
        String[] lines=txt.split("\n");
        Grafo grafito= new Grafo();
        ListaSimple cities = new ListaSimple();
        
        boolean isCity= true;

        for (String line: lines){
            if (line.equals("aristas")){
                isCity=false;
                continue;}
            if (isCity){
                if(!line.equals("ciudad")){
                    int city = Integer.parseInt(line);
                    City c = new City(city);
                    cities.addEnd(c);}}
            else{
                String[] elements = line.split(",");
                int origin= Integer.parseInt(elements[0]);
                
                int destination= Integer.parseInt(elements[1]);
                 
                double distance= Double.parseDouble(elements[2]);
                
                City cityA = searchCity(origin, destination);
                        
            
            }
        }
    
    
    }
    
    
    
    
    /*
    public City searchCity(int num, ListaSimple cities){
        if (!cities.isEmpty()){
            for ()
        
        
        }
    
    
    }
    */
}




