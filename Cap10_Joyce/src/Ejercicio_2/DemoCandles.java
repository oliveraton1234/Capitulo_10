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
public class DemoCandles {
    public static void main(String[] args) {
        Candle vela = new Candle("blanco",12.3);
        ScentedCandle vela2 = new ScentedCandle("Rosa",13.2,"rosas");
        vela.imprimir();
        vela2.imprimir();
    }
    
}
