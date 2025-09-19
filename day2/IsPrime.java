package week1.day2;

public class IsPrime {

	public static void main(String[] args)
	{
		int n= 1;
		boolean isprime=true;
		System.out.println("The given number is "+n);
		for(int i=2;i<=n-1;i++)
		{
			if(n%i == 0)
			{
				isprime=false;
				break;
			}			
		}
		if(isprime==true)
		{
			System.out.println(n+" is prime number");	
		}
		else
		{
			System.out.println(n+" is not prime number");	
		}	
	}
}
