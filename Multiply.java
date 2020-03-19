package homework0306;

public class Multiply {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=10;i++){//共输出十一行
			if(i==0)
			  System.out.print("* |");
		   else if(i>=2)
			System.out.print(i+" |");
			for(int j=0;j<9;j++){
				if(i==0)
					System.out.print(" "+Multiplyer.multiply(num,i+1)[j]+" ");
				else if(i==1)
					{System.out.print("-------------------------------");break;}
				else if(i>=2)
					System.out.print(" "+Multiplyer.multiply(num,i-1)[j]+" ");
			}
			System.out.print("\n");
		  }
	}
}
class Multiplyer{
	public static int[]  multiply(int[] num,int by){
		int[] res=new int[9];
		for(int i=0;i<9;i++)
			res[i]=num[i]*by;
		return res;
	}
}