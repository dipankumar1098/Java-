class para
{
	int a,b;
	para(int X,int Y)
	{
	a=X; b=Y;
	}
	void disp()
	{
	System.out.println(a+ " " +b);
	}
}
class param
{
	public static void main(String[] args)
	{
	para s=new para(100,500);
	s.disp();
    }
}