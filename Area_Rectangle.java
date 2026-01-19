// PROGRAM TO FIND WHETHER AREA IS GREATER THAN PERIMETER OF A REACTANGLE
package IFELSE;
import java.util.Scanner;
public class Area_Rectangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        int length=sc.nextInt();
        System.out.print("Enter breadth:");
        int breadth=sc.nextInt();
        int area =length*breadth;
        int perimeter=2*(length+breadth);
        if(area>perimeter){
            System.out.println("Area is greater than perimeter: "+area);
        }
        else{
            System.out.println("Perimeter is greater than area: "+perimeter);
        sc.close();
        }

    }
    
}
