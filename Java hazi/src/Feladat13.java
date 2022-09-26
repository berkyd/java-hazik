import java.util.Scanner;
public class Feladat13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rszam = Math.round(Math.random()*100);
        System.out.print("kérem tippeljen egy egész számot 1 és 100 között: " + rszam);
        int tipp = sc.nextInt();
        while (tipp != rszam){
            if (tipp > rszam){
                System.out.println("A kitallálandó szám kisebb mint a tipp");
            }else{
                System.out.println("A kitallálandó szám nagyobb mint a tipp");
            }
            System.out.print("\nkérem tippeljen egy egész számot 1 és 100 között:");
            tipp = sc.nextInt();
        }
        System.out.print("\nÖn nyert");
    }
}