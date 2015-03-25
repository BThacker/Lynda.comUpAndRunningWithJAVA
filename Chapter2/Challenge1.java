
// @author Brandon Thacker | github.com/BThacker
// Lynda.com Up and Running with Java via Peggy Fisher

import java.util.Scanner;

// Write a program to calculate area to be painted per spec
public class Challenge1 {
    public static void main(String[] args) {
    	double houseHeight;
    	double houseWidth;
    	double houseLength;
        double houseAreaTotal;

        int windows, doors;

        double windowHeight;
        double windowWidth;
        double windowAreaTotal;
        double doorHeight;
        double doorWidth;
        double doorAreaTotal;

        double areaToBePainted;
    	
    	Scanner in = new Scanner(System.in);

        // house input
    	System.out.println("Enter the house height in feet: ");
    	houseHeight = in.nextDouble();
    	System.out.println("Enter the house width in feet: ");
    	houseWidth = in.nextDouble(); 
        System.out.println("Enter the house length in feet: ");
        houseLength = in.nextDouble();

        houseAreaTotal = (houseWidth * houseHeight) * 2 + (houseLength * houseHeight) * 2;

        // window input
        System.out.println("Enter the number of windows: ");
        windows = in.nextInt();
        System.out.println("Enter the window height in feet: ");
        windowHeight = in.nextDouble();
        System.out.println("Enter the window width in feet: ");
        windowWidth = in.nextDouble();

        windowAreaTotal = (windowHeight * windowWidth) * windows;
    	
        // door input
        System.out.println("Enter the number of doors: ");
        doors = in.nextInt();
        System.out.println("Enter the door height in feet: ");
        doorHeight = in.nextDouble();
        System.out.println("Enter the door width in feet: ");
        doorWidth = in.nextDouble();

        doorAreaTotal = (doorHeight * doorWidth) * doors;

        // return results
    	areaToBePainted = (houseAreaTotal - windowAreaTotal - doorAreaTotal);
    	System.out.println("Total area to be painted is "+areaToBePainted+ " square feet");
    }    
}
