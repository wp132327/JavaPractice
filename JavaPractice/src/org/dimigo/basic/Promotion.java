package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		System.out.println("<<디미베네 연간 인건비>>");
		
		int mSalary=1700000;
		System.out.println("월 평균 급여: "+String.format("%,d",mSalary)+"원");
		
		int clerk=3;
		System.out.println("점포 내 직원 수: "+clerk+"명");
		
		int dimiBene=1500;
		System.out.println("점포 수: "+String.format("%,d",dimiBene)+"개");
		
		long y1=mSalary*12;
		long y2=clerk*dimiBene;
		System.out.println("연간 인건비: "+String.format("%,d",y1*y2)+"원");
	}

}
