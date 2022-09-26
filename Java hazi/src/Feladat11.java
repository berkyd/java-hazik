import java.util.Scanner;
public class Feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy pozitív egész számot");
        int bszam = sc.nextInt();
        int sz = 0;
        for(int i = 1; i <= bszam; i+=2){
            sz += i;
        }
        System.out.printf("A megadott számnál nem nagyobb páratlan, pozitív, egész számok összege: %d", sz);
    }
}