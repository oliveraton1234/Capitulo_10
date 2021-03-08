/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LuxuryCarRental extends CarRental{
   Scanner sc;
    public LuxuryCarRental(String nombre, Integer cp, String tamaño, Integer dias){
        super(nombre, cp, tamaño, dias);
        this.tarifa = 79.99;
        sc = new Scanner(System.in);
        System.out.println("¿Quieres incluir a un chofer? serian $200 mas");
        System.out.println("[1] Si [2] No");
        int x = sc.nextInt();
        this.cuota = this.tarifa * dias;
        if (x == 1){
            this.cuota += 200;
        }

    }

    @Override
    public String toString() {
        return "LuxuryCarRental{" +
                "tarifa=" + tarifa +
                ", cuota=" + cuota +
                ", sc=" + sc +
                '}';
    }   
}
