import java.util.Comparator;

public class sortbydate implements Comparator<Movie> {

 //   @Override
    public int compareTo(Movie movie, Movie movie1) {
        //int sort1 = 7;

        return (movie.getDate_of_release().getYear() - movie1.getDate_of_release().getYear());
       /* if (movie.getDate_of_release().getYear() == movie1.getDate_of_release().getYear())
            sort1 = 0;

        if (movie.getDate_of_release().getYear()< movie1.getDate_of_release().getYear()) {
            sort1 = -1;
        }

        if (movie.getDate_of_release().getYear() > movie1.getDate_of_release().getYear()) {
            sort1 = 1;
        }

        return sort1;

    }*/
    }
    @Override
    public int compare(Movie o1, Movie o2) {
        return 0;
    }
}

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
