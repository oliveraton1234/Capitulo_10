
package Ejercicio_1;

/**
 *
 * @author Admin
 */
public abstract class Horse {
  private String nombre;
    private String color;
    private Integer añoDeNacimiento;

    public Horse(String nombre, String color, Integer añoDeNacimiento) {
        this.nombre = nombre;
        this.color = color;
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAñoDeNacimiento() {
        return añoDeNacimiento;
    }

    public void setAñoDeNacimiento(Integer añoDeNacimiento) {
        this.añoDeNacimiento = añoDeNacimiento;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", añoDeNacimiento=" + añoDeNacimiento +
                '}';
    }
}
