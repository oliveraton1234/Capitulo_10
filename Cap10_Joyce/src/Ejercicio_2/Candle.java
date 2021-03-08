/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Admin
 */
public class Candle {
     private String color;
    private Double altura;
    private  Double precio;

    public Candle(String color, Double altura){
        this.color = color;
        this.altura = altura;
        setPrecio();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio() {
        this.precio = this.altura * 2.0;
    }

    public void setPrecio(int precio) {
        this.precio = this.altura * precio;
    }

    public void imprimir(){
        System.out.println(String.format("La vela es de color %s y tiene una alura de %.2f y cuesta %.2f",this.color,this.altura,this.precio));
    }   
}
