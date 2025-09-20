package week1.day2;
public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		int a=0,b=1,c=0;
		//System.out.println(a);
		//System.out.println(b);
		for(int i=0;i<5;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
