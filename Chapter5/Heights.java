// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

package heights;

import java.util.Scanner;
public class Heights {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
    
        int numStudents;
        double[] heights;
    
        System.out.println("How many students are in the class?: ");
        numStudents = in.nextInt();
        heights = new double[numStudents];
        
        for(int i = 0; i < numStudents; i++)
        {
            System.out.println("Enter Heights: ");
            heights[i] = in.nextDouble();
        }
        
        double maxHeight = heights[0];
        
        for (int i = 1; i < heights.length; i++) {
            if (maxHeight < heights[i]) {
                maxHeight = heights[i];
            }
        }
        
        double total = 0;
        for (int i = 0; i < heights.length; i++) {
            total += heights[i];
        }
        
        System.out.println("The tallest student is "+ maxHeight + " inches.");
        System.out.println("The average height is: "+(total/numStudents) + " inches.");
    }
}
