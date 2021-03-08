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
public class LabCourse extends CollegeCourse{
    public LabCourse(String departamento, Integer creditos, Integer noCurso) {
        super(departamento, creditos, noCurso);
        this.tarifa = (12*creditos)+50;
    }

    @Override
    public String toString() {
        return "LabCourse{" +
                "tarifa=" + tarifa +
                '}';
    }
}
