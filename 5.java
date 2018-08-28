import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
    int f=0,i;
		String ro[]={"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"};
		int ar[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(i=0;i<20;i++)
		{
			if(str.equals(ro[i]))
			{
				f=1;
        break;
			}
		}
		if(f==1)
		System.out.print(ar[i]);
		else
		System.out.print("Must be from 1 to 20(included)");
		
	}
}
