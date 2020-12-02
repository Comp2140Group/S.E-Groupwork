/**
 * @author David Byfield
 * @version 1.0
 */

package comp2140Code;


import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

import java.nio.*;


public class InventoryManagement{
    String filepath = "Item_Invetory.txt";
    File inventory = new File(filepath);
    
     
    
    /**
     * Adds an item to the inventory.
     * @param item obect of item class to be added
     */
    public void addItem(Item item) {
        
        FileWriter add = new FileWriter(filepath, true);
        try{
            if (!inventory.createNewFile()){
                String toAdd = item.toString();
                add.write(toAdd);
                add.close();
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();
        }
    }
 
    /**
     * Removes an item from the inventory
     * @param item object of item class to be removed
     */
    public void removeItem(Item item){
        String newFile = "temp.txt";
        File tempFile = new File(newFile);
        try{
            FileWriter add = new FileWriter("Item_Inventory.txt", true);
            BufferedWriter bw = new BufferedWriter(add);
            PrintWriter pw = new PrintWriter(bw);
            Scanner readF = new Scanner(inventory);
            readF.useDelimiter("[,/n");
            
            if (!inventory.createNewFile()){
                String id = String.valueOf(item.getId());
                while (readF.hasNext()){
                    String productID = readF.next();
                    String productName = readF.next();
                    String productAmount = readF.next();
                    String productPrice = readF.next();
                    if (!id.equals(productID)){
                        pw.println(productID +","+productName+","+
                        productAmount+","+productPrice);
                    }
                 
                    

                }
                readF.close();
                pw.flush();
                pw.close();
                inventory.delete();
                File dump = new File(filepath);
                tempFile.renameTo(dump);

            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        

        
    }

    
    
}
