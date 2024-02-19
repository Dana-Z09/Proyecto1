package Funciones;

import javax.swing.JTextArea;

/**
 *
 * @author Daniela Zambrano
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
