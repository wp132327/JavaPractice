/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	|_ Circle
 * 
 * 1. 개요:
 * 2. 작성일: 2015. 8. 17.
 * </pre>
 *
 * @author	: 임예나
 * @version	: 1.0
 */
public class Circle extends Figure {
	
	private int radius;

	/**
	 * @param centerX
	 * @param centerY
	 * @param radius
	 */
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	public Circle(int radius) {
		this(0,0,radius);
	}

	protected double calcArea(){
		return Math.PI*radius*radius;
	}
	
	protected void printCenter(){
		System.out.print("원");
		super.printCenter();
	}
	
	
	
	

}
