package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int sa=9, sb=10, pa=9;
		double sh=5.8,ph=5.4;
		double s=(sa+sb)*sh/2;
		double p=pa*ph;
		
		
		System.out.println("<<���� ���� ��>>");
		System.out.println("��ٸ��� ����: "+s);
		System.out.println("����纯�� ����: "+p);
		
		if(s>p){
			System.out.println("��ٸ����� ����纯�� ���� "+(s-p)+" �� Ů�ϴ�.");
		}
		else
			System.out.println("����纯���� ��ٸ��� ���� "+(p-s)+" �� Ů�ϴ�.");

	}

}
