
import java.util.Scanner;

     public class leap_year {
     public static void main(String[] args) {
          System.out.println("Enter the year");
          Scanner sc=new Scanner(System.in);
          int year = sc.nextInt();
           year %= 4;
           if (year==0) {
               System.out.println("It is a leap year");
           } 
           else {
               System.out.println("It is not a leap year");
           } 






     }
}
