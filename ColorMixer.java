import java.util.Scanner;

public class ColorMixer {
    public static void main(String[] args) {

        /*You can mix following colors:
        Red
        Green
        Blue

        You can't mix same colors!
        Case-sensitive!
         */

        String colorRed = "Red";
        String colorGreen = "Green";
        String colorBlue = "Blue";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter color #1: ");
        String color1 = in.next();

        System.out.print("Enter color #2: ");
        String color2 = in.next();

        if(color1.equals(colorRed) && color2.equals(colorGreen)){
            System.out.println("Your color is: Yellow");
        }

        else if(color1.equals(colorRed) && color2.equals(colorBlue)){
            System.out.println("Your color is: Magenta");
        }

        else if(color1.equals(colorGreen) && color2.equals(colorRed)){
            System.out.println("Your color is: Yellow");
        }

        else if(color1.equals(colorGreen) && color2.equals(colorBlue)){
            System.out.println("Your color is: Cyan");
        }

        else if(color1.equals(colorBlue) && color2.equals(colorRed)){
            System.out.println("Your color is: Magenta");
        }

        else if(color1.equals(colorBlue) && color2.equals(colorGreen)){
            System.out.println("Your color is: Cyan");
        }

        else{
            System.out.println("Error");
        }
    }
}
