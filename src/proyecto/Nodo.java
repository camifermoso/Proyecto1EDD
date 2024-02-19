/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author santi
 */
public class Nodo {

    private String dato;
    private Nodo siguiente;
    private int feromonas;

    public Nodo(String pal) {
        this.dato = pal;
        this.siguiente = null;
        this.feromonas = 0;

    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the feromonas
     */
    public int getFeromonas() {
        return feromonas;
    }

    /**
     * @param feromonas the feromonas to set
     */
    public void setFeromonas(int feromonas) {
        this.feromonas = feromonas;
    }
}
