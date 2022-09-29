/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import clases.Cubo;

/**
 *
 * @author Alumno Mañana
 */
public class ProyectoCuboAlberto {
    public static void main(String[] args) {
        Cubo c1 = new Cubo(5,5,5);
        Cubo c2 = new Cubo(2,3,4);
        System.out.println("Cubo 1: "+c1.toString());
        System.out.println("Cubo 2: "+c2.toString());
        System.out.println("");
        System.out.println("Volumen del cubo 1: "+c1.volumen()+" m^3");
        System.out.println("Volumen del cubo 2: "+c2.volumen()+" m^3");
        
    }
  
    
}
