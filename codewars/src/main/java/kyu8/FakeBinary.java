package kyu8;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        char[] number = numberString.toCharArray();

        for (int i = 0; i < number.length; i++) {
            if (number[i] < '5') {
                number[i] = '0';
            } else {
                number[i] = '1';
            }
        }
        return new String(number);
    }
}
