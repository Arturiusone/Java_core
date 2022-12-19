public class Home_task_1 {
    public static void main(String[] args) {

        System.out.println("Hello Java!");

        // Работа с переменными
        // 1.
        int num = 3;
        System.out.println(num);

        // 2.
        int a = 10;
        int b = 2;

        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);

        // 3.
        int c = 15;
        int d = 2;
        int result = c + d;

        System.out.println(result);

        // 4.
        int a1 = 10;
        int b1 = 2;
        int c1 = 5;
        int result2 = a1 + b1 + c1;

        System.out.println(result2);

        // 5.
        int a2 = 17;
        int b2 = 10;
        int c2 = a2 - b2;
        int d2 = 7;
        int result3 = c2 + d2;

        System.out.println(result3);

        // 6.
        int e = 10;
        int f = 2;

        System.out.println(Math.pow(e, f));

        // 7.

        int g = 2;
        int h = 2;
        int result4 = g / h;

        System.out.println(result4);

        // Работа с присваиваниями и декрементами

        var num1 = 47;
        num1 += 7;
        num1 -= 18;
        num1 *= 10;
        num1 /= 15;

        var num2 = 10;
        num2 = ++num2;
        num2 = --num2;

        // Работа с if-else
        // 1.
        int i = 0;
        if (i == 0) {
            System.out.println("Верно");
        }

        else {
            System.out.println("Неверно");
        }

        // 2.
        int j = 1;
        if (j > 0) {
            System.out.println("Верно");
        }

        else {
            System.out.println("Неверно");
        }

        // 3.
        int k = -1;
        if (k < 0) {
            System.out.println("Верно");
        }

        else {
            System.out.println("Неверно");
        }

        // Работа с логическими операциями - не понял

        // Работа с && (и) и || (или)
        // 6.

        int l = 3;
        if (l > 0 && l < 5) {
            System.out.println("Верно");
        }

        else {
            System.out.println("Неверно");
        }

        // 7.
        double m = 10.0;
        if (m == 0 || m == 2) {
            m += 7;
            System.out.println(m);
        }

        else {
            m /= 10;
            System.out.println(m);
        }

        // 8.
        int n = 0;
        int o = 2;
        if (n <= 1 && o >= 3) {
            int p = n + o;
            System.out.println(p);
        }

        else {
            int q = n - o;
            System.out.println(q);
        }

        // На switch-case — сделал по-своему, как правильно немного не понял
        int num3 = 5;
        switch (num3) {

            case 1:
                System.out.println("Зима");
                break;

            case 2:
                System.out.println("Весна");
                break;

            case 3:
                System.out.println("Лето");
                break;

            case 4:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Межсезонье");

        }
    }
    }

