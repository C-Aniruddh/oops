package aniruddh.util;

/**
 * Created by Aniruddh on 18-09-2017.
 */
public class Date {
    public int day, month, year;
    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public String getDate() {
        String date = day + "/" + month + "/" + year;
        return date;
    }
}
