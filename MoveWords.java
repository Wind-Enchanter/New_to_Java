import java.util.Scanner;

/*�ȰѾ��ӷָ�ɵ��ʣ��ٰ�ǰ���������һ��String�����漸�����һ��String
����ǰ�����ʵ�String������ĸ��ΪСд,��β��"?"
���ں󼸸�������ɵ�String������ĸ��Ϊ��д����β�Ѿ�Ÿ�Ϊ����
*/

public class MoveWords {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] words=str.split(" ");

		String ques=words[0]+" "+words[1]+"?";
		char[] ques2=ques.toCharArray();
		ques2[0]=Character.toLowerCase(ques2[0]);
		ques=ques2.toString();
		
		for(int i=2;i<words.length;i++)
			words[i-2]=words[i];
		String sta=words[0];
		for(int i=1;i<words.length-2;i++)
			sta=sta+" "+words[i];
		char[] sta2=sta.toCharArray();
		sta2[0]=Character.toUpperCase(sta2[0]);
		sta2[sta.toCharArray().length-1]=',';
		
		System.out.print(sta2);System.out.println(ques2);
	}
}
