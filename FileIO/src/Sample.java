import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
	void get1() throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("D:\\f1.txt"))
		{
			
			String s="welcome";
			byte d[]=s.getBytes();
			fos.write(d);
			System.out.println("FileIsInserted..");
		}
		catch(FileNotFoundException t)
		{
			System.out.println("Please check the file");
		}
	}
	void get2() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\f1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void get3() throws IOException
	{
		try
		{
			FileInputStream f1=new FileInputStream("D:\\f1.txt");
			FileInputStream f2=new FileInputStream("D:\\f2.txt");
			FileOutputStream f3=new FileOutputStream("D:\\copy.txt");
			SequenceInputStream sis=new SequenceInputStream(f1,f2);
			int i;
			while((i=sis.read())!=-1)
			{
				//System.out.print((char)i);
				f3.write((byte)i);
			}
			System.out.println("FileCopyed...");
			
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
}


public class Sample {

	public static void main(String[] args) throws IOException {
		
		Demo f1=new Demo();
		//f1.get1();
		//f1.get2();
		f1.get3();

	}

}
