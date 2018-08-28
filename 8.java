import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		str=str.trim();
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);
		for(int i=1;i<str.length();i++)
		{
			char ch1=ch[i];
			if(ch1==' ' &&  ch[i+1]!=' ')
			ch[i+1]=Character.toUpperCase(ch[i+1]);
			{
				
			}
		}
		for(int i=0;i<str.length();i++)
		System.out.print(ch[i]);
	}
}
