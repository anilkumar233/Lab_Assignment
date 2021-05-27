package lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum_natural_divby {
	static int calculatesum(int N)
    {
        
int sum=0;     
for(int i=0;i<N;i++) {
	if(i%3==0||i%5==0)
	{
		sum=sum+i;
	}
}
        return sum;
        }
	public static void main(String[] args)throws Exception {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("Enter a number : ");
			String k=br.readLine();
	       			 int N=Integer.parseInt(k);
	                 
        System.out.println(calculatesum(N));
        }
}
