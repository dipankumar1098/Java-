 /*this keyword*/
 class A
 {
    void show()
    {
        System.out.print(this)
    }
 	public static void main(String[] args) 
 	{
    A r=new A;
 		System.out.print(r);
        r.show();
 	}
 }
