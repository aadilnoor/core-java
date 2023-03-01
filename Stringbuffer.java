class Stringbuffer{
	void show(StringBuffer a)
	{
		System.out.println("StringBuffer method");
	}
	void show(String a)
	{
		System.out.println("String method");
	}
	public static void main(String[] args) {
		Stringbuffer ob=new Stringbuffer();
		ob.show("Aadil");
		ob.show(new StringBuffer("noor"));
	}   //ob.show(null);

}