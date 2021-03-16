/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univ;

/**
 *
 * @author samuel
 */
public class Tester2 {
    public static void main(String args[]){
        Person p1 = new Person(2,"Sammy");
        Student student = new Student(1,"Samuel","Full-Time");
        Lecturer lecturer = new Lecturer(1,"Deepak","Computer Science",1000);
        System.out.println(p1.toString());
        System.out.println();
        System.out.println(student.toString());
        System.out.println();
        System.out.println(lecturer.toString());
        System.out.println("Person name is "+ p1.getName());
        System.out.println("Student name is "+ student.getName());
        System.out.println("Lecturer name is "+ lecturer.getName());
    }
}
