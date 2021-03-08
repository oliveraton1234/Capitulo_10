/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Admin
 */
public class TennisGame {
        private String jugador1;
    private String jugador2;
    private Integer puntuacionJ1;
    private Integer puntuacionJ2;
    private String puntuacionFinalJ1;
    private String puntuacionFinalJ2;

    public TennisGame(String jugador1, String jugador2, Integer puntuacionJ1, Integer puntuacionJ2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.puntuacionJ1 = puntuacionJ1;
        this.puntuacionJ2 = puntuacionJ2;
        if (puntuacionJ1 >= 5){
            this.puntuacionFinalJ1 = "ERROR";
        }if (puntuacionJ2 >= 5){
            this.puntuacionFinalJ2 = "ERROR";
        }else {
            this.puntuacionFinalJ1 = Integer.toString(puntuacionJ1);
            this.puntuacionFinalJ2 = Integer.toString(puntuacionJ2);
        }

        String x = null;
        puntuacionFinal(this.puntuacionJ1, x);
        puntuacionFinal(this.puntuacionJ2, this.puntuacionFinalJ2);

        this.puntuacionFinalJ1 = x;
        System.out.println(x);
        System.out.println(this.puntuacionFinalJ1);
    }

    public void puntuacionFinal(int y, String string){
        switch (y){
            case 1:
                string = "Amor";
            break;
            case 2:
                string = "15";
            break;
            case 3:
                string = "30";
            break;
            case 4:
                string = "40";
            break;
            default:
                string = "ERROR";
        }
        System.out.println(string);
    }

    public void nombres(String jg1, String jg2){
        this.jugador1 = jg1;
        this.jugador2 = jg2;
    }

    public void puntuaciones(String x, String y){
        this.puntuacionFinalJ1 = x;
        this.puntuacionFinalJ2 = y;
    }

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public Integer getPuntuacionJ1() {
        return puntuacionJ1;
    }

    public void setPuntuacionJ1(Integer puntuacionJ1) {
        this.puntuacionJ1 = puntuacionJ1;
    }

    public Integer getPuntuacionJ2() {
        return puntuacionJ2;
    }

    public void setPuntuacionJ2(Integer puntuacionJ2) {
        this.puntuacionJ2 = puntuacionJ2;
    }

    public String getPuntuacionFinalJ1() {
        return puntuacionFinalJ1;
    }

    public String getPuntuacionFinalJ2() {
        return puntuacionFinalJ2;
    }

    private void setPuntuacionFinalJ1(String puntuacionFinalJ1) {
        this.puntuacionFinalJ1 = puntuacionFinalJ1;
    }

    private void setPuntuacionFinalJ2(String puntuacionFinalJ2) {
        this.puntuacionFinalJ2 = puntuacionFinalJ2;
    }

    @Override
    public String toString() {
        return "TennisGame{" +
                "jugador1='" + jugador1 + '\'' +
                ", jugador2='" + jugador2 + '\'' +
                ", puntuacionJ1=" + puntuacionJ1 +
                ", puntuacionJ2=" + puntuacionJ2 +
                ", puntuacionFinalJ1='" + puntuacionFinalJ1 + '\'' +
                ", puntuacionFinalJ2='" + puntuacionFinalJ2 + '\'' +
                '}';
    }
}
