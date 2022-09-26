import java.util.Scanner;
    public class Feladat8 {
        public static void main(String[] args) {
            System.out.print("Kérem adja meg a tippét ()");
            Scanner sc = new Scanner(System.in);
            int tipp = sc.nextInt();
            int ermeFeldobas = (int) (Math.random() * 2);
            String ermeSzoveg = (ermeFeldobas == 0) ? "Fej" : "Irás";
            System.out.printf("A dobás eredménye %s", ermeSzoveg);
            if (tipp == ermeFeldobas) {
                System.out.println("Gratulálok nyert");
            } else {
                System.out.println("Sajnos most nem nyert, próbálkozzon újra");
            }
        }
}
