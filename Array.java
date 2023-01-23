public class Array {
    public static void main(String[] args){

        // Задача #1
        String[] week = new String[7];
        week[0] = "Monday";
        week[1] = "Tuesday";
        week[2] = "Wednesday";
        week[3] = "Thursday";
        week[4] = "Friday";
        week[5] = "Saturday";
        week[6] = "Sunday";

        String last = week[week.length-1];

        System.out.println(last);

        // Задача #2
        double[] d = {1.1, 2.2, 3.3, 4.4};

        double doubleLast = d[d.length-4];

        System.out.println(doubleLast);

        // Задача #3
        boolean[] boolArray = new boolean[10];
        for(int i = 0; i < boolArray.length; i++){
            System.out.println(boolArray[i]);
        }

        // Задача #4
        int[] grades = new int[10];
        grades[0] = 1;
        grades[1] = 2;
        grades[2] = 3;
        grades[3] = 4;
        grades[4] = 5;
        grades[5] = 6;
        grades[6] = 7;
        grades[7] = 8;
        grades[8] = 9;
        grades[9] = 10;

        int gradesLength = grades.length;

        System.out.println(gradesLength);

        // Задача #5
        int[] a = new int[6];
        a[0] = 11;
        a[1] = 22;
        a[2] = 33;
        a[3] = 44;
        a[4] = 55;
        a[5] = 66;

        for(int k = 0; k < a.length; k++){
            System.out.println(a[k]);
        }

        // Задача #6

        int[] b = new int[12];
        b[0] = 111;
        b[1] = 222;
        b[2] = 333;
        b[3] = 444;
        b[4] = 555;
        b[5] = 666;
        b[6] = 777;
        b[7] = 888;
        b[8] = 999;
        b[9] = 101010;
        b[10] = 111111;
        b[11] = 121212;
        for(int r = b.length-1; r >= 0; r--){
            System.out.println(b[r]);
        }
    }
}
