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
public class DemoCarRental {
  public static void main(String[] args) {
        CarRental a = new CarRental("Olivia",160,"CHICO",2);
        System.out.println(a.toString());

        LuxuryCarRental b = new LuxuryCarRental("Olivia",160,"CHICO",2);
        System.out.println(b.toString());
    }
}
