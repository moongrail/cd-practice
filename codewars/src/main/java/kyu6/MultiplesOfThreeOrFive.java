package kyu6;

public class MultiplesOfThreeOrFive {
    public int solution(int number) {
        if (number <= 0) return 0;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
