// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

package prices;

import java.util.Scanner;

public class Prices {
    
    public static void main(String[] args) {
        
        // 2D Arrays
        // formatting is off, due to financial calculations
        Scanner in = new Scanner(System.in);
        double[][] prices = new double[5][2];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the original price: ");
            prices[i][0] = in.nextDouble();
            prices[i][1] = prices[i][0] * .70;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Original price $"+ prices[i][0] +
                    "\tDiscounted price $" + prices[i][1]);
        }
    }
}
