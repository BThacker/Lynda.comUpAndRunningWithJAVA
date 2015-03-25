// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

package recursion;

public class Recursion {
    public static void main(String[] args) {
        countdown(10);
    }
    
    public static void countdown(int num) {
        if (num == 0)
                System.out.println("Blast off!");
        else
        {
            System.out.println(num);
            // avoid infinite loops
            // always have a base case
            // many recursive processes can be done via a loop
            // however there are times when recursion is possibly more efficient
            countdown(num-1);
        }
    }
}
