package day0;

public class Bio {
    public String dnaToRna(String dna) {
        if (dna.contains("U")) {
            return dna.replaceAll("U", "T");
        } else if (dna.contains("T")) {
            return dna.replaceAll("T", "U");
        }
        return dna;  // Do your magic!
    }
}
