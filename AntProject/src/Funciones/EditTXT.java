/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author dams2
 */
public class EditTXT {
    public void copyCity(){
        
        try {
            //Este string de la ruta es de prueba, hay que colocar el anthill del Jchooser
            String ruta = "C:\\Users\\dams2\\Desktop\\ubicaciontxt\\Grafo.txt";
            Path fuente = Paths.get(ruta);
            Path destino = Paths.get("C:\\Users\\dams2\\Desktop\\ubicaciontxt\\NewGrafo.txt");
            
            Files.copy(fuente, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
        System.out.println("fuap");
        }
    }
    public void addCityTxt(){
        
        try(//Hay que hacer que tome el anhill del file chooser
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dams2\\Desktop\\ubicaciontxt\\Grafo.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\dams2\\Desktop\\ubicaciontxt\\NewGrafo.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\dams2\\Desktop\\ubicaciontxt\\NewGrafo.txt"))
                
                
                ) {
            String linea = br.readLine();
            
            int quantityCities = 0;
            while(linea!=null) {
                int count = 0;
                quantityCities++;
                String aristas = "aristas";
                if (linea.equals(aristas)){
                    bw.write(Integer.toString(quantityCities-1));
                    bw.newLine();
                    count++;
                }
                bw.write(linea);
                bw.newLine();
                linea= br.readLine();
                
            }
            bw.flush();
            
            
        } catch(IOException o) {
          System.out.println("fuap");  
        }
           
        
            
           }
    public void deleteCity(int numCity){
        try(
                //Hay que hacer que tome el anhill del file chooser
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dams2\\Desktop\\ubicaciontxt\\Grafo.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\dams2\\Desktop\\ubicaciontxt\\NewGrafo.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\dams2\\Desktop\\ubicaciontxt\\NewGrafo.txt"))
                
                
                ) {
            String linea = br.readLine();
            while(linea!=null) {
                String deleteCity = Integer.toString(numCity) ;
                if (linea.equals(deleteCity)){
                    linea= br.readLine();
                }
                bw.write(linea);
                bw.newLine();
                linea= br.readLine();
                
            }
            bw.flush();
            
            /*
            while(linea!=null) {
                bw.write(linea);
                bw.newLine();
                linea= br.readLine();
            }
            bw.flush();
             */
            String linea2 = br2.readLine();
            
            while(linea2!=null) {
                System.out.println(linea2);
                linea2= br2.readLine();
            }
            
        } catch(IOException o) {
          System.out.println("Error");  
        }
        
        
    }
}
