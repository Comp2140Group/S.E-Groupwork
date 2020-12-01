import java.util.*;

public class TransMgmt{

	Invoice inv;
	Customer customer;


	public void addItem(Item item){
//	INSTANTIATE ITEM IN HERE
		inv.addItem(item);
	}

	public void removeItem(int itemID){
		inv.removeItem(itemID);
	}
}