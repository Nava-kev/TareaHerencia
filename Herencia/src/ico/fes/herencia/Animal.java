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
public class Animal {
    
    private String comida;
    private String color;
    private int numeroPatas;
    private int edad;
    private int peso;

    public Animal() {
    }

    public Animal(String comida, String color, int numeroPatas, int edad, int peso) {
        this.comida = comida;
        this.color = color;
        this.numeroPatas = numeroPatas;
        this.edad = edad;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "comida=" + comida + ", color=" + color + ", numeroPatas=" + numeroPatas + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
    
    
    
}
