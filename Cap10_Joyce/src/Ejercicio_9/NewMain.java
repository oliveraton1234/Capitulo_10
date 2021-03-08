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
public class NewMain {

    public static void main(String[] args) {
        Vehicle a = new Car(23);
        System.out.println(a.toString());

        Vehicle b = new MotorCycle(12);
        System.out.println(b.toString());
    }
    
}
