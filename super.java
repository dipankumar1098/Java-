class Super
{
	int a=10;
}
class supers extends Super
{
	int a=20;
	void show()
	{
	System.out.print(a);
	System.out.print(super.a);
	}
}
class superb
{
	public static void main(String[] Args)
	{
	supers s=new supers();
	s.show();
	}
}