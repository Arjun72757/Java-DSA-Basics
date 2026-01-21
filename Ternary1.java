package IFELSE;

import java.util.Scanner;

public class Ternary1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        System.out.println(n%2==0? "even" : "odd");
        sc.close();
    }
}
