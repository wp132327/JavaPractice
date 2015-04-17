/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	|_ CarTest
 * 
 * 1. 개요:
 * 2. 작성일: 2015. 4. 14.
 * </pre>
 *
 * @author	: 임예나
 * @version	: 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 car=new Car3("현대자동차","제네시스","검정색",225,50000000);
		Car3 car1=new Car3("기아자동차","K7","흰색",246);
		Car3 car2=new Car3("삼성자동차","SM7","회색");
		
		car.printCar();
		car1.printCar();
		car2.printCar();
	}
		
}
