import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        double fahr, celsius;
        int lower, upper, step;
 
        lower  = 0;
        upper  = 300;
        step  =  20;
 
        fahr = upper;
        while (fahr >= lower ){
            celsius = 5 * (fahr-32) / 9;
            System.out.printf("%3.0f %6.1f\n", fahr, celsius);
            fahr = fahr - step;
        }
    }
}