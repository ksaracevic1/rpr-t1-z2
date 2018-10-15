package ba.unsa.etf.rpr.predavanje03;
import java.util.Scanner;

public class Main {
    public static int sumaCifara (int n) {
        int s = 0;
        while (n!=0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Dobro došli na RPR");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i= 1; i<n+1; i++){
            if (i%sumaCifara(i)==0) System.out.println(i);
        }
    }

}
