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

    public String cipherText(String message, int offset){

        StringBuilder result = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return String.valueOf(result);
    }

    public String decipherText(String message, int offset) {
        return cipherText(message, 26 - (offset % 26));
    }


}
