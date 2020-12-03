package comp2140Code;

/**
 * @author Shanee Barnes
 * @version 1.0
 */

import java.time.LocalDateTime;



public class Employee{
    private int empID;
    private String firstName;
    private String lastName ;
    private String pword;


    /**
     * Constructor for an employee object.
     * @param empID - identification number for an Employee
     * @param firstName - employee first name
     * @param lastName - employee surname 
     * @param Pword - employee password
     */

    public Employee(int empID, String firstName, String lastName, String pword, int timeIn, int timeOut){
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pword = pword;
    }


    public int getEmpId(){
        return this.empID;
    }

    public String getFirstName(){
        return this.firstName;
    }



    public String getLastName() {
        return this.lastName;
    }
 

    public String getPassword(){
        return this.pword;
    }


    public void clockIn(LocalDateTime timeIn){
    timeIn = LocalDateTime.now();
    System.out.println(timeIn);
    }

    public void clockOut(LocalDateTime timeOut){
    timeOut = LocalDateTime.now();
    System.out.println(timeOut);
    }


}
