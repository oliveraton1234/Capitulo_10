/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8;

/**
 *
 * @author Admin
 */
public class CollegeCourse {
    private String departamento;
    protected Integer tarifa;
    private Integer creditos;
    private Integer noCurso;

    public CollegeCourse(String departamento, Integer creditos, Integer noCurso) {
        this.departamento = departamento;
        this.creditos = creditos;
        this.noCurso = noCurso;
        this.tarifa = 12*creditos;
    }

    @Override
    public String toString() {
        return "CollegeCourse{" +
                "departamento='" + departamento + '\'' +
                ", tarifa=" + tarifa +
                ", creditos=" + creditos +
                ", noCurso=" + noCurso +
                '}';
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Integer getNoCurso() {
        return noCurso;
    }

    public void setNoCurso(Integer noCurso) {
        this.noCurso = noCurso;
    }   
}
