import java.util.Scanner;
class FindMaximum{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number...");
		int a=s.nextInt();
		System.out.println("Enter the second number...");
		int b=s.nextInt();
		System.out.println("Enter the third number...");
		int c=s.nextInt();

		if(a>b && a>c)
		{
			System.out.println("a is greater:"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater:"+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater:"+c);
		}
		else
		{
			System.out.println("Are equal");
		}	

	}
}