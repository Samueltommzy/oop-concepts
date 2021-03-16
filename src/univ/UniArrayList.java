/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univ;

import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public class UniArrayList {
    public static void main(String args[]){
         ArrayList<Person> universityDB = new ArrayList<Person>();
         
         Person p1 = new Person(1,"Sammy");
         Student s1 = new Student(1,"Samuel","Full-Time");
         Lecturer l1 = new Lecturer(1,"Deepak","Computer Science",1000);
        
         universityDB.add(p1);
         universityDB.add(s1);
         universityDB.add(l1);
         
         for(Person p: universityDB){
             System.out.println(p.toString());
             System.out.println();
         }
    }
}
