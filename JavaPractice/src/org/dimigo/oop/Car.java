/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	|_ Car
 * 
 * 1. ����:
 * 2. �ۼ���: 2015. 4. 14.
 * </pre>
 *
 * @author	: �ӿ���
 * @version	: 1.0
 */
public class Car {
	private String company="�����ڵ���";
	private String model="���׽ý�";
	private String color="������";
	private int maxSpeed=225;
	private int price=50000000;
	
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setCompany(String newCompany){
		company=newCompany;
	}
	
	public void setModel(String newModel){
		model=newModel;
	}
	
	public void setColor(String newColor){
		color=newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		maxSpeed=newMaxSpeed;
	}
	
	public void setPrice(int newPrice){
		price=newPrice;
	}
	
	}
