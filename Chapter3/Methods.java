
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

import java.util.Scanner;

public class Methods  {
    public static void main(String[] args) {
        
        double x, y, z;
        double avg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers please: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();

        avg = average(x,y,z);
        System.out.println("The average is "+avg);
    }

    public static double average(double num1, double num2, double num3)
    {
        double avg = (num1 + num2 + num3) / 3;
        return avg;
    }       
}
