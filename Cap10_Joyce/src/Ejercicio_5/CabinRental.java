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
public class CabinRental {
    private Integer noCabina;
    protected Double tarifa;

    public CabinRental(int x){
        this.noCabina = x;
        if (x<=3){
            this.tarifa = 950.0;
        }else{
            this.tarifa = 1100.0;
        }
    }

    public Integer getNoCabina() {
        return noCabina;
    }

    public Double getTarifa() {
        return tarifa;
    }
}
