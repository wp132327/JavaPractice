package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		System.out.println("<<아이유 프로필>>");
		
		String name="아이유";
		System.out.println("이름: "+name);
		
		boolean gender=true;
		System.out.print("성별: ");
		 if(gender){
			 System.out.println("여자");
		 }else
			 System.out.println("남자");
		
		int age=23;
		System.out.println("나이: "+age+"세");
		
		double height=161.8;
		System.out.println("키: "+height+"cm");
		
		float weight=(float) 44.3;
		System.out.println("몸무게: "+weight+"kg");
		
		char bloodType='A';
		System.out.println("혈액형: "+bloodType+"형");

	}

}
