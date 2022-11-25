import java.util.Comparator;

public class ReverseSort implements Comparator<Movie> {


    @Override
    public int compare(Movie movie, Movie movie1) {
        int r = 7;

        if (movie.getDuration() == movie1.getDuration())
            r = 0;

        if (movie.getDuration() < movie1.getDuration()) {
            r = 1;
        }

        if (movie.getDuration() > movie1.getDuration()) {
            r = -1;
        }

        return r;

    }
}
