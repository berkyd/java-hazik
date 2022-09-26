import java.util.Scanner;
public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy pozitív valós számot: ");
        double bszam = sc.nextDouble();
        double also_hatar = Math.floor(bszam);
        double felso_hatar = Math.ceil(bszam);
        double round = Math.round(bszam);

        System.out.printf("A megadott szám a %f és a %f egész számok között van, és ezek közül a %f számhoz van közelebb.%n", also_hatar, felso_hatar, round);
        System.out.printf("A szám egész része %.0f%n", bszam);
        System.out.printf("A szám törtrésze %f%n", (bszam - Math.floor(bszam)));
    }
}
