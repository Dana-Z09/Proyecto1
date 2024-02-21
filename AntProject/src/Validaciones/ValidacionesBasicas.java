/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validaciones;

/**
 *
 * @author alma
 */
public class ValidacionesBasicas {
    
    
   /**
    * Verifica si una cadena representa un número entero positivo.
    * @param entrada La cadena a verificar.
    * @return true si la cadena representa un número entero positivo, false de lo contrario.
    */
    public static boolean esEnteroPositivo(String entrada) {
        try {
            int num = Integer.parseInt(entrada);
            return num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
    
    /**
     * Verifica si una cadena representa un número decimal positivo.
     * @param entrada La cadena a verificar.
     * @return true si la cadena representa un número decimal positivo, false de lo contrario.
     */
    public static boolean esDecimalPositivo(String entrada) {
        try {
            double num = Double.parseDouble(entrada);
            return num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
    
    /**
     * Verifica si una opción está dentro de un rango válido.
     * @param opcion La opción a verificar.
     * @param minimo El valor mínimo del rango.
     * @param maximo El valor máximo del rango.
     * @return true si la opción está dentro del rango válido, false de lo contrario.
     */
    public static boolean esOpcionValida(int opcion, int minimo, int maximo) {
        return opcion >= minimo && opcion <= maximo;
    }

    
    
    /**
     * Verifica si una cadena no está vacía ni es nula.
     * @param cadena La cadena a verificar.
     * @return true si la cadena no está vacía ni es nula, false de lo contrario.
     */
    public static boolean esCadenaValida(String cadena) {
        return cadena != null && !cadena.trim().isEmpty();
    }

    
    
    /**
     * Verifica si una cadena contiene solo caracteres válidos.
     * @param cadena La cadena a verificar.
     * @param caracteresValidos Los caracteres permitidos.
     * @return true si la cadena contiene solo caracteres válidos, false de lo contrario.
     */
    public static boolean sonCaracteresValidos(String cadena, String caracteresValidos) {
        return cadena.matches("[" + caracteresValidos + "]+");
    }

    
    
    /**
     * Verifica si una cadena tiene una longitud dentro de un rango válido.
     * @param cadena La cadena a verificar.
     * @param longitudMinima La longitud mínima permitida.
     * @param longitudMaxima La longitud máxima permitida.
     * @return true si la cadena tiene una longitud dentro del rango válido, false de lo contrario.
     */
    public static boolean tieneLongitudValida(String cadena, int longitudMinima, int longitudMaxima) {
        int longitud = cadena.length();
        return longitud >= longitudMinima && longitud <= longitudMaxima;
    }

}
