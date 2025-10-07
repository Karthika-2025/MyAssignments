package week1.day2.HomeAssignment;
public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		int a=0,b=1,c=0;
		for(int i=0;i<8;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
