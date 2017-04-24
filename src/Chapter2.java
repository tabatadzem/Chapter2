
import java.util.Scanner;
import java.text.DecimalFormat;
public class Chapter2 {
    public static void main (String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter degree in Fahrenheit ");
//        double fahrenheit = input.nextDouble();
//        double celsius = (5.0 / 9) * (fahrenheit - 32);
//        System.out.println(fahrenheit + "is " + celsius + "degree");

//
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the total amount: ");
//        double totalLoan = input.nextDouble();
//        System.out.print("Enter the annual interest rate: ");
//        double annualInterestRate = input.nextDouble();
//        double monthlyInterestRate = annualInterestRate / 1200;
//        System.out.print("Enter numbers of the years: ");
//        int year = input.nextInt();
//        double monthlyPayment = totalLoan *  monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
//        double totalPayment = monthlyPayment * year * 12;
//        System.out.println("Your monthly payment is " + ((int)monthlyPayment * 100) /100.0);
//        System.out.print("Your total payment is " + (int)totalPayment * 100 / 100.0);
//        int b = 3, a=1, c = 1;
//        System.out.println(Math.pow((Math.pow(b,2) - 4* a * c),0.5));


//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the amount ");
//        double amount = input.nextDouble();
//        int remainingAmount = (int)(amount * 100);
//        int numberOfOneDollars = remainingAmount / 100;
//        remainingAmount = remainingAmount % 100;
//        int numberOfQuarters = remainingAmount / 25;
//        remainingAmount = remainingAmount % 25;
//        int numberOfDimes = remainingAmount / 10;
//        remainingAmount = remainingAmount % 10;
//        int numberOfNickles = remainingAmount / 5;
//        remainingAmount = remainingAmount % 5;
//        int numberOfPennies = remainingAmount;
//
//        System.out.println(" your amount is ");
//        System.out.println(" " + numberOfOneDollars + " dollars" );
//        System.out.println(" " + numberOfQuarters + " Quarters" );
//        System.out.println(" " + numberOfDimes + " Dimes" );
//        System.out.println(" " + numberOfNickles + " Nickles" );
//        System.out.println(" " + numberOfPennies + " pennies");

//
//        Scanner input = new Scanner(System.in);
//        System.out.print("please enter the degree in celsius");
//        double degreeCelsius = input.nextDouble();
//        double fahrenheit = 9.0 / 5 * degreeCelsius +32;
//        System.out.println(" "+ degreeCelsius + " is " + fahrenheit + " fahrenheit" );
//        Scanner input = new Scanner(System.in);
//        System.out.print("please the radius and length");
//        double radius = input.nextDouble();
//        double length = input.nextDouble();
//        Cylinder cylinder = new Cylinder(radius,length);
//        cylinder.getVolume();
//        DecimalFormat df = new DecimalFormat("####0.000");
//        System.out.print("the volume of cylinder with the radius " + radius + " and the length " + length + " is " + df.format(cylinder.getVolume()));
//


//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the distance into feet");
//        double feet = input.nextDouble();
//        double meters = feet * 0.305;
//        DecimalFormat df = new DecimalFormat("####0.000");
//        System.out.println("" + feet + " is " + df.format(meters));

//         Scanner input = new Scanner(System.in);
//         System.out.println("please enter the pounds");
//         double pound = input.nextDouble();
//         double kg = pound*0.454;
//         DecimalFormat df = new DecimalFormat("####0.000");
//         System.out.print( + pound + " is " + df.format(kg));

//         Scanner input = new Scanner(System.in);
//         System.out.println(" please enter the number from 0 to 1000: ");
//         int digit = input.nextInt();
//         Digit number = new Digit(digit);
//         System.out.println(number.getSum());

//         Scanner input = new Scanner(System.in);
//         System.out.print("please enter the minutes");
//         long minutes = input.nextLong();
//         long minutesInDay = 24 * 60;
//         long minutesInYear = 365 * minutesInDay;
//         long year = minutes / minutesInYear;
//         long day = minutes%minutesInYear/minutesInDay;
//         System.out.println("it is "+ year + " and " + day);
         Scanner input = new Scanner(System.in);
         System.out.println(" please enter the time zone");
         int timeZone = input.nextInt();
         long totalMilliSeconds = System.currentTimeMillis();
         long totalSeconds = totalMilliSeconds/1000;
         long currentSecond = totalMilliSeconds%60;
         long totalMinutes = totalSeconds/60;
         long currentMinute = totalMinutes%60;
         long totalHours = totalMinutes/60;
         long currentHour = totalHours%24;
         System.out.print("it is " + (currentHour + timeZone) + ":" + currentMinute + ":" + currentSecond);



    }
}
