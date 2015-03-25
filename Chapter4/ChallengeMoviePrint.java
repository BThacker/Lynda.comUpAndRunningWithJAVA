
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

package movieprint;

import java.util.Scanner;

public class MoviePrint {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String movieName;
        String movieRating;
        int movieYear; 
        int movieRuntime;
        
        System.out.println("What is your favorite movies name?: ");
        movieName = in.next();
        
        System.out.println("What is your favorite movies rating?: ");
        movieRating = in.next();
        
        System.out.println("What is your favorite movies year of production?: ");
        movieYear = in.nextInt();
        
        System.out.println("What is your favorite movies runtime?: ");
        movieRuntime = in.nextInt();
        
        
        Movie faveMovie = new Movie(movieName, movieRating, movieYear, movieRuntime);
        
        System.out.println("Here is the information you entered ");

        System.out.println(faveMovie.toString());
    }
}
