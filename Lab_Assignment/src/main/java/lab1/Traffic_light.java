package lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Traffic_light {

	
		static String red;
		static String yellow;
		static String green;

		public static void main(String[] args) throws Exception {
			String ss = "y";
		while (ss.equals("y")) 
			{
			System.out.println("press 1 to RED");
			System.out.println("press 2 to YELLOW");
			System.out.println("press 3 to GREEN");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter your choice");
	String a = br.readLine();
	int c = Integer.parseInt(a);
	switch (c) {
	case 1:
		
	System.out.println("STOP");
	break;
	case 2:
		System.out.println("READY TO GO");
	break;
	case 3:
		System.out.println("GO");
		
	default:
	System.out.println("invalid case");

	}
	System.out.println("do you want to continue press y/n");
	ss = br.readLine();	
	}
	}

}
