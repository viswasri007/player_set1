import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, c, fact = 1;
		 Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		if (n < 0)
		System.out.println("Number should be non-negative.");
		else
		{
		for (c = 1; c <= n; c++)
            	fact = fact*c;
		System.out.println(fact);
		}
	}
}
