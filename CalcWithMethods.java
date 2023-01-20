import java.util.Scanner;
public class CalcWithMethods {

    public static void main(String args[]) {

        int num1 = getInt1();
        int num2 = getInt2();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Result is: " + result);
    }

    public static int getInt1() {
        Scanner scanner = new Scanner(System.in);

        int num1;
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();

        return num1;
    }

    public static int getInt2(){
        Scanner scanner = new Scanner(System.in);

        int num2;
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        return num2;
    }

    public static char getOperation(){
        Scanner scanner = new Scanner(System.in);

        char operation;
        System.out.print("Enter operation: ");
        operation = scanner.next().charAt(0);

        return operation;
    }

    public static int calc (int num1, int num2, char operation){
        int result = 0;
        if (operation == '+'){
            result = num1 + num2;
        }
        else if (operation == '-'){
            result = num1 - num2;
        }
        else if (operation == '*'){
            result = num1 * num2;
        }
        else if (operation == '/'){
            result = num1 / num2;
        }

        return result;
    }
    
}
