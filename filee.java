import java.io.*;
class createFile
{
	public static void main(String[] args) throws IOException
	{
	File f=new File("C:\\Users\\Deepan Kumar\\Desktop\\bypass code.txt");
	
		if(f.createNewFile())
      {
		System.out.println("file created successfully!!!");
	  }	
	    else
	  {
		System.out.println("file already exist!");
	  }
	}
}