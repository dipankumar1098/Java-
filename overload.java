class Over
{
	void add()
	{
     int a=10,b=20,c;
     c=a+b;
     System.out.println(c);
	}
	void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x,double y)
	{
		double c;
		c=x+y;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Over r=new Over();
		r.add(); r.add(10,20); r.add(100,20.5);
	}
}