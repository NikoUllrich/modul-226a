package ab03;

import java.util.Random;

public class Aufgabe1c {
    public static void main(String[] args) {
        String characters = "XO";
        String randomString = "";
        int length = 10;

        Random rand = new Random();

        char[] text = new char[length];

        for(int i = 0; i < length; i++){
            text[i] =characters.charAt(rand.nextInt(characters.length()));
        }
        for(int i = 0; i < text.length; i++){
            randomString += text[i];
        }
        System.out.println(randomString);
    }
}
