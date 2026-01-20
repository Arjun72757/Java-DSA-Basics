package IFELSE;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first value :");
        int a = sc.nextInt();
        System.out.print("Enter second value :");
        int b = sc.nextInt();
        System.out.print("Enter third value :");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
        sc.close();

    }
    
}
