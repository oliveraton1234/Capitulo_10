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
public class DemoCollege {
     public static void main(String[] args) {
        CollegeCourse a = new CollegeCourse("a",2,21);
        System.out.println(a.toString());

        CollegeCourse b = new LabCourse("a",21,32);
        System.out.println(b.toString());
    }   
}
