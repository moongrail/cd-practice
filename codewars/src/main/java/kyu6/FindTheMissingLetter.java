package kyu6;

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array) {
        char result = ' ';
        for (int i = 0; i < array.length-1; i++) {
            if ((byte)array[i+1] - (byte)array[i] > 1 ){
                int byteRes = (byte) array[i + 1] - 1;
                result = (char) byteRes;
            }
        }
        return result;
    }
}
