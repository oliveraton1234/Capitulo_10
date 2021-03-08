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
public class HolidayCabinRental extends CabinRental{
    public HolidayCabinRental(int x){
        super(x);
        this.tarifa += 150;
    }
}
