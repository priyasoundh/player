import java.util.*;
import java.lang.*;
import java.io.*;
class Occurrences
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextInt();
		int count=0;
		long a;
		while(n>0)
		{
			a=n%10;
			if(a==k)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}
}
