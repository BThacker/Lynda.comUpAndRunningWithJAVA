
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher


public class Overloading  {
    public static void main(String[] args) {

        // integer to double inside method
        System.out.println("The average of 3 integers: 3, 5, 8 is :"+
            average(3,5,8));

        // double
        System.out.println("the avearge of three doubles: 4, 8, 18 is :"+
            average(4.0,8.0,18.0));
    }

    public static double average(int x, int y, int z) {

        // implicit conversion
        return (x + y + z) / 3.0; 
    }

    public static double average(double x, double y, double z) {

        // no need to convert
        return (x + y + z) / 3;
    }
}
