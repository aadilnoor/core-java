import java.util.Scanner;
class Armstrong{
	public static void main(String[] args) {
		int arm=0,rem,c;
		System.out.println("Enter the number...");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		c=n;

		
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;

		}
		
		
		if(c==arm)
		{
		    System.out.println("is Armstrong number");
		}
		else
		{
			System.out.println("is not Armstrong number");
		}	
	}
}