package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance=10;
		String carType="��ӹ���";
		int pay;
		
		System.out.println("<<��ӵ��� ����� ���>>");
		
		switch(carType){
		case "��ӹ���":
			System.out.println("�Ÿ�: "+ distance+"km");
			System.out.println("����: ��ӹ���");
			pay=850;
			{
				if(distance<=10)
					System.out.println("�����: "+pay+"��");
				else if(distance<=20)
					System.out.println("�����: "+(pay+300)+"��");
				else if(distance<=30)
					System.out.println("�����: "+(pay+600)+"��");
				else 
					System.out.println("?");
			}
			break;
			
		case "����":
			System.out.println("�Ÿ�: "+distance+"km");
			System.out.println("����: ����");
			pay=300;
			{
				if(distance<=10)
					System.out.println("�����: "+pay+"��");
				else if(distance<=20)
					System.out.println("�����: "+(pay+200)+"��");
				else if(distance<=30)
					System.out.println("�����: "+(pay+400)+"��");
				else 
					System.out.println("?");
			}
			break;
			
		default:
			System.out.println("�Ÿ�: "+distance+"km");
			System.out.println("����: �� ��");
			pay=600;
			{
				if(distance<=10)
					System.out.println("�����: "+pay+"��");
				else if(distance<=20)
					System.out.println("�����: "+(pay+200)+"��");
				else if(distance<=30)
					System.out.println("�����: "+(pay+400)+"��");
				else 
					System.out.println("?");
				
			}

		}
		

			
		}
		
	
	}


