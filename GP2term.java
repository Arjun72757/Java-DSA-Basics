package LOOP;
import java.util.Scanner;
public class GP2term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 1, r = 2;
        for (int i = n; i >= 1; i--) {
            System.out.println(a);
            a*=  r;
        }

        sc.close();
    }
}

