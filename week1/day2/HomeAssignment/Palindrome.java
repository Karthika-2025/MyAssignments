package week1.day2.HomeAssignment;

public class Palindrome
{

	public static void main(String[] args) 
	{
		int number=213 , remainder,originalNumber,paliCheck=0;
		originalNumber=number;
		while (number>0)
		{
			remainder=number%10;
			paliCheck=paliCheck*10+remainder;
			number=number/10;
		}
		if(paliCheck==originalNumber)
		{
			System.out.println(originalNumber+" is Palindrome");
		}
		else
		{
			System.out.println(originalNumber+" is not palindrome");
		}		
	}
}
