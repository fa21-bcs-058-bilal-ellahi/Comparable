import java.sql.Date;

public class Movie implements Comparable<Movie>{ //
    private String title ;
    private int duration;
    private Date date_of_release;
    private String Category;




    public Movie(String title, int duration,Date date_of_release, String category) {
        this.title = title;
        this.duration = duration;
        this.date_of_release =date_of_release;
        Category = category;
    }



    @Override
    public String toString() {
        return
                "Title: " + title +
                "\nDuration: " + duration +
                "\nDate_of_release: " + date_of_release +
                "\nCategory: " + Category ;
    }








    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getDate_of_release() {
        return date_of_release;
    }

    public void setDate_of_release(Date  date_of_release) {
        this.date_of_release = date_of_release;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }






    @Override
    public int compareTo(Movie o) {
        return 0;
    }


    public int compare(Movie o1, Movie o2) {
        return 0;
    }
}
