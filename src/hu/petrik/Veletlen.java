package hu.petrik;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public final class Veletlen {
    private static Random random = new Random();
    private static List<String> vezetekNevek = feltolt("list/veznev.txt");
    private static List<String> ferfiKerNevek = feltolt("list/ferfikernevek.txt");
    private static List<String> noiKerNevek = feltolt("list/noikernevek.txt");

    private Veletlen() {
    }

    private static List<String> feltolt(String fajlnev) {
        List<String> fajlSorai = null;
        try {
            fajlSorai = Files.readAllLines(Paths.get(fajlnev));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fajlSorai;
    }

    public static int velEgesz(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static char velKarakter(char min, char max) {
        return (char) velEgesz(min, max);
    }
}

