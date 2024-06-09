import java.util.Arrays;

public class Movie {
    private String title;
    private String[] Starring;
    private int runningTime;
    private String  country;
    private String  language;
    private boolean  borrow;

    public Movie(){
        this.title ="HOTEL TRANSYLVANIA 3";
        this.Starring =new String[]{"Adam Sandler", "Selena Gomez", "Andy Samberg","Kevin James", "Fran Drescher" };
        this.runningTime=97;
        this.country="United States ";
        this.language="English";
        this.borrow=false;
    }
    public Movie(String title, String[] starring, int runningTime, String country, String language) {
        this.title = title;
        Starring = starring;
        this.runningTime = runningTime;
        this.country = country;
        this.language = language;
        this.borrow=false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getStarring() {
        return Starring;
    }

    public void setStarring(String[] starring) {
        Starring = starring;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    @Override
    public String toString() {
        return "Movie " +
                "title: " + title  +
                ", Starring: " + Arrays.toString(Starring) +
                ", runningTime: "  + runningTime +
                ", country: " + country  +
                ", language=: " + language +"\n" ;
    }
}
