// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Random;

public class MenuFiles {
	public static void main(String[] args) {
		
		File menuFile = new File("menuitems.txt");
		File output = new File("prices.txt");
		ArrayList<String> items = new ArrayList<String>();
		String food;
		double price;
		
		try {
			Scanner in = new Scanner(menuFile);
			Scanner input = new Scanner(System.in);
			PrintWriter out = new PrintWriter(output);
			while(in.hasNextLine())
			{
				food = in.nextLine();
				items.add(food);
				System.out.println("Enter price for: " + food);
				price = input.nextDouble();
				out.println(food + "\t" + price);
				
			}
			out.close();
		}catch(Exception e)
		{
			System.out.println("File could not be read");
			System.out.println(e.toString());
		}
		System.out.println("Thank you, I have all the prices that I need");
	}
}
