
import java.util.Scanner;

public class Chapter2 {
    public static void main (String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter degree in Fahrenheit ");
//        double fahrenheit = input.nextDouble();
//        double celsius = (5.0 / 9) * (fahrenheit - 32);
//        System.out.println(fahrenheit + "is " + celsius + "degree");

        long totalMilliseconds = System.currentTimeMillis(); // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000; // Obtain the total seconds since midnight, Jan 1, 1970
        long currentSecond = totalSeconds % 60; // Compute the current second in the minute in the hour
        long totalMinutes = totalSeconds / 60; // Obtain the total minutes
        long currentMinutes = totalMinutes % 60; // compute the current minute
        long totalHours = totalMinutes/60; // obtain the total hours
        long currentHour = totalHours%24; // compute the current hour
        System.out.println("currrent time is" + currentHour + ":" + currentMinutes + ":" + currentSecond);





    }
}
