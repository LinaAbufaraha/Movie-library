
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Library library = new Library();

        //Add 10 different Movie objects to the library.
        library.addMovie(); //default movie object “HOTEL TRANSYLVANIA 3”
        library.addMovie("The Lion King", new String[]{"Matthew Broderick", "Jeremy Irons"}, 88, "United States", "English");
        library.addMovie("The Matrix", new String[]{"Keanu Reeves", "Laurence Fishburne"}, 136, "United States", "English");
        library.addMovie("Ghawar Al Toushah", new String[]{"Duraid Lahham", "Nihad Qali", "Sabah Al Jaza'iri"}, 120, "Syria", "Arabic");
        library.addMovie("The Dark Knight", new String[]{"Christian Bale", "Heath Ledger"}, 152, "United States", "English");
        library.addMovie("Your Name", new String[]{"Ryunosuke Kamiki", "Mone Kamishiraishi"}, 107, "Japan", "Japanese");
        library.addMovie("Spirited Away", new String[]{"Rumi Hiiragi", "Miyu Irino", "Mari Natsuki"}, 125, "Japan", "Japanese");
        library.addMovie("3 Idiots", new String[]{"Aamir Khan", "Kareena Kapoor", "R. Madhavan"}, 170, "India", "Hindi");
        library.addMovie("Forrest Gump", new String[]{"Tom Hanks", "Robin Wright"}, 142, "United States", "English");
        library.addMovie("My Neighbor Totoro", new String[]{"Noriko Hidaka", "Chika Sakamoto", "Shigesato Itoi"}, 86, "Japan", "Japanese");

        //Borrow the 5th and 6th movies from the library.
        library.borrowMovie("The Dark "); //Part of the title
        library.borrowMovie("Your Name");

        //Try to borrow the 5th movie again.
        library.borrowMovie("The Dark Knight");

        //Return the 6th movie to the library.
        library.returnMovie(" Name");  //Part of the title

        //Print the available (not borrowed) movies in the library.
        library.returnMovie("The Matrix");

        System.out.println("Available movies:");
        library.printAvailableMovies();

                 System.out.println("Please Enter movie’s title to borrowing movie");
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        library.borrowMovie(title);
        System.out.println("Please Enter movie’s title to returning movie");
        String title1 = input.nextLine();
         library.returnMovie(title1);

    }
}
