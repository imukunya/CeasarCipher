package cipher;

public class Cipher {

    private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private char [] matrix;
    private int cipherKey = 3;
    private String phrase;

    public void Cipher(){

    }
    public char[] convertToCharArray(String text){
        this.phrase = text;
        return this.phrase.toCharArray();
    }


}
