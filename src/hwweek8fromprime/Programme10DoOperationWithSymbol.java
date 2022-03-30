package hwweek8fromprime;
import java.util.Scanner;

public class Programme10DoOperationWithSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int x = scr.nextInt();
        System.out.println("Enter the second number :");
        int y = scr.nextInt();
        System.out.println("Please select the calculation symbol +,-,*,/ :");
        char symbol = scr.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);//closing the scanner object
        scr.close();
    }

    //Calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + "+" + y + "=" + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + "-" + y + "=" + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + "*" + y + "=" + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + "/" + y + "=" + (x / y));
        } else
            System.out.println("Please enter corret stmbol +,-,*,/");
    }
    }
