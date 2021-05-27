package lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci_rcf_nrcf
{
	
	void nrcf(int a,int b,int c,int n)
    {
                for(int i=1;i<=n-2;i++)
                {
                            c=a+b;
                            a=b;
                            b=c;
                }
                a=b=1;
                System.out.println("the fibonacci series is : "+a+" "+b+" "+c);
    
                System.out.println("nth value in the series using non recursive function is : "+c);
}       
    
    void  rcf(int a,int b,int c,int n)
    {
                           
                if(n-2>0)
                {
                            c=a+b;
                            a=b;
                            b=c;
                            rcf(a,b,c,n-1);
                            return;
                }
               
                System.out.println("\nnth value in the series using recursive function is : "+c);
    }
   public static class Fibonacci
   {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 Fibonacci_rcf_nrcf f=new Fibonacci_rcf_nrcf();
         String n;
         int a=1,b=1,c=0;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("\nEnter n value:  ");
	       	        n = br.readLine();
	        int k=Integer.parseInt(n);
                
         f.nrcf(a,b,c,k);
         f.rcf(a,b,c,k);
        

	}
   }
}