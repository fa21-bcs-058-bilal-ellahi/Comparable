import java.util.Comparator;

public class SortByDuration  implements Comparator<Movie> {

    @Override
    public int compare(Movie movie, Movie movie1) {
        int sort = 7;

        if (movie.getDuration() == movie1.getDuration())
            sort = 0;

        if (movie.getDuration() < movie1.getDuration()) {
            sort = -1;
        }

        if (movie.getDuration() > movie1.getDuration()) {
            sort = 1;
        }

        return sort;



    /*@Override
    public int compare(Object o1, Object o2) {
        int sort = 7;

        if( o2.equals(o1.movie.getDuration() ) )
            sort = 0;

        if(movie.getDuration() < movie1.getDuration() ) {
            sort =  -1;
        }

        if(movie.getDuration() > movie1.getDuration() )
        {
            sort =  1;
        }

        return sort;
        return 0;
    }
*/
    /*@Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }*/
    }}
