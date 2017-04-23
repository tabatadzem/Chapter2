
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
        Scanner input = new Scanner(System.in);
        System.out.print("please the radius and length");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        Cylinder cylinder = new Cylinder(radius,length);
        cylinder.getVolume();
        DecimalFormat df = new DecimalFormat("####0.000");
        System.out.print("the volume of cylinder with the radius " + radius + " and the length " + length + " is " + df.format(cylinder.getVolume()));


    }
}
