
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

import java.util.Scanner;
import java.util.Arrays;

public class MealPlan  {
    public static void main(String[] args) {
        // call the getTotalMealWeeks method, which returns number of weeks
        int numWeeks = getTotalMealWeeks();
        double[] dailyMealCost = new double[7];

        // print array contents before calling the method, should be all zeros
        System.out.println("Before calling the method: " +
            Arrays.toString(dailyMealCost));

        // call getDAilyMealCost method = uses call by reference
        getDailyMealCost(dailyMealCost);

        // print array contents after calling the method
        System.out.println("After calling the method : " +
            Arrays.toString(dailyMealCost));

        double totalCost = computerMealPlanCost(numWeeks, dailyMealCost);

        printTotalMealPlanCost(totalCost);
    }

    public static int getTotalMealWeeks() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many weeks are in your semester? : ");
        int totalWeeks = in.nextInt();
        return totalWeeks;
    }

    public static void getDailyMealCost(double[] dailyCost) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < dailyCost.length; i++)
        {
            System.out.println("Enter the estimated cost for day "+ (i+1));
            dailyCost[i] = in.nextDouble();
        }

    }

    public static double computerMealPlanCost(int numWeeks, double[] dailyCost) {
        double totalCost = 0, weeklyCost = 0;

        for (int i = 0; i < dailyCost.length; i++)
        {
            weeklyCost += dailyCost[i];
        }
        totalCost = weeklyCost * numWeeks;
        return totalCost;
    }

    public static void printTotalMealPlanCost(double total) {
        System.out.printf("Your estimated total for the semester is : $%5.2f", total);
        System.out.println();
    }

}
