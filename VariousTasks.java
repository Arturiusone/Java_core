import java.util.Arrays;
import java.util.Scanner;
public class VariousTasks {
    public static void main(String args[]) {

        // Task #1 - find the greatest number.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's find a greater number of three given numbers.");

        System.out.printf("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.printf("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.printf("Enter third number: ");
        int num3 = scanner.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("Greater number is: " + num1);
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("Greater number is: " + num2);
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println("Greater number is: " + num3);
        } else {
            System.out.println("Some of the provided numbers are equal.");
        }

        // Task #2 - positive/negative number.
        System.out.println("Let's find whether number is positive or negative.");
        int num4;
        System.out.printf("Enter your number: ");
        num4 = scanner.nextInt();

        if (num4 > 0) {
            System.out.println("Number is positive.");
        } else if (num4 < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is 0");
        }

        // Task #3 - days of the week.
        int dayOfTheWeek;
        System.out.print("Enter the serial number of the week: ");
        dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("The 1st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The 2nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The 3rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The 4th day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The 5th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The 6th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The 7th day of the week is Sunday.");
                break;
            default:
                System.out.print("Provided serial number is out of scope.");

        }

        // Task #4 - natural numbers and their sum.
        System.out.println("Let's display n terms of natural numbers and their sum.");

        System.out.printf("Enter number: ");
        int naturalNumber = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= naturalNumber; i++) {
            sum += i;

            System.out.print(i);

        }
        System.out.print("\nSum is: " + sum);

        // Task #5 - find sum and average.
        System.out.println("\nLet's find a sum and an average of five given numbers.");
        int a1;
        int a2;
        int a3;
        int a4;
        int a5;
        System.out.print("Enter first number: ");
        a1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        a2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        a3 = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        a4 = scanner.nextInt();
        System.out.print("Enter fifth number: ");
        a5 = scanner.nextInt();

        int sumOfFiveNumbers = a1 + a2 + a3 + a4 + a5;
        int averageOfFiveNumbers = sumOfFiveNumbers / 5;
        System.out.println("The sum of five numbers is: " + sumOfFiveNumbers);
        System.out.println("\nThe average of five numbers is: " + averageOfFiveNumbers);

        // Task 5.1 - find sum and average, done with loop "for".
        int i, n = 0, s = 0;
        double avg;
        {
            System.out.println("Input 5 numbers: ");
        }

        for(i = 0; i < 5; i++){
            n = scanner.nextInt();
            s += n;
        }

        avg = s / 5;

        System.out.println("The sum of five: " +s +"the average is: " +avg);

        // Task #6 - cubed number.
        int givenNumber;
        System.out.print("Let's cube a number: ");
        givenNumber = scanner.nextInt();
        int cubedNumber = givenNumber * givenNumber * givenNumber;
        System.out.printf("Cube number of %d is %d", givenNumber, cubedNumber);

        // Task #7 - display the pattern like right angle triangle with a number.
        int i1, j1, n1;
        System.out.print("\nInput number of rows: ");

        n1 = scanner.nextInt();

        for(i1 = 1; i1 <= n1; i1++)
        {
            for(j1 = 1; j1 <= i1; j1++)
                System.out.print(j1);

            System.out.println("");
        }

        // Task 8 - sort a numeric array and a string array.
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println("Original numeric array: "+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array: "+ Arrays.toString(my_array1));

        System.out.println("Original string array: "+Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array: "+Arrays.toString(my_array2));

        // Task #9 - sum values of an array.
        int [] my_array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfArray = 0;

        for (int i3 : my_array3) {
            sumOfArray += i3;
        }

        System.out.println("The sum is: " + sumOfArray);


        // Task #10 - the smallest number with method (with if/else).
        System.out.println("\nSmallest number is: ");
        System.out.println(smallestNumber(9, 10, 11));

        // Task #10.1 - the smallest number with method (with Math).
        System.out.println("Let's find smallest number.");
        System.out.print("Input the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Input the second number: ");
        double y = scanner.nextDouble();
        System.out.print("Input the third number: ");
        double z = scanner.nextDouble();
        System.out.print("The smallest value is " + smallestNumber2(x, y, z)+"\n" );

        // Task #11 - an average number with method.
        System.out.println(findAverage(11, 20, 33));

        // Task #12 - converts inches to meters.
        double inches;
        System.out.printf("Enter inches to convert it to meters: ");
        inches = scanner.nextDouble();

        double convertInchesToMeters = inches * 0.0254;
        System.out.printf("%f inches is %f meters", inches, convertInchesToMeters);

        // Task #13 - convert Fahrenheit to Celsius.
        double fahrenheit;
        System.out.printf("\nEnter Fahrenheit to convert it to Celsius: ");
        fahrenheit = scanner.nextDouble();

        double convertToCelsius = (fahrenheit - 32) * 0.5556;
        System.out.printf("%f Fahrenheit is %f Celsius", fahrenheit, convertToCelsius);
    }

    // Method for task #10
    static int smallestNumber(int number1, int number2, int number3) {
        int s = 0; // It was necessary to create a variable for final return

        if ((number1 < number2) && (number1 < number3)) {
            return number1;
        } else if ((number2 < number1) && (number2 < number3)) {
            return number2;
        } else if ((number3 < number1) && (number3 < number2)) {
            return number3;
        }

         return s; // Necessary final return

    }

    // Method for task #10.1
    public static double smallestNumber2(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
    }

    // Method for task #11
    static double findAverage(double x1, double x2, double x3) {
        double average = (x1 + x2 + x3) / 3;

        return average;

    }

}


