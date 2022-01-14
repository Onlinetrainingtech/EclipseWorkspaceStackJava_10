import java.util.Scanner;

class Demo
{
	int empid,salary;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value::");
		empid=sc.nextInt();
		salary=sc.nextInt();
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your data is::"+empid+""+salary+""+empname);
	}
}



public class Sample {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		f1.input();
		f1.display();
	}

}
