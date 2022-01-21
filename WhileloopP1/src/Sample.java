import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int i,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the n value is::");
		
		n=sc.nextInt();
		i=0;
		while(i<=n)
		{
			System.out.println("I value is::"+i);
			i++;
		}

	}

}
