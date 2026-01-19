package IFELSE;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost price : ");
        double cp=sc.nextDouble();
        System.out.print("Enter selling price : ");
        double sp=sc.nextDouble();
        if(sp>cp){
            System.out.println("your profit is :" + (sp-cp));
        }
        else if(cp>sp){
            System.out.println("your loss is :" + (cp-sp));
        }
        else{
            System.out.println("No profit & NO loss");
        }
        sc.close();
 
            
        
    }
    
}
