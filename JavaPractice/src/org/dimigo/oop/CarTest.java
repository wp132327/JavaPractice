/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	|_ CarTest
 * 
 * 1. ����:
 * 2. �ۼ���: 2015. 4. 14.
 * </pre>
 *
 * @author	: �ӿ���
 * @version	: 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car=new Car();
		
		System.out.println("�������: "+car.getCompany());
		System.out.println("�𵨸�: "+car.getModel());
		System.out.println("����: "+car.getColor());
		System.out.println("�ִ�ӵ�: "+car.getMaxSpeed()+"km");
		System.out.println("����: "+String.format("%,d",car.getPrice())+"��");
		
		car.setCompany("����ڵ���");
		car.setModel("K7");
		car.setColor("���");
		car.setMaxSpeed(246);
		car.setPrice(40000000);
		
		System.out.println();
		System.out.println("�������: "+car.getCompany());
		System.out.println("�𵨸�: "+car.getModel());
		System.out.println("����: "+car.getColor());
		System.out.println("�ִ�ӵ�: "+car.getMaxSpeed()+"km");
		System.out.println("����: "+String.format("%,d",car.getPrice())+"��");
		
		car.setCompany("�Ｚ�ڵ���");
		car.setModel("SM7");
		car.setColor("ȸ��");
		car.setMaxSpeed(200);
		car.setPrice(38000000);
		
		System.out.println();
		System.out.println("�������: "+car.getCompany());
		System.out.println("�𵨸�: "+car.getModel());
		System.out.println("����: "+car.getColor());
		System.out.println("�ִ�ӵ�: "+car.getMaxSpeed()+"km");
		System.out.println("����: "+String.format("%,d",car.getPrice())+"��");

	}

}
