import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random t = new Random();
        int min;
        int n;
        int m;

        System.out.print("작업의 개수 : ");
        n = scan.nextInt();
        System.out.print("기계의 개수 : ");
        m = scan.nextInt();
        int[] L = new int[n];

        for (int j = 1; j <= m; j++) L[j] = 0;
        for (int i = 1; i <= n; i++) {
            min = 1;
            for(int j = 2; j <= m; j++) {
                if(L[j] < L[min]) min = j;
            }
            L[min] = L[min] + t.nextInt(10);
        }
        int opt = 0;
        for(int i = 0; i < L.length; i++) {
            if(L[i] > opt) opt = L[i];
        }
        System.out.println("최적해 : " +opt);
    }
}
