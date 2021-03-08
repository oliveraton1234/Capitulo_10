/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZone2;

/**
 *
 * @author Admin
 */
public class LoadedDie extends Die{
    public LoadedDie(){
        this.numero = (int)(Math.random() * 6 + 2);
    }

    public void lanzar(){
        this.numero = (int)(Math.random() * 6 + 2);
    }
}
