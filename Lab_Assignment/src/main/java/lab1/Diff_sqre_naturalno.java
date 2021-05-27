package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diff_sqre_naturalno {

	
		static int calculateDifference(int n){
			 
			int l, k, m;
			    l = (n * (n + 1) * (2 * n + 1)) / 6;
			    k = (n * (n + 1)) / 2;
			    k = k * k;
			    m =  k-l;
			     
			    return m;
			 
			}
		public static void main(String[] args) throws IOException {
			
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		       System.out.println("Enter a number : ");
				String k=br.readLine();
		       			 int num=Integer.parseInt(k);
		        
				    System.out.println(calculateDifference(num));    
				     
				}
	}
	

