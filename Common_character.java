import java.util.*;
import java.lang.*;
import java.io.*;
class Common_character
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String k=sc.next();
		char ch1[]=k.toCharArray();
		char ch[]=str.toCharArray();
		int n=str.length();
		int n1=k.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n1;j++)
			{
				if(ch[i]==ch1[j])
				{
					count++;
				}
				if(count>1)
				{
					i=n;
					j=n1;
				}
			}
		}
		if(count>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
