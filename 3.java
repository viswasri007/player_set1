import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,reversed = 0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		{
			 int digit = num % 10;
            		reversed = reversed * 10 + digit;
            		num /= 10;
         
		}
        System.out.println(reversed);
	}
}
