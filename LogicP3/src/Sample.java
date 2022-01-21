import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Input Number::");
        int day=in.nextInt();
        System.out.println(getDayName(day));
        
	}
    
	public static String getDayName(int day)
	{
		String dayName="";
		
		switch(day)
		{
		case 1:dayName="Monday";
		break;
		case 2:dayName="Tuesday";
		break;
		case 3:dayName="Wednesday";
		break;
		default:dayName="Invalid day range";
		}
		return dayName;
	}
}
