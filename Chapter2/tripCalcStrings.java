
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

import java.util.Scanner;

public class TripCalcStrings  {
    public static void main(String[] args) {
    	double distance;
    	double mpg;
    	double pricePerGallon;
    	double totalCost;
        String vehicleType;

    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the total distance in miles: ");
    	distance = in.nextDouble();
    	System.out.println("Enter the mpg for the vehicle: ");
    	mpg = in.nextDouble(); 
    	System.out.println("Enter the price of one gallon of gas: ");
    	pricePerGallon = in.nextDouble();
        System.out.println("Please enter a vehicle type: ");
        vehicleType = in.next();

    	totalCost = (distance/mpg)*pricePerGallon;
    	System.out.printf("The trip is going to cost $%5.2f since you are driving a " +vehicleType, totalCost);
    	System.out.println();
    }    
}
