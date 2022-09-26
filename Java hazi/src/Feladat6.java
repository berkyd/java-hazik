import java.util.Scanner;
public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a dolgozaton elért pontszámát");
        double pszam = sc.nextDouble();
        if (0<=pszam && pszam<=42){
            System.out.println("A jegye elégtelen!");
        }else if (pszam<=57){
            System.out.println("A jegye elégséges!");
        } else if (pszam<=72) {
            System.out.println("A jegye közepes!");
        }else if (pszam <=87){
            System.out.println("A jegye jó!");
        }else{
            System.out.println("A jegye jeles!");
        }
    }
}