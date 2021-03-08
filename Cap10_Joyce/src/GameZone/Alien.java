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
public class Alien {
     protected Integer noOjos;
    protected Integer noPatas;
    protected String color;

    public Alien(Integer noOjos, Integer noPatas, String color) {
        this.noOjos = noOjos;
        this.noPatas = noPatas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "noOjos=" + noOjos +
                ", noPatas=" + noPatas +
                ", color='" + color + '\'' +
                '}';
    }
}
