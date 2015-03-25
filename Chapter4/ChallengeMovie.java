
// @author Brandon Thacker | github.com/BThacker 
// Lynda.com Up and Running with Java via Peggy Fisher

package movieprint;

public class Movie {
    
    private String movieName;
    private String movieRating;
    private int movieYear;
    private int movieRuntime;
    
    // constructor

    public Movie(String movieName, String movieRating, int movieYear, int movieRuntime) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieYear = movieYear;
        this.movieRuntime = movieRuntime;
    }
    
    public String toString() {
        return "Movie Name: " + movieName +
                "\nMovie Rating: " + movieRating +
                "\nMovie Year: " + movieYear +
                "\nMovie Runtime: " + movieRuntime; 
    }
    

    
}