
public class Demo {

	public static void main(String[] args) 
	{
		
		String str1="welcome";
		String str2=new String("to java session");
		
		System.out.println("Your data is::"+str1+str2);
		System.out.println("Length of the String::"+str1.length());
		System.out.println("CompareTo of the String::"+str1.compareTo(str2));
		System.out.println("Equals or Not::"+str1.equals(str2));
		System.out.println("UpperCase::"+str1.toUpperCase());
        System.out.println("LowerCase::"+str1.toLowerCase());
        
        if(str1.startsWith("W"))
        {
        	System.out.println("Login Sucess!!");
        }
        else
        {
        	System.out.println("Login Fail!!");
        }
        
	}

}
