import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String actionSum = "+";
        String actionSub = "-";
        String actionMulti = "*";
        String actionDiv = "/";

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Action: ");
        String action = in.next();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.printf("First number: %x  Action: %s  Second number: %x\n", num1, action, num2);

        if(action.equals(actionSum)){
            int result = num1 + num2;
            System.out.println(result);
        }

        else if(action.equals(actionSub)){
            int result2 = num1 - num2;
            System.out.println(result2);
        }

        else if(action.equals(actionMulti)){
            int result3 = num1 * num2;
            System.out.println(result3);
        }

        else if(action.equals(actionDiv)){
            int result4 = num1 / num2;
            System.out.println(result4);
        }

        else{
            System.out.println("Error");
        }
        }
    }

