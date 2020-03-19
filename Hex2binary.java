package homework0306;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Hex2binary {
	public static void main(String[] args) {
		char[] alph= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		String[] hexBits = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
		System.out.print("Enter a Hexadecimal string: ");
		Scanner in=new Scanner(System.in);
		String line=in.next();
		char[] line2=line.toCharArray();
		String[] res= new String[100];
		for(int i=0;i<Array.getLength(line2);i++) 
			for(int j=0;j<Array.getLength(alph);j++) 
				if(line2[i]==alph[j])
					res[i]=hexBits[j];	
		System.out.print("The equivalent binary for hexadecimal \""+line+"\" is "+res[0]);
		for(int i=1;i<Array.getLength(line2);i++)
			System.out.print(" "+res[i]);
	}

}