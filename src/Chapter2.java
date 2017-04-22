/**
 * Created by Maestro on 22.04.2017.
 */
import java.util.Scanner;

public class Chapter2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter degree in Fahrenheit ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(fahrenheit + "is " + celsius + "degree");





    }
}
