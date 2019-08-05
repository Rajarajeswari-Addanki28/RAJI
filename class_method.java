class test
{
System.out.print("hai");
	int a ;
	test()
	{
		a=10;
		System.out.println(a);
	}
	void display(int a )
	{
		this.a=40;
		System.out.println(a);
		System.out.print(this.a);
	}
}
class t_p
{
	public static void main(String ar[])
	{
		test ob = new test();
		ob.display(20);
	}
}