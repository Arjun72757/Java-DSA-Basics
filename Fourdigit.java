// Take positive integer input and tekll if it is a four digit number or not.
package IFELSE;
import java.util.Scanner;
public class Fourdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        if(n>999 && n<10000) System.out.println("4 digit number");
        else
            System.out.println("Not a 4 digit number");
        sc.close();

    }
    
}
