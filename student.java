class student
{
	int a,c;String b;
	void input()
	{
		System.out.print("Roll no,name,class");
	}
}
class ankit extends student
{   
	void disp()
	{
		a=21;
	    b="ankitKumar";
	    c=9;
		System.out.print(a+" "+b+" "+c);
	}	
    public static void main(String[] args)
      {
        ankit r=new ankit();
		  r.disp(); r.input();
      }
}