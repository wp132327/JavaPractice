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
		Car3 car=new Car3("�����ڵ���","���׽ý�","������",225,50000000);
		Car3 car1=new Car3("����ڵ���","K7","���",246);
		Car3 car2=new Car3("�Ｚ�ڵ���","SM7","ȸ��");
		
		car.printCar();
		car1.printCar();
		car2.printCar();
	}
		
}
