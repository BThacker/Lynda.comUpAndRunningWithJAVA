
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

import java.util.Scanner;

public class DataConversion  {
    public static void main(String[] args) {
    	
        System.out.println((3 + 5 + 8)/3);
        System.out.println((3 + 5 + 8)/3.0);

        double volume = 4/3 * Math.PI * 10*10*10;
        double realVolume = 4/3.0 * Math.PI * 10.0*10.0*10.0;
        System.out.println("The volume of a sphere with radio 10 is: "+volume);
        System.out.println("The real volume is "+realVolume);

        // The below is WRONG
        double fahrenheit = 212;
        double celsius = (fahrenheit - 32)  * (5/9);
        System.out.println(celsius);

        // The below is RIGHT, note the change
        double realFahrenheit = 212;
        double realCelsius = (realFahrenheit - 32) * (5/9.0);
        System.out.println("The real temp is "+realCelsius);


        }    
}
