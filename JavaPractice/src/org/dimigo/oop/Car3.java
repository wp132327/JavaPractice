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
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(){
		
	}
	
	public Car3(String company,String model,String color,int maxSpeed,int price){
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.price=price;
	}
	
	public Car3(String company,String model,String color,int maxSpeed){
		this(company,model,color,maxSpeed,0);
	}
	
	public Car3(String company,String model,String color){
		this(company,model,color,0);
	}

	
	public void printCar(){
		System.out.println("<<�ڵ��� ���>>");
		System.out.println("�������: "+company);
		System.out.println("�𵨸�: "+model);
		System.out.println("����: "+color);
		System.out.println("�ִ�ӵ�: "+maxSpeed+"km");
		System.out.println("����: "+String.format("%,d",price)+"��");
		System.out.println();
	}
	
	
//	public void setCompany(String newCompany){
//		company=newCompany;
//	}
//	
//	public void setModel(String newModel){
//		model=newModel;
//	}
//	
//	public void setColor(String newColor){
//		color=newColor;
//	}
//	
//	public void setMaxSpeed(int newMaxSpeed){
//		maxSpeed=newMaxSpeed;
//	}
//	
//	public void setPrice(int newPrice){
//		price=newPrice;
//	}
//	
	}
