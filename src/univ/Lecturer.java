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
public class Lecturer extends Person {
    private String department;
    private double salary;

    public Lecturer(int idNumber, String name,String department,double salary) {
        super(idNumber, name);
        this.department = department;
        this.salary = salary;
    }   

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    } 
    
    public String toString(){
        return super.toString()+"\nsalary: "+salary+"\ndepartment: "+department;
    }
    
}
