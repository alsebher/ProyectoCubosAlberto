/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Alumno Mañana
 */
public class Cubo {
    //atributos
    private int ancho;
    private int alto;
    private int profundidad;
    
    //getter & setter

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    
    //constructor

    public Cubo(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public Cubo() {
    }
    
    
    //toString

    @Override
    public String toString() {
        return "Ancho: " + ancho + " m, Alto: " + alto + " m, Profundidad: " + profundidad + " m";
    }
    
    //método
    public int volumen(){
        return (this.alto*this.ancho)*this.profundidad;
    }
    
}
