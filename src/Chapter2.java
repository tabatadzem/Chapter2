
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



//         Scanner input = new Scanner(System.in);
//         System.out.println(" please enter the time zone");
//         int timeZone = input.nextInt();
//         long totalMilliSeconds = System.currentTimeMillis();
//         long totalSeconds = totalMilliSeconds/1000;
//         long currentSecond = totalMilliSeconds%60;
//         long totalMinutes = totalSeconds/60;
//         long currentMinute = totalMinutes%60;
//         long totalHours = totalMinutes/60;
//         long currentHour = totalHours%24;
//         System.out.print("it is " + (currentHour + timeZone) + ":" + currentMinute + ":" + currentSecond);

//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the kg, initial temp and final temp");
//        double kg = input.nextDouble();
//        double iT = input.nextDouble();
//        double fT = input.nextDouble();
//        double a = kg * (fT - iT) * 4184;
//        DecimalFormat df = new DecimalFormat("####0.000");
//        System.out.println(df.format(a));

//        Scanner input = new Scanner(System.in);
//        System.out.print("please enter the number of years");
//        int numberOfYears = input.nextInt();
//       long population = 312032486;
//        long birth = 24 * (60/7);
//        int death = 24 * (60 / 13);
//        int immigrant = 24 ;
//        long populationPerYear =  numberOfYears * 365 *( birth - death + immigrant) + population ;
//        System.out.println(populationPerYear);
//

//        Scanner input = new Scanner(System.in);
//        System.out.print("please enter the amount");
//        double amount = input.nextDouble();
//        double monthlyInterest = 0.00417;
//        double amountForFirstMonth = amount * (1 + monthlyInterest);
//        double amountForSecondMonth = (amount + amountForFirstMonth) * (1 + monthlyInterest);
//        double amountForThirdMonth = (amount + amountForSecondMonth) * (1 + monthlyInterest);
//        double amountForForthMonth = (amount + amountForThirdMonth) * (1 + monthlyInterest);
//        double amountForFivthMonth = (amount + amountForForthMonth) * (1 + monthlyInterest);
//        double amountForSixthdMonth = (amount + amountForFivthMonth) * (1 + monthlyInterest);
//        System.out.println("your amount for first is : " + amountForFirstMonth );
//        System.out.println("your amount for first is : " + amountForSecondMonth);
//        System.out.println("your amount for first is : " + amountForThirdMonth);
//        System.out.println("your amount for first is : " + amountForForthMonth);
//        System.out.println("your amount for first is : " + amountForFivthMonth);
//        System.out.println("your amount for first is : " + amountForSixthdMonth);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your weight and your height");
//        double heightInInches = input.nextDouble();
//        double weightInPounds = input.nextDouble();
//        double heightInMaters = heightInInches * 0.0254;
//        double weightInKilos = weightInPounds * 0.453;
//        double bmi = weightInKilos/(heightInMaters * heightInMaters);
//        System.out.println(bmi);

////
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the temperature between -58°F and 41°F:");
//        double temperature = input.nextDouble();
//        System.out.println("Enter the wind speed (>=2) in miles per hour:");
//        double speed = input.nextDouble();
//        double windChillTemperature = 35.74 + (0.6215 * temperature) + (35.75 * Math.pow(speed,0.16)) + 0.4275 * temperature*Math.pow(speed,0.16);
//        System.out.print(windChillTemperature);
//
//        System.out.println("a   b   Math.pow(a,b) ");
//        System.out.println("1   2        1        ");
//        System.out.println("2   3        8        ");
//        System.out.println("3   4        81        ");
//        System.out.println("4   5        1024        ");
//        System.out.println("5   6        15625        ");
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the coordinates for triangle");
//        double x1 = input.nextDouble();
//        double y1 = input.nextDouble();
//        double x2 = input.nextDouble();
//        double y2 = input.nextDouble();
//        double x3 = input.nextDouble();
//        double y3 = input.nextDouble();
//        int d1 = (int) Math.pow(Math.pow((x2-x1),2) + Math.pow((y2-y1),2),0.5);
//        int d2 = (int) Math.pow(Math.pow((x3-x1),2) + Math.pow((y3-y2),2),0.5);
//        int d3 = (int) Math.pow(Math.pow((x3-x2),2) + Math.pow((y3-y2),2),0.5);
//        int halfPerimeter = (d1 + d2 + d3)/2;
//        double area = Math.pow((halfPerimeter * (halfPerimeter - d1)*(halfPerimeter - d2)*(halfPerimeter - d3)),2);
//        System.out.println(area);


//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the distance");
//        double distance = input.nextDouble();
//        System.out.println("please enter the miles per galon");
//        double milesPerGalon = input.nextDouble();
//        System.out.println("please enter the price per galon");
//        double pricePerGalon = input.nextDouble();
//        double costOfTravel = pricePerGalon * distance / milesPerGalon;
//        System.out.print(costOfTravel);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        int amount = input.nextInt();
        int numberOfOneDollars = amount / 100;
        amount = amount % 100;
        int numberOfQuarters = amount / 25;
        amount = amount % 25;
        int numberOfDimes = amount / 10;
        amount = amount % 10;
        int numberOfNickels = amount / 5;
        amount = amount % 5;
        int numberOfPennies = amount;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");






    }
}
