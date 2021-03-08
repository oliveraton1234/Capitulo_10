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
public class ScentedCandle extends Candle{
    private String aroma;

    public ScentedCandle(String color, Double altura,String aroma){
        super(color,altura);
        this.aroma = aroma;
        setPrecio(3);
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void imprimir(){
        System.out.println(String.format("La vela es de color %s tiene una altura de %.2f cuesta %.2f y tiene un aroma de %s",getColor(),getAltura(),getPrecio(),getAroma()));
    }

}
