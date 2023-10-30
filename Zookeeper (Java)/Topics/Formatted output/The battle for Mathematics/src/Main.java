import java.sql.SQLOutput;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        double pi = Math.PI;
        //write your code below
        String ans = String.format("%.3f", pi);
        System.out.printf("%.3f", pi);
    }
}