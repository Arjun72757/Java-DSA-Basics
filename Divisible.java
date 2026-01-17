//Take positive integer input from user and check whether it is divisible by 5 or not
package IFELSE;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n%5==0){
            System.out.println(n + " is divisible by 5");
        }
        else{
            System.out.println(" Not divisible by 5");
        }
        sc.close();

        
    }

    
}
