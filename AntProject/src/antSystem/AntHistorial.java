/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antSystem;

/**
 *
 * @author Danna Star
 */
public class AntHistorial {
    private int numAnt;
    private String caminorecorrido;
    private String longitudrecorrida;

    public AntHistorial(int numAnt, String caminorecorrido, String longitudrecorrida) {
        this.numAnt = numAnt;
        this.caminorecorrido = caminorecorrido;
        this.longitudrecorrida = longitudrecorrida;
    }

    public int getNumAnt() {
        return numAnt;
    }

    public void setNumAnt(int numAnt) {
        this.numAnt = numAnt;
    }

    public String getCaminorecorrido() {
        return caminorecorrido;
    }

    public void setCaminorecorrido(String caminorecorrido) {
        this.caminorecorrido = caminorecorrido;
    }

    public String getLongitudrecorrida() {
        return longitudrecorrida;
    }

    public void setLongitudrecorrida(String longitudrecorrida) {
        this.longitudrecorrida = longitudrecorrida;
    }
    
    
}
