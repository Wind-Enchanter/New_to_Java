package classpractice;

import java.util.Date;

import java.util.Date;

class Time{
	public int h,m;
	
	//pattern值标识当前小时制，默认值a为24小时制，改为b后为12小时制
	char pattern='a';
	
	
/*
 * 默认构造方法，以24小时制获取现在的时间
 */
	Time(){
		Date date=new Date();
		this.h=date.getHours();
		this.m=date.getMinutes();
	}
	
/*
 * 设置特定时间构造对象，24小时制
 */
	Time(int hour,int min){
		this.h=hour;
		this.m=min;
	}
	
/*
 * 可选择小时制的构造方法，以特定的小时制获取当前时间
 */
	Time(char pattern){
		if(pattern=='a') {
			Date date=new Date();
			this.h=date.getHours();
			this.m=date.getMinutes();
		}
		else if(pattern=='b') {
			Date date=new Date();
			this.h=date.getHours();
			this.m=date.getMinutes();
		}
		else System.out.println("wrong pattern!");
	}
	
/*
 * 以已选定的小时制，设置特定时间构造对象
 */
	Time(int hour,int min,char pattern){
		if(pattern=='a') {
			this.h=hour;
			this.m=min;
		}
		else if(pattern=='b') {
			this.h=hour;
			this.m=min;
		}
		else System.out.println("wrong pattern!");
	}
	
/*
 * 时间增加n分钟
 */
	public void plusMinute(int by) {
		m=m+by;
		while(m>=60) {
			plusHour(1);
			m-=60;
		}
	}
	
/*
 * 时间增加1分钟
 */
	public void addMinute() {
		plusMinute(1);
	}
	
/*
 * 时间增加n小时
 */
	public void plusHour(int by) {
		this.h+=by;
		if(this.h>=24)
			this.h-=24;
	}
	
/*
 * 	时间增加1小时
 */
	public void addHour() {
		plusHour(1);
	}
	
/*
 * 	以对象的pattern值，提供toString( )方法用来打印时间
 */
	public String toString(){

		while(this.m>=60) {
			this.m-=60;
			this.h+=1;
		}
		int hour=this.h;
		if(this.pattern=='b') {
			while(this.h>12) {
				this.h=this.h%12;
				if(this.h==0)this.h=12;	
			}
		}
		String out="";
		if(this.h<10)out+="0"+String.valueOf(this.h)+":";
		else out+=String.valueOf(this.h)+":";
		if(this.m<10)out+="0"+String.valueOf(this.m);
		else out+=String.valueOf(this.m);
		if(this.pattern=='b'){
			if(hour>=12)out+="PM";
			else out+="AM";
		}
		return out;
	}

}
