package lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fib {
static String k;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		
		int i,a=1,b=1,c=0;

		System.out.print("Enter value of n: ");

		k=input.readLine();
		int n=Integer.parseInt(k);
		

		System.out.print(a);

		System.out.print(" "+b);

		for(i=0;i<n-2;i++) {

		c=a+b;

		a=b;

		b=c;

		System.out.print(" "+c);

		}

		System.out.println();

		System.out.print(n+"th number of the series is: "+c);
	}

}
