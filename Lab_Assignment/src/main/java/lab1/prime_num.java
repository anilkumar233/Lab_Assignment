package lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prime_num {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 String n;
		 int f;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("\nEnter n value:  ");
	       	        n = br.readLine();
	        int c=Integer.parseInt(n);
             System.out.println("Primenumbers are : ");
         for(int i=2;i<=c;i++)
         {
                     f=0;
                     for(int j=2;j<=i/2;j++)
                     if((i%j)==0)
                     {
                                 f=1;
                                 break;
                     }
         if(f==0)
         System.out.print(i+"   ");
         }
	}

}
