/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author Admin
 */
public class UseYear {
   public static void main(String[] args) {
        Year año1 = new Year();
        System.out.println(año1.getDias());

        LeapYear año2 = new LeapYear();
        System.out.println(año2.getDias());
    }   
}
