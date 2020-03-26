package classpractice;

import java.util.Date;

import java.util.Date;

class Time{
	public int h,m;
	
	//patternֵ��ʶ��ǰСʱ�ƣ�Ĭ��ֵaΪ24Сʱ�ƣ���Ϊb��Ϊ12Сʱ��
	char pattern='a';
	
	
/*
 * Ĭ�Ϲ��췽������24Сʱ�ƻ�ȡ���ڵ�ʱ��
 */
	Time(){
		Date date=new Date();
		this.h=date.getHours();
		this.m=date.getMinutes();
	}
	
/*
 * �����ض�ʱ�乹�����24Сʱ��
 */
	Time(int hour,int min){
		this.h=hour;
		this.m=min;
	}
	
/*
 * ��ѡ��Сʱ�ƵĹ��췽�������ض���Сʱ�ƻ�ȡ��ǰʱ��
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
 * ����ѡ����Сʱ�ƣ������ض�ʱ�乹�����
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
 * ʱ������n����
 */
	public void plusMinute(int by) {
		m=m+by;
		while(m>=60) {
			plusHour(1);
			m-=60;
		}
	}
	
/*
 * ʱ������1����
 */
	public void addMinute() {
		plusMinute(1);
	}
	
/*
 * ʱ������nСʱ
 */
	public void plusHour(int by) {
		this.h+=by;
		if(this.h>=24)
			this.h-=24;
	}
	
/*
 * 	ʱ������1Сʱ
 */
	public void addHour() {
		plusHour(1);
	}
	
/*
 * 	�Զ����patternֵ���ṩtoString( )����������ӡʱ��
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
