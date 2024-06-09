public class Library {
    Movie[] movies=new Movie[30];
    int moviesCount=0;

    public void addMovie(String title, String[] starring, int runningTime, String country, String language) {
        if(moviesCount<movies.length){
            movies[moviesCount] = new Movie(title, starring, runningTime, country, language);
            moviesCount++;
        }else
            System.out.println("Error: Movies library is full");
    }
    public void addMovie(){
        if(moviesCount<movies.length){
            movies[moviesCount] = new Movie();
            moviesCount++;
        }else
            System.out.println("Error: Movie is full");
    }

    public void borrowMovie(String title) {
        boolean available = false;
        for(int i=0; i<moviesCount;i++) {
            //search for a movie in the Library’s array using movie’s title (or part of the title)
            if(movies[i].getTitle().toLowerCase().indexOf(title.toLowerCase()) != -1){

                if(!movies[i].isBorrow()){
                    movies[i].setBorrow(true);
                    System.out.println("Movie borrowed successfully");

                }else
                    System.out.println("Sorry! Movie is already borrowed");

                available = true;
                break; //Exit the loop after finding the first match
            }
        }

        if (!available) {
            System.out.println("Sorry! the movie is not available. ");
        }

    }
    public void returnMovie(String title){
        boolean available = false;
        for(int i=0; i<moviesCount; i++) {
            if (movies[i].getTitle().toLowerCase().indexOf(title.toLowerCase()) != -1 ) {
                if(movies[i].isBorrow() == true){
                    movies[i].setBorrow(false);
                    System.out.println("Movie returned successfully");
                }else
                    System.out.println("Error! the movie already exists");

                available = true;
                break; //Exit the loop after finding the first match
            }
        }

        if (!available) {
            System.out.println("Sorry! the movie is not available. ");
        }
    }

    public void printAvailableMovies(){

        for(int i=0; i<moviesCount; i++) {
            if(movies[i].isBorrow() == false){
               // System.out.println(movies[i].getTitle());
                System.out.println( movies[i].toString());
            }
        }
    }

}
