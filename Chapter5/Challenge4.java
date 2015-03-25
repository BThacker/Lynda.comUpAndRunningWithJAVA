// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher


import java.util.Scanner;
import java.util.ArrayList;
public class GrocerySearch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String searchString;
        ArrayList<String> groceries = new ArrayList();
        groceries.add("Apples");
        groceries.add("Oranges");
        groceries.add("Cookies");
        groceries.add("Peanuts");
        groceries.add("Milk");
        
        for (int i = 0; i < 10; i++) {
        
            System.out.println("Enter an item to search for on the list: ");
            searchString = in.next();
            
            if (groceries.contains(searchString))
                System.out.println("Your item is already in the list");
            else {
                groceries.add(searchString);
                System.out.println("Your item was not on the list, but has been added");
            }
            
        }
    }
}
