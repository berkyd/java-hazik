import java.util.Scanner;
public class Feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy összeget (min 1, max 1000Ft)");
        double ot = 0;
        double tiz = 0;
        double husz = 0;
        double otven = 0;
        double szaz = 0;
        double ketszaz = 0;
        double m = sc.nextInt();
        double ossz = m;
        ketszaz = Math.floor(m/200);
        m -= (ketszaz*200);
        szaz = Math.floor(m/100);
        m -= (szaz*100);
        otven = Math.floor(m/50);
        m -= (otven*50);
        husz = Math.floor(m/20);
        m -= (husz*20);
        tiz = Math.floor(m/10);
        m -= (tiz*10);
        ot = Math.floor(m/5);
        m -= (ot*5);
        System.out.printf("5 Ft-os: %.0f\n", ot);
        System.out.printf("10 Ft-os: %.0f\n", tiz);
        System.out.printf("20 Ft-os: %.0f\n", husz);
        System.out.printf("50 Ft-os: %.0f\n", otven);
        System.out.printf("100 Ft-os: %.0f\n", szaz);
        System.out.printf("200 Ft-os: %.0f\n", ketszaz);
        System.out.printf("A %.0f Ft-ot így lehet a lehető legkevesebb érméből összerakni \n",ossz);
        System.out.printf("A maradék: %.0f\n", m);
    }
}