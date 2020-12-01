import java.util.*;

public class Invoice{

	protected ArrayList<Item> bill = new ArrayList<Item>();
	private boolean type;
	private double subTotal;
	private double total;
	private Date date = new Date();
	private int invNum;
//	CHECK SALES TAX	
	private final double TAX = 0.165;

	public Invoice(int invNum){
		this.invNum = invNum;
	}

	public String getType(){
		if (type = true){
			return "Cash";
		}
		return "Credit";
	}

	public double getTotal(){
		return total;
	}

	public double getSubToal(){
		return subTotal;
	}

	public Date getDate(){
		return date;
	}

	public int getInvNum(){
		return invNum;
	}

	public void setDate(Date date){
//	NEEDS TO BE LOOKED AT
		this.date = date;
	}

	public void calcSubTotal(){
		int i = 0;
		double sum = 0;
		while (i<bill.size()){
			sum += bill.get(i).getPrice();
			i++;
		}
		this.subTotal = sum;
	}

	public void calcTotal(){
		double tax = subTotal * TAX;
		total = subTotal + tax;
	}

	public void setType(String type){
		if (type.equalsIgnoreCase("Cash")){
			this.type = true;
		}
		else if (type.equalsIgnoreCase("Credit")){
			this.type = false;			
		}
//	MAYBE THIS SHOULD THROW EXCEPTION
		else{
			System.out.println("Error");
		}
	}

	public void addItem(Item item){
		bill.add(item);
	}

	public void removeItem(int itemID){
//	IMPLEMENT ONE FOR NAME, DESCRIPTION, ETC.
		int i = 0;
		while(i<bill.size()){
			if (bill.get(i).getID() = itemID){
				i = bill.size();
			}
			i++;
		}
	}

	public String toString(){
		int i = 0;
		while (i<bill.size()){
			System.out.println(bill.get(i).getName());
			i++;
		}
		calcSubTotal();
		calcTotal();
		String s = String.valueOf(subTotal);
		String t = String.valueOf(total);
		System.out.println("Subtotal: " + s);
		System.out.println("Total: " + t);
		return null;
	}
}