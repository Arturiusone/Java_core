import java.util.Scanner;

public class Loops {
    public static void main(String[] args){


        // Задача #1
        for (int i = 1; i < 6; i++){
            System.out.println(i);
        }

        // Задача #2

        for (int j = 5; j > 0; j--){
            System.out.println(j);
        }

        // Задача #3
        for (int k = 1; k < 11; k++){
            System.out.printf("3 times %d equals %d \n", k, k * 3);
        }

        // Задача #4

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();

        // Далее код написал ChatGPT
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("The sum of all numbers from 1 to " + num + " equals " + sum);

        // Задача #5
        for (int x = 7; x <= 98; x += 7){
            System.out.println(x);
        }

        // Задача #6
        for (int y = 1; y <= 512; y *= 2){
            System.out.println(y);
        }

        // Задача #7
        for (int z = 1; z <= 10; z++) {
            if (z <=4)
                continue;
            System.out.printf("Dumpling #%d is lucky!\n", z);
            break;
        }
    }
}
