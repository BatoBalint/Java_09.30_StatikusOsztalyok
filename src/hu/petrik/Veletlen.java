package hu.petrik;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Veletlen {
    private static Random random = new Random();
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
}

