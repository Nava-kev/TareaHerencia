/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ico.fes.herencia.Gato;
import ico.fes.herencia.Perro;

/**
 *
 * @author kevin
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro = new Perro("Horus","Labrador", "ladrar","Pedigree","Cafe", 4, 2, 20);
        Gato gato = new Gato("Azrael", "Himalaya", "Maullar", "Gatina", "Negro", 4, 2, 3);
        
        System.out.println(" Nombre: " + perro.getNombre() + " Raza: " + perro.getRaza() 
                + " Sonido: " + perro.getLadrar() + " Comida: " + perro.getComida()
                + " Color: " + perro.getColor() + " Patas: " + perro.getNumeroPatas() 
                + " Edad: " + perro.getEdad() + " Peso: " + perro.getPeso() +  " Kg");
         
       System.out.println("Nombre: " + gato.getNombre() + " Raza: " + gato.getRaza() 
                + " Sonido: " + gato.getLadrar() + " Comida: " + gato.getComida()
                + " Color: " + gato.getColor() + " Patas: " + gato.getNumeroPatas() 
                + " Edad: " + gato.getEdad() + " Peso: " + gato.getPeso() + " Kg");
    }
    
}
