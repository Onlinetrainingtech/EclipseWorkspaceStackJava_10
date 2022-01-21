import java.util.Scanner;

class Demo
{
	int age,salary,bns;
	Scanner sc=new Scanner(System.in);
	
	void input()
	{
	   System.out.println("Enter the age is::");
	   age=sc.nextInt();
	  
	}
	void logic()
	{
		 if(age>=60)
		   {
			   System.out.println("Enter the Salary is::");
			   salary=sc.nextInt();
			   if(salary>=20000)
			   {
				   bns=salary+500;
				   System.out.println("Your Salary is::"+bns);		   
			   }
			   else
			   {
				   bns=salary+1000;
				   System.out.println("Your Salary is::"+bns);
			   }
		   }
		   else
		   {
			   System.out.println("Your age is low");
		   }
	}
}
public class SampleP1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.input();
		f1.logic();

	}

}
