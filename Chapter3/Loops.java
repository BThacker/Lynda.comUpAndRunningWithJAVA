
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher


public class Loops  {
    public static void main(String[] args) {
        
        System.out.println("Results of do/while loop: ");

        // do loops always fire at least once
        int count = 0;
        do {
            System.out.println("Hello World!");
            count++;
        } while (count < 3);
        
        // while loop

        System.out.println("Results of a while loop: ");
        count = 0;
        while (count < 3) {
            System.out.println("Hello World!!!");
            count++;
        }

        System.out.println("Results of a for loop: ");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Hello World FOR!!");
            count++;   
        }
        
        }       
}
