package IFELSE;
import java.util.Scanner;
public class IntergerORnot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value:");
        double n=sc.nextDouble();
        int x=(int)n;
        if(n-x>0){
            System.out.println("it is  not an integer");
        }
        else{
            System.out.println("it is  an integer" );
        }
        sc.close();
    }
    
}
