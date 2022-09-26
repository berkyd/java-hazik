public class Feladat15 {
    public static void main(String[] args) {
        double[] t = new double[25];
        for(int i = 1; i < t.length; i++){
            t[i] = Math.random()*10;
        }
        for(int i = 1; i < t.length; i+=2){
            System.out.print(t[i]*t[i] + ";");
        }
    }
}