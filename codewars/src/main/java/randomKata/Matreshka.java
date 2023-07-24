package randomKata;

public class Matreshka {
    public static void buildMatryoshka(int size, int n) {
        if (n >= 1) {
            System.out.println("Создаём низ матрёшки размера " + size + ".");
            buildMatryoshka(size - 1, n - 1);
            System.out.println("Создаём верх матрёшки размера " + size + ".");
        }
    }

    public static void main(String[] args) {
        buildMatryoshka(4, 3);
    }
}
