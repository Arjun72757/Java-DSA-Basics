package LOOP;
import java.util.Scanner;
public class GPterm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int a=1 , r=2;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=r;
        }
        sc.close();
    }   
}
