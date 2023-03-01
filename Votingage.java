import java.util.Scanner;
 class Votingage {
  public static void main(String[] args) {
    int myAge;
    int votingAge;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age...");
    myAge=sc.nextInt();
     System.out.println("Enter your voting age...");
     votingAge=sc.nextInt();
    
    
    if (myAge >= votingAge) {
      System.out.println("You can vote!");
    } 
    else {
      System.out.println("You can not vote.");
    }  
  }
}
