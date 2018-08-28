import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(s==null||t==null)
		System.out.print("no");
		if(s.length()!=t.length())
		System.out.print("no");
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for(int i=0; i<s.length(); i++)
		{
        			char c1 = s.charAt(i);
        			char c2 = t.charAt(i);
			if(map.containsKey(c1))
			{
            			if(map.get(c1)!=c2)// if not consistant with previous ones
            			System.out.print("no");
			}
			else
        			{
            			if(map.containsValue(c2)) //if c2 is already being mapped. Time complexity O(n) here
            			System.out.print("no");
            			map.put(c1, c2);
        			}
		}
		System.out.print("yes");
	}
}
