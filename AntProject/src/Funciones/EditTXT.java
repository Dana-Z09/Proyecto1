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
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dams2
 */
public class EditTXT {
     /*
        Copia el txt en donde se encuentre el original
    
    
    */
    

    public void copytxt(){
        
        try {
            
        
            //Este string de la ruta es de prueba, hay que colocar el anthill del Jchooser
            String ruta = "C:\\Grafo.txt";
            String copia = "C:\\";
            System.out.println(copia);
            Path fuente = Paths.get(ruta);
            Scanner newgrafo = new Scanner(System.in);
            String nombre = newgrafo.nextLine();
            Path destino = Paths.get(copia);
            
            Files.copy(fuente, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
        System.out.println("fuap");
        }
    }
    /*
    Agrega una ciudad al txt
    
    
    */
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
            
            String linea2 = br2.readLine();
            
            while(linea2!=null) {
                System.out.println(linea2);
                linea2= br2.readLine();
            }
            
        } catch(IOException o) {
          System.out.println("fuap");  
        }
           
        
            
           }
    /*
    Recibe el numero de la ciudad a eliminar y la borra de todo el txt
    
    */
     public void deleteCity(int numCity){
        
        try(
                //Hay que hacer que tome el anhill del file chooser, o pedir la direccion(parametro)
                BufferedReader br = new BufferedReader(new FileReader("C:\\Grafo.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\NewGrafo.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("C:\\NewGrafo.txt"))
                
                
                ) {
            String linea = br.readLine();
            int countaristas = 0;
            while(linea!=null) {
                String deleteCity = Integer.toString(numCity) ;
                if (linea.equals(deleteCity)){
                    linea= br.readLine();
                }
                if (linea.equals("aristas")) {
                    countaristas++;
                    bw.write(linea);
                    bw.newLine();
                
                    linea = br.readLine();
                } 
                if (countaristas > 0) {
                    String[] arista = linea.split(",");
                    if (arista[0].equals(deleteCity)||arista[1].equals(deleteCity)) {
                    linea = br.readLine();
                    } else {
                    bw.write(linea);
                    bw.newLine();
                
                
                    linea = br.readLine();
                    }
                } else {
                
                bw.write(linea);
                bw.newLine();
                
                
                linea = br.readLine();
                }
            }
         
            bw.flush();
           
         
            String linea2 = br2.readLine();
            
            while(linea2!=null) {
                System.out.println(linea2);
                linea2= br2.readLine();
            }
            
        } catch(IOException o) {
          System.out.println("Error");  
        }
     }
        
     public void copyCity2(){
         //Aqui se supone que toma la direccion del chooser, pero por alguna razon despues de tomarla el programa se queda ejecutando, como si estuviera esperando algo
        JFileChooser fileChooser = new JFileChooser(); //Se crea elobjeto Jfilechooser
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt", "txt");
        String antHill = null;
        
        fileChooser.setFileFilter(filter);
        int selected = fileChooser.showOpenDialog(fileChooser);
        
        if(selected==JFileChooser.APPROVE_OPTION){
            antHill = fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println(antHill);
        
         System.out.println(antHill);
        try {
        
        
            //Este string de la ruta es de prueba, hay que colocar el anthill del Jchooser
            String ruta = antHill;
            String copia = antHill;
            Path fuente = Paths.get(ruta);
            Scanner newgrafo = new Scanner(System.in);
            String nombre = newgrafo.nextLine();
            Path destino = Paths.get(copia);
            
            Files.copy(fuente, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
        System.out.println("fuap");
        }
     }
    }
        
    /**
     * Limpia el txt original y coloca el String del grafo nuevo 
     * @param direccion es la direccion donde se encuentra ubicado el archivo txt
     * @param texto String retornado del toString() de la clase grafo
     */ 
     
     public void actualizarArchivo(String  direccion, String texto) {
        try(
                BufferedWriter bw = new BufferedWriter(new FileWriter(direccion));
                
                
                ) {

            bw.write(texto);
            bw.flush();

        } catch(IOException o) {
          System.out.println("Error");  
        }
    }
 }

