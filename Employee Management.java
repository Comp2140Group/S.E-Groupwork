/**
 * @author Shanee Barnes and David Byfield
 * @version 1.0
 */


import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;



public class EmployeeManagement{
    String filepath = "Employee_Database.txt";
    File eDatabase = new File(filepath);
    
     
    
    /**
     * Adds an employee to the database.
     * @throws IOException
     */

    public void addEmployee(Employee emp) throws IOException {
        
        FileWriter add = new FileWriter(filepath, true);
        try{
            if (!eDatabase.createNewFile()){
                String toAdd = emp.toString();
                add.write(toAdd);
                add.close();
            }
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();
        }
    }
 
    /**
     * Removes an employee from the database
     */

    public void removeEmployee(Employee emp) throws IOException {
        String newFile = "etemp.txt";
        File etempFile = new File(newFile);
        try{
            FileWriter add = new FileWriter("Employee_Database.txt", true);
            BufferedWriter bw = new BufferedWriter(add);
            PrintWriter pw = new PrintWriter(bw);
            Scanner readF = new Scanner(eDatabase);
            readF.useDelimiter("[,/n]");
            
            if (!eDatabase.createNewFile()){
                String id = String.valueOf(item.getId());
                while (readF.hasNext()){
                    String employeeID = readF.next();
                    String efirstName = readF.next();
                    String elastAmount = readF.next();
                    String password = readF.next();
                    int etimeIn = readF.next();
                    int etimeOut = readf.next();
                    if (!empID.equals(employeeID)){
                        pw.println(employeeID +","+efirstName+" "+
                        eLastName+","+password+","+etimeIn+","+etimeOut);
                    }
            
    
                    

                }
            readF.close();
            pw.flush();
            pw.close();
            add.close();
            bw.close();
            eDatabase.delete();
            File dump = new File(filepath);
            tempFile.renameTo(dump);
                
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();
        }
        
    public String updateEmployee(int empID, String firstName,
                                    String lastName, String pword,
                                    int timeIn, int timeOut) throws SQLException {
        
        Employee oldEmployee = findEmployeeById(empID);
        getDBConnection();  

        StringBuffer sb = new StringBuffer( 255 );
        if ( firstName != null && 
            !firstName.equals(oldEmployee.getFirstName() ) )
        {
            sb.append( "First Name = '" + firstName + "'" );
        }
        if ( lastName != null && 
            !lastName.equals(oldEmployee.getLastName() ) ) {
            if (b.length() > 0 ) {
            sb.append( ", " );
            }
            sb.append( "Last Name = '" + lastName + "'" );
        }
        if ( pword != null && 
            !pword.equals(oldEmployee.getPassword() ) ) {
            if (sb.length() > 0 ) {
            sb.append( ", " );
            }
            sb.append("Password = '" + pword + "'" );
        }
        if (timeIn != null && 
            !timeIn.equals(oldEmployee.clockIn() ) ) {
            if (sb.length() > 0 ) {
            sb.append( ", " );
            }
            sb.append( "Arrival Time = '" + timeIn + "'" );
        }
        if ( timeOut != null && 
            !timeOut.equals(oldEmployee.clockOut().toString() ) ) {
            if (sb.length() > 0 ) {
            sb.append( ", " );
            }
            sb.append("Departure Time = '" + timeOut + "'" );
        }
        
        
        if ( sb.length() > 0 )
        {
        sqlString = 
            "UPDATE Employees SET " + sb.toString() + 
            " WHERE Employee ID = " + empID;
            System.out.println("\nExecuting: " + sqlString);
        }
        else
        {
            System.out.println( "Cannot update Employee ID: " + 
                                empID);
        }
        return "success";

        
    }

    
    
}
