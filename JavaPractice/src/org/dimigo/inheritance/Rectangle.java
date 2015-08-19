/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *	|_ Rectangle
 * 
 * 1. 개요:
 * 2. 작성일: 2015. 8. 17.
 * </pre>
 *
 * @author	: 임예나
 * @version	: 1.0
 */
public class Rectangle extends Figure {
	
	private int width;
	private int height;
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height=height;
	}
	
	public Rectangle(int width, int height) {
		this(0,0,width,height);
	}

	protected double calcArea(){
		return width*height;
	}
	
	protected void printCenter(){
		System.out.print("사각형");
		super.printCenter();
	}
	
}
