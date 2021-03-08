/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_9;

/**
 *
 * @author Admin
 */
public class Vehicle {
    private Integer noRuedas;
    private Integer promedio;

    public Vehicle(Integer noRuedas, Integer promedio) {
        this.noRuedas = noRuedas;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noRuedas=" + noRuedas +
                ", promedio=" + promedio +
                '}';
    }
}
