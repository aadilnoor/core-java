class Armstrong2{
	public static void main(String[] args) {
		
		int a,n,sum=0;
		for (int i=0; i<10000; i++) {
			n=i;
			while(n>0)
			{
				a=n%10;
				sum=sum*a;
				n=n/10;

			}
			if(sum==i)
			{
				System.out.println(i+"  ");
				sum=0;
			}
		}
	}
}