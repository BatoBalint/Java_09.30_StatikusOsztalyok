package hu.petrik;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Veletlen.velEgesz(15, 60) + " ");
        }

        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(Veletlen.velKarakter('a', 'z') + " ");
        }
    }
}
