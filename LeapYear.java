import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args){
      int year=2020;
     /* System.out.println("Enter an Year :: ")
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();
*/
      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println(" is a leap year"); 
      else
         System.out.println(" is not a leap year");
   }
}