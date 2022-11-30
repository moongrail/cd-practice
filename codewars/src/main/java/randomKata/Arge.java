package randomKata;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int sumPeoples = p0;
        int years = 0;
        while (sumPeoples<p){
            sumPeoples = (int)(sumPeoples + (sumPeoples*(percent*0.01)) +aug);
            years++;
        }
        return years;
    }
}
