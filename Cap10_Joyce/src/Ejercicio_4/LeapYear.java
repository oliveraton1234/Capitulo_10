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
public class LeapYear exteds Year{
    
    public LeapYear() {
        this.dias = 366;
    }

    public void daysElapsed(int mes, int dia){
        int[] meses = {0,31, 29, 31, 30, 31, 30, 30, 31, 30, 31, 30, 31};
        for (int i = 0; i <mes ; i++) {
            dia += meses[i];
        }
        System.out.println(String.format("Han transcurrido %d dias desde el 1 de enero",dia));
    }

    @Override
    public Integer getDias() {
        return super.getDias();
    }
}
