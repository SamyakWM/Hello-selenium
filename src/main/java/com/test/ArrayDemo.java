package com.test;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array is a collection of same type of data
		
		int rollNumber= 101;
		int rollNumberArray[]=new int[15];
		
		rollNumberArray[0]=100;
		rollNumberArray[1]=104;
		rollNumberArray[2]=106;
		rollNumberArray[3]=108;
		rollNumberArray[4]=110;
		
		for(int i=0;i<5;i++) {
			System.out.println(rollNumberArray[i]);
		}
		
		int rollNumbers[]= {4,6,8,10,12,15,17,19,20};
		System.out.println("Total student count:"+rollNumbers.length);
		
		for (int i=0;i<rollNumbers.length;i++) {
			
			System.out.println(rollNumbers[i]);
			
		}
		
		String names[]= {"Ron", "Harry", "Hermione", "Neville", "Ginny"};
		for (int i=0;i<=names.length-1;i++)
			System.out.println(names[i]+ "roll number is"  + rollNumbers[i]);
		

	}

}
