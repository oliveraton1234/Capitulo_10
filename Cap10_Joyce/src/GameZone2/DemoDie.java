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
public class DemoDie {

   public static void main(String[] args) {
        Die a = new Die();
        Die b = new LoadedDie();
        int contador = 0;
        for (int i = 0; i < 101 ; i++) {
            a.lanzar();
            b.lanzar();
            if (a.getValor()>b.getValor()){
                contador++;
            }
        }

        System.out.println(contador);

        for (int i = 0; i < 101; i++) {
            a.lanzar();
            b.lanzar();
            if (a.getValor()<b.getValor()){
                contador++;
            }
        }
        System.out.println(contador);
    }
    
}
