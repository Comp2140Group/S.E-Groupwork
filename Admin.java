/**
 * @author David Griffiths and Shanee Barnes
 * @version 1.0
 **/
import java.util.* ;

public class Admin{
    private int adminID;
    private String fname, lname;
    protected Sting pword;


    /**
     * Constructer for an item object.
     * @param adminID the ID of an admin
     * @param fname the first name of an admin
     * @param lname the first name of an admin
     * @param pword the password of an admin
     * 
     **/

public Admin(int adminID, String fname, String lname, String pword ) {
    this.adminID = adminID;
    this.fname = fname;
    this.lname = lname;
    this.pword = pword;
}

public String getReport(){ 
    report.add(InventMgmt(int itemID, string item));
    report.add(EmpMgmt(int empID));
}

public void modifyInventory(){
    InventMgmt inManagement = new(InventMgmt);
    inManagement.addItem(String item);
    inManagement.removeItem(String item);
    inManagement.editInventory();
    }
}

/**
 * Modifies the name of an Employee 
 * 
 **/

public void modifyEmployee(EmpMgmt iManagement) {
    iManagement.addEmployee();
    iManagement.removeEmployee();
    iManagement.editEmployee();
    iManagement.getEmployeeAttendence(Employee);
}


}