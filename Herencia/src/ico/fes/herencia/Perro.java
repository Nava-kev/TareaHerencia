/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author kevin
 */
public class Perro extends Animal {
    
    private String nombre;
    private String raza;
    private String ladrar;

    public Perro() {
    }

    public Perro(String nombre, String raza, String ladrar, String comida, String color, int numeroPatas, int edad, int peso) {
        super(comida, color, numeroPatas, edad, peso);
        this.nombre = nombre;
        this.raza = raza;
        this.ladrar = ladrar;
    }

    public Perro(String nombre, String raza, String ladrar) {
        this.nombre = nombre;
        this.raza = raza;
        this.ladrar = ladrar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getLadrar() {
        return ladrar;
    }

    public void setLadrar(String ladrar) {
        this.ladrar = ladrar;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", ladrar=" + ladrar + '}';
    }

    
    
}
