
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

import java.util.Scanner;

public class Challenge2  {
    public static void main(String[] args) {

        int days;
        double overNightCharge = 300;
        double labServCharge = 100;
        double medicationCharge = 50;

        double totalCost;
        int cont = 1;
        Scanner in = new Scanner(System.in);
        do {

            System.out.println("How many days were you in the hospital?: ");
            days = in.nextInt();

            if (days > 1)
                totalCost = days *(overNightCharge + labServCharge + medicationCharge);
            else
                totalCost = labServCharge + medicationCharge;

            System.out.println("The total charges are: "+totalCost);

            System.out.println("Would you like to calculate another paitent? 1 = Y or 0 = No: ");
            cont = in.nextInt();

        } while (cont == 1);

    }

}
