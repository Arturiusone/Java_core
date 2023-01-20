import java.util.Scanner;

public class Methods {
    public static void main(String args[]) {

        // Вывод результата для задачи #1
        System.out.println(findMinNumber(10,10));

        // Вывод результата для задачи #2
        System.out.println(findOddOrEvenNumber(9));

        // Вывод результата для задачи #2-1
        System.out.println(findOddOrEvenNumber2(6));

        // Вывод результата для задачи #3
        System.out.println(squaredNumber(10));
        System.out.println(squaredNumber(10)+2);

        // Вывод результата для задачи #4
        System.out.println(cubedNumber(5));

        // Вывод результата для задачи #5
        double p1 = exponentiateFirstNumber(2,2);
        double p2 = exponentiateSecondNumber(3,3);
        double result = p1 + p2;
        System.out.println(result);

        // Вывод результата для задачи #5-1
        System.out.println(power(2,2) + power(3,3));

        // Вывод результата для задачи #6
        System.out.println(moreThanFive(10));

        // Вывод результата для задачи #6-1
        System.out.println(moreThanFive2(10));
    }

    // Задача #1
    static int findMinNumber(int x, int y) {
        if (x < y){
            return x;
        }

        else{
            return y;
        }
    }

    // Задача #2
    static String findOddOrEvenNumber(int num){
        if(num % 2 == 0) {
            return "True";
        }
        else {
            return "False";
        }
    }

    // Задача #2-1
    static boolean findOddOrEvenNumber2 (int num1){
        return (num1 % 2 == 0);
    }

    // Задача #3
    static int squaredNumber(int a){
        return a * a;
    }

    // Задача #4
    static int cubedNumber(int b){
        return b * b * b;
    }

    // Задача #5
    static double exponentiateFirstNumber(int i, int k){
        return Math.pow(i, k);
    }

    static double exponentiateSecondNumber(int u, int j){
        return Math.pow(u, j);
    }

    // Задача #5-1
    static int power (int i1, int k1){
        int result = 1;
        for (int w = 1; w <= k1; w++){
            result = result*i1;
        }
        return result;
    }

    // Задача #6
    static String moreThanFive(int z){
        if (z > 5){
            return "True";
        }
        else{
            return "False";
        }
    }

    // Задача #6-1
    static boolean moreThanFive2(int z1){
        if (z1 > 5){
            return true;
        }
        else {
            return false;
        }

    }

}
