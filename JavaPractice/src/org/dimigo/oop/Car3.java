/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	|_ Car
 * 
 * 1. 개요:
 * 2. 작성일: 2015. 4. 14.
 * </pre>
 *
 * @author	: 임예나
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
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명: "+company);
		System.out.println("모델명: "+model);
		System.out.println("색상: "+color);
		System.out.println("최대속도: "+maxSpeed+"km");
		System.out.println("가격: "+String.format("%,d",price)+"원");
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
