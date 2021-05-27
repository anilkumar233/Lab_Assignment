package lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum_of_cubes {
	public static int sumOfSeries(int n)
    {
        int sum = 0;
        for (int x=1; x<=n; x++)
            sum += x*x*x;
        return sum;
    }
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		 String number;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter a number : ");
	        number = br.readLine();
	        int c=Integer.parseInt(number);
	        System.out.println(sumOfSeries(c));
	  
	}

}
