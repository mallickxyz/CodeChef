/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Maximum_Remaining
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=n-2;i>=0;i--)
		{
		    if(arr[i]!=arr[n-1])
		    {
		        System.out.println(arr[i]);
		        return;
		    }
		}
		
		System.out.println(0);
		
	}
}
