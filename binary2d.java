package homework0306;
import java.util.Scanner;
import java.math.*;

public class binary2d {
	public static void main(String[] args) {
		System.out.print("Enter a binary string: ");
		Scanner in=new Scanner(System.in);
		long num=in.nextLong();
		if(B2der.b2D(num)!=-1)
			System.out.println("The equivalent decimal number for binary \""+num+"\""+" is "+B2der.b2D(num));
		else System.out.printf("Error: Invalid Binary String \""+num+"\"");
	}
}
class B2der{
	public static int b2D(long num){
		int res=0;
		int i=0;
		while(num!=0){
			if(num%10==1||num%10==0)
				{res+= (num%10)*Math.pow(2,i);i++;num/=10;}
			else
				return -1;
		}
		return res;
	}
}