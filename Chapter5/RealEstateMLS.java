// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

package realestatemls;

import java.util.ArrayList;
import java.util.Scanner;

public class RealEstateMLS {

    public static void main(String[] args) {
        
        ArrayList<Property> mls = new ArrayList();
        Property p1 = new Property(10000, "Land", 3.5);
        mls.add(p1);
        
        p1 = new Property(230000, "Estate", 2, 2, 3);
        mls.add(p1);
        
        System.out.println(mls.toString());
        
        mls.remove(1);
        
        System.out.println("After Removal of one: "+ mls.toString());
        
    }
}
