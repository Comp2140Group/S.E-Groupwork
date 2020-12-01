import java.util.*;

public class Customer{
	
	private int cmrID;
	private ArrayList<Invoice> inv = new ArrayList<Invoice>();
	private String fName;
	private String lName;

	public Customer(int cmrID, String fName, String lName){
		this.cmrID = cmrID;
		this.fName = fName;
		this.lName = lName;
	}

	public String getFName(){
		return fName;
	}

	public String getLName(){
		return lName;
	}

	public int getID(){
		return cmrID;
	}

	public void addInv(Invoice inv){
		this.inv.add(inv);
	}

	public void setFName(String fName){
		this.fName = fName;
	}

	public void setLName(String lName){
		this.lName = lName;
	}
}