package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power_of_two {

	public static boolean checkNumber(int n)
	{
	while(n%2==0)
	{
	n=n/2;
	}
	if(n==1)
	{
	return true;
	}
	else
	{
	return false;
	}
	}
	public static void main(String[] args) throws IOException {

		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("Enter n value : ");
			String k=br.readLine();
	       			 int n=Integer.parseInt(k);
	           
		    System.out.println(checkNumber(n));    

	}
	}
