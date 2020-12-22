package cipher;

import org.junit.*;
import static org.junit.Assert.*;


public class CipherTest {

//    check if the function returns characters from an input string
    @Test
    public void convertToCharArray_ConvertingStringToCharacterArray_char(){
        Cipher ceasarCipher = new Cipher();
        String testString = "Test String";

        char[] testArray = testString.toCharArray();
        Class testType = testArray.getClass();
        Class sampleType = (ceasarCipher.convertToCharArray(testString)).getClass();
        assertSame(testType,sampleType);

    }

}