package Ejercicio_1;

/**
 *
 * @author Admin
 */
public class RaceHorse extends Horse{
    private Integer noCarreras;

    public RaceHorse(String nombre, String color, Integer añoDeNacimiento, int noCarreras){
        super(nombre, color, añoDeNacimiento);
        this.noCarreras = noCarreras;
    }

    public Integer getNoCarreras() {
        return noCarreras;
    }

    public void setNoCarreras(Integer noCarreras) {
        this.noCarreras = noCarreras;
    }

    public void imprimir(){
        System.out.println(String.format("El nombre es: %s su color es %s su año de nacimiento es %d" +
                "y su total de carreras son : %d",getNombre(),getColor(),getAñoDeNacimiento(),getNoCarreras()));
    }
}
