import cipher.Cipher;

import java.io.Console;

public class CeasarCipher {

    public static void main(String[] args){
        Console ceaserConsole = System.console();
        Cipher ceaser = new Cipher();

        System.out.println("Please enter phrase:");
        String phrase = ceaserConsole.readLine();
        System.out.print("Converting...");
        String cipheredText = ceaser.cipherText(phrase,5);
        System.out.print("your converted text is: "+cipheredText);
        System.out.print("the original phrase was ________________________________________");
        System.out.print(phrase);

    }
}

