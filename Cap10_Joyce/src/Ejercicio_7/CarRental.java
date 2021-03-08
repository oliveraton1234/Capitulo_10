/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

/**
 *
 * @author Admin
 */
public class CarRental {
    private String nombre;
    private Integer cp;
    private String tamaño;
    protected Double tarifa;
    private Integer dias;
    protected Double cuota;

    public CarRental(String nombre, Integer cp, String tamaño, Integer dias) {
        this.nombre = nombre;
        this.cp = cp;
        this.tamaño = tamaño;
        this.dias = dias;
        calcular();
        this.cuota = this.tarifa * dias;
    }

    private void calcular(){
        if (this.tamaño == "CHICO"){
            this.tarifa = 29.99;
        }if (this.tamaño == "MEDIANO"){
            this.tarifa = 38.99;
        }else {
            this.tarifa = 43.50;
        }
    }

    @Override
    public String toString() {
        return "CarRental{" +
                "nombre='" + nombre + '\'' +
                ", cp=" + cp +
                ", tamaño='" + tamaño + '\'' +
                ", tarifa=" + tarifa +
                ", dias=" + dias +
                ", cuota=" + cuota +
                '}';
    }
}
