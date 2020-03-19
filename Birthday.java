import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
/*
 输入生日年份，获取当前年份，计算年差num，进行循环
  每次循环输出当年年月和表头（周日~周六）再循环输出第一天前的空格，完成空格输出后循环输出日期直至月末
  （上述循环中无论输出空格还是日期都要计数，到7时计数归零，换行）（判断日期为输入的日时星期几数列对应天数加一）
  计算年差和对应比例，输出结果
 */

public class Birthday{
	public static void main(String[] args) {
		int year,month,day;
		Scanner in=new Scanner(System.in);
		year=in.nextInt();
		month=in.nextInt();
		day=in.nextInt();
		Date birthday=new Date(year-1900,month-1,day,0,0,0);
		Date now=new Date();
		
		int num=now.getYear()-year+1900;
		final String[] week= {"周日","周一","周二","周三","周四","周五","周六"};
		int[] weeknum= new int[7];
		for(int i=0;i<=num;i++) {
			System.out.println();
			System.out.println((year+i)+"年"+month+"月");
			for(int j=0;j<7;j++) System.out.printf(week[j]+"\t");
			System.out.println();
			
			GregorianCalendar cal=new GregorianCalendar(year+i,month-1,1);
			int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			int day1=cal.get(Calendar.DAY_OF_WEEK)-1;
			int cunt=0;
			for(int j=0;j<day1;j++) {
				System.out.print("\t");
				cunt++;
			}
			for(int k=1;k<=days;k++){
				if(k==day) {
					System.out.print(k+"*"+"\t");
					weeknum[cunt]+=1;
				}
				else 
					System.out.print(k+"\t");
				cunt++;
				if(cunt==7) {cunt=0;System.out.println();}
				}
			System.out.println();
		}
	for(int j=0;j<7;j++) {
		double res=(double)weeknum[j]/(double)(num+1);
		System.out.println(week[j]+"占星期几比重为"+(res*100)+"%");	
	}	
		
	}
						
}