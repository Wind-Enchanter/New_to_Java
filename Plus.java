package homework0306;

import java.util.Scanner;

public class Plus {
	public static void main(String[] args) {
		System.out.print("Enter an integer:");
		Scanner in=new Scanner(System.in);
		int intnum=in.nextInt();
		System.out.print("Enter a floating point number:");
		float floatnum=in.nextFloat();
		System.out.print("Enter your name:");
		String name=in.next();
		float sum=intnum+floatnum;
		System.out.println("Hi! "+name+","+"the sum of "+intnum+" and "+floatnum+" is "+sum);
	}

}
