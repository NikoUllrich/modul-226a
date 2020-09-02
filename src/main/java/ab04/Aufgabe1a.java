package ab04;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe1a {

    public static void main(String[] args) {
        int[] myArray = generateRandomarray();
        int[] myArraySort =myArray.clone();
        Arrays.sort(myArraySort);
        nummberCheck(myArray, myArraySort);
        System.out.println(myArray);
        System.out.println(myArraySort);
    }

    public static int[] generateRandomarray(){
        int[] intary = new int[30];
        for (int i = 0; i < 30; i++){
            intary[i] = (int)(Math.random()* (50 + 1));
        }
        return intary;
    }

    public static void nummberCheck(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; ; i++){
            
            counter++;
        }
    }
}
