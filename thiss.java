 /*this keyword*/
 class A
 {
    void show()
    {
        System.out.println(this);
    }
 	public static void main(String[] args) 
 	{
    A r=new A();
 		System.out.println(r);
        r.show();
 	}
 }
