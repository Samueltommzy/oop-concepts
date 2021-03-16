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
public class Person {
    private int idNumber;
    private String name;
    
    public Person(int idNumber,String name){
        this.idNumber = idNumber;
        this.name = name;
    }
    /**
     * @return the idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return "name: "+ name +"\nidNumber: "+ idNumber;
    }
    
}
