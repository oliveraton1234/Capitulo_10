/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZone;

/**
 *
 * @author Admin
 */
public class DemoAlien {

    public static void main(String[] args) {
        Alien a = new Martian(2,7,"chicle");
        System.out.println(a.toString());

        
        Alien b = new Jupiterian(1, 10,"Gris");
        System.out.println(b.toString());
    }
}
