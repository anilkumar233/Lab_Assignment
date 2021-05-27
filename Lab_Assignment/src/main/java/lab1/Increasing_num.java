package lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Increasing_num {
	static String k;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1
	   boolean flag = false;
	       
	       //2
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("Enter a number : ");
			k=br.readLine();
			
			 //3
			
	       			 int num=Integer.parseInt(k);
	        
	      
	       	      
	       //4
	       int currentDigit = num % 10;
	       num = num/10;
	        
	       //5
	       while(num>0){
	           //6
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }

	           currentDigit = num % 10;
	           num = num/10;
	       }
	        
	       //7
	       if(flag){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }
	    }
	
	}


