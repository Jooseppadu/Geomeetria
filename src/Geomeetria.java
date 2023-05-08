import java.util.Scanner;

public class Geomeetria {
    private final double Side_a;
    private final double Side_b;

    public Geomeetria(double Side_a, double Side_b) {
        this.Side_a = Side_a;
        this.Side_b = Side_b;
    }

    public double arvutaPindala() {
        return Side_a * Side_b;
    }

    public double arvutaUmbermoot() {
        return 2 * (Side_a + Side_b);
    }

    public double arvutaDiagonaal() {
        return Math.sqrt((Side_a * Side_a) + (Side_b * Side_b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Küsi ristküliku esimene külg kasutajalt
        System.out.print("Sisesta ristküliku esimene külg: ");
        double Side_a = scanner.nextDouble();

        // Genereeri arvuti poolt teine külg
        double Side_b = Math.random() * 10 + 1;

        // Loo ristküliku objekt
        Geomeetria ristkylik = new Geomeetria(Side_a, Side_b);

        // Kuvame tulemused konsoolis
        System.out.println("Ristküliku esimene külg: " + ristkylik.Side_a);
        System.out.println("Ristküliku teine külg: " + ristkylik.Side_b);
        System.out.println("Ristküliku pindala: " + ristkylik.arvutaPindala());
        System.out.println("Ristküliku ümbermõõt: " + ristkylik.arvutaUmbermoot());
        System.out.println("Ristküliku diagonaal: " + ristkylik.arvutaDiagonaal());
    }
}

