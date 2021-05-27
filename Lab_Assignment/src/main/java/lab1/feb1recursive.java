package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class feb1recursive {
	class Fib1 {

		int fib(int n) {

		if(n==1)

		return (1);

		else if(n==2)

		return (1);

		else

		return (fib(n-1)+fib(n-2));

		}

		}
		class FibR {

		public void main(String args[])throws IOException {

		InputStreamReader obj=new InputStreamReader(System.in);

		BufferedReader br=new BufferedReader(obj);

		System.out.print("Enter value of n: ");

		int n=Integer.parseInt(br.readLine());

		Fib1 ob=new Fib1();

		System.out.print("Fibonacci Series is:");

		int res=0;

		for(int i=1;i<=n;i++) {

		res=ob.fib(i);

		System.out.print(" "+res);

		}

		System.out.println();

		System.out.println(n+"th number of the series is: "+res);

		}

		}

}
