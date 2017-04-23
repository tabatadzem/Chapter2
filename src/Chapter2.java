
import java.util.Scanner;

public class Chapter2 {
    public static void main (String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter degree in Fahrenheit ");
//        double fahrenheit = input.nextDouble();
//        double celsius = (5.0 / 9) * (fahrenheit - 32);
//        System.out.println(fahrenheit + "is " + celsius + "degree");

//

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        double totalLoan = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.print("Enter numbers of the years: ");
        int year = input.nextInt();
        double monthlyPayment = totalLoan *  monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
        double totalPayment = monthlyPayment * year * 12;
        System.out.println("Your monthly payment is " + ((int)monthlyPayment * 100) /100.0);
        System.out.print("Your total payment is " + (int)totalPayment * 100 / 100.0);


    }
}
