import java.sql.Date;
import java.util.*;

public class Driver implements Comparable, Comparator {
    static int i = 1;
    public static void main(String[] args) {

        long millis=System.currentTimeMillis();
        Date date=new Date(millis);
        System.out.println("Today : "+date);
        System.out.println("--------------------");
        String str0 ="2015-03-31";
        Date date0 =Date.valueOf(str0);//converting string into sql date
        String str1 ="2016-03-31";
        Date date1 =Date.valueOf(str1);
        String str2 ="2017-03-31";
        Date date2 =Date.valueOf(str2);
        String str3 ="2018-03-31";
        Date date3 =Date.valueOf(str3);
        String str4 ="2018-03-31";
        Date date4 =Date.valueOf(str4);

        //Date d = new Date(2009-1-1);
        //Date dte = new Date(2002, 2, 10);
        //System.out.println("--------------------");


        ArrayList<Movie> list = new ArrayList<Movie>();
        Movie movie =  new Movie("Throne", 109, date0, "Horror");
        Movie movie1 = new Movie("GameofThrone", 209, date1, "Action");
        Movie movie2 = new Movie("UFC", 609, date2, "Comedy");
        Movie movie3 = new Movie("udemy", 409, date3, "Education");
        Movie movie4 = new Movie("k",909,date4,"N/A");

        list.add(movie);
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        list.add(movie4);

        for (Movie val : list) {
            System.out.println(i++ + ". " + val + "\n");
        }

        Collections.sort(list, new SortByDuration());//sort
        System.out.println("\n__________Duration" + list + "\n");

        Collections.sort(list, new sortbydate());//sort
        System.out.println("\n__________Date" + list + "\n");

        Collections.reverse(list);  //reverse
        System.out.println("\n___________Reverse_duration" + list + "\n");
    }




      /*  System.out.println(
                    String.format("________Movie________ \nName of the Movie: %s\nDuration: %s minutes \nDate of Release: %s \nCategory: %s",
                    movie.getTitle(), movie.getDuration(), movie.getDate_of_release(), movie.getCategory()
            ));*/


    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    // System.out.println(list);

}

        //for (int i =0; i < list.toArray().length; i++) {