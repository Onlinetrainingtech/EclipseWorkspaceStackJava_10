import java.io.DataInputStream;
import java.io.IOException;

class Employee
{
	int empid,salary;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void addEmployee()throws IOException
	{
		System.out.println("Enter the data is::");
		empid=Integer.parseInt(dis.readLine());
		salary=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
	}
	void viewDetails()
	{
		System.out.println("Your data is::"+empid+""+salary+""+empname);
	}
}


public class Sample {

	public static void main(String[] args) throws IOException {
		
		Employee d1=new Employee();
		d1.addEmployee();
		d1.viewDetails();

	}

}
