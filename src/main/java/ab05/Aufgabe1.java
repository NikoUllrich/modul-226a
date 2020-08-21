package ab05;

import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {
        int operand1, operand2, operand, result;

        Scanner eingabe = new Scanner(System.in);
        
        System.out.println("Erste Zahl eingeben");
        operand1 = eingabe.nextInt();
        System.out.println("Zweite Zahl eingeben");
        operand2 = eingabe.nextInt();
        System.out.println("1 = +, 2 = -, 3 = *, 4 = / Ganzzahligen, 5 = % Rest der ganzzahligen");
        operand = eingabe.nextInt();

        switch (operand){
            case 1:
                result = operand1 + operand2;
                System.out.println(result);
                break;
            case 2:
                result = operand1 - operand2;
                System.out.println(result);
                break;
            case 3:
                result = operand1 * operand2;
                System.out.println(result);
                break;
            case 4:
                result = operand1 / operand2;
                System.out.println(result);
                break;
            case 5:
                result = operand1 % operand2;
                System.out.println(result);
                break;
            default:
                System.out.println("Der operator ist nicht vorhanden!");
                break;
        }
    }
}
