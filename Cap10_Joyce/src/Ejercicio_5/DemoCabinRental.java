/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

/**
 *
 * @author Admin
 */
public class DemoCabinRental {
public static void main(String[] args) {
        CabinRental a = new CabinRental(2);
        System.out.println(a.getTarifa());

        HolidayCabinRental b = new HolidayCabinRental(2);
        System.out.println(b.getTarifa());
    }
    
}
