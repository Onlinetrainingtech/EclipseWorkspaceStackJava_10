import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int n,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		while(n!=0)
		{
			  rev = rev * 10;
		      rev = rev + n%10;
		      n       = n/10;
		}
		System.out.println("ReveredNumber is::"+rev);

	}

}
