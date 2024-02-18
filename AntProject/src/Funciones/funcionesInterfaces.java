/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import javax.swing.JTextArea;

/**
 *
 * @author Danna Star
 */
public class funcionesInterfaces {
    public static JTextArea makeLabelStyle(JTextArea textArea) {
    if (textArea == null)
      return null;
    textArea.setEditable(false);
    textArea.setCursor(null);
    textArea.setOpaque(false);
    textArea.setFocusable(false);
    return textArea;
    }
    
}
