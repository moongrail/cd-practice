package randomKata;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        if (binary == null || binary.isEmpty()){
            return 0;
        }
        int result = 0;
        int pos = 0;
        // Your Code
        for (int i = binary.size()-1; i >= 0;i--) {
            if (binary.get(i) == 1){
                result = (int)(result + Math.pow(2,pos));
            }
            pos++;
        }
        return  result;
    }
}
