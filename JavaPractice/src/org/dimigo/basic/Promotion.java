package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		System.out.println("<<��̺��� ���� �ΰǺ�>>");
		
		int mSalary=1700000;
		System.out.println("�� ��� �޿�: "+String.format("%,d",mSalary)+"��");
		
		int clerk=3;
		System.out.println("���� �� ���� ��: "+clerk+"��");
		
		int dimiBene=1500;
		System.out.println("���� ��: "+String.format("%,d",dimiBene)+"��");
		
		long y1=mSalary*12;
		long y2=clerk*dimiBene;
		System.out.println("���� �ΰǺ�: "+String.format("%,d",y1*y2)+"��");
	}

}
