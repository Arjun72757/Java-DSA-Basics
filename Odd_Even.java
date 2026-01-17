package IFELSE;

import java.util.Scanner;

public class Odd_Even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a nember: ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println(n +" is a even number");
        else
            System.out.println("odd number");
        sc.close();
    }

}
