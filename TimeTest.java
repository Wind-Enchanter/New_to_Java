package classpractice;

import java.util.Date;
import java.util.Scanner;

public class TimeTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
//测试默认构造方法和指定时间的显示
		Time t1=new Time();
		System.out.println("Now Time: "+t1.toString());	
		int hour=in.nextInt();
		int min=in.nextInt();
		System.out.println("Please input your chosen time");
		Time t2=new Time(hour,min);
		System.out.println("Your Chosen Time is: "+t2.toString());

//	测试更改小时制后，当前时间和指定时间的显示
		System.out.println("Please input \"a\" or \"b\" to alter from 24-hour clock or 12-hour clock");
		char pattern=(in.next()).charAt(0);
		Time t3=new Time(pattern);
		t3.pattern=pattern;
		System.out.println("Please input your chosen time");
		hour=in.nextInt();
		min=in.nextInt();
		Time t4=new Time(hour,min,pattern);
		if(pattern=='b') {
			System.out.println("You have chosen 12-hour clock\n"
					+ "please enter \"AM\" or \"PM\":");
			String AoP=in.next();
			if(AoP=="PM")
				t4.h+=12;
			t4.pattern=pattern;
		}
		System.out.println("Now Time in your chosen pattern: "+t3.toString());
		System.out.println("Your time in you chosen pattern: "+t4.toString());

//指定时间增加一小时
		t4.addHour();
		System.out.println("\nAfter adding an hour,your time is: "+t4.toString());

//再增加一分钟
		t4.addMinute();
		System.out.println("\nAfter adding a minute,your time is: "+t4.toString());

//	增加指定小时数
		System.out.println("\nLet's add a number to hour\nPlease enter a number");
		int num=in.nextInt();
		t4.plusHour(num);
		System.out.println("\nAfter adding,your time is: "+t4.toString());

//增加指定分钟数
		System.out.println("Let's add a number to minute\nPlease enter a number");
		num=in.nextInt();
		t4.plusMinute(num);
		System.out.println("After adding,your time is: "+t4.toString());

	}
		
}

