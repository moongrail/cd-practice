package randomKata;

public class Banjo {
    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Rikki"));
    }

    public static String areYouPlayingBanjo(String name) {
        // Program me!
        if (name.startsWith("")) {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
