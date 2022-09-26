import java.util.Scanner;
public class Feladat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ossz=0;
        int pr = 0;
        int prtln = 0;
        while (ossz <= 100){
            System.out.print("Adjon meg egy számot");
            int szam = sc.nextInt();
            ossz += szam;
            if (szam%2==0){
                pr++;
            }else{
                prtln++;
            }
        }
        System.out.printf("Összesen %d db páros és %d db páratlan szám volt", pr, prtln);
    }
}