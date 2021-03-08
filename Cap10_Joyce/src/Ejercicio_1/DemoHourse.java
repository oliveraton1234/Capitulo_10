
package Ejercicio_1;

/**
 *
 * @author Admin
 */
public class DemoHourse {
    public static void main(String[] args) {
        Horse caballo = new Horse("pepe","negro",1998);
        RaceHorse sCaballo = new RaceHorse("juan","Gris",2001,56);

        System.out.println(caballo.toString());
        sCaballo.imprimir();
    }
}
