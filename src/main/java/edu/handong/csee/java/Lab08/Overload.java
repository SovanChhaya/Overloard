package edu.handong.csee.java.Lab08;

public class Overload {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		double average1 = Overload.getAverage(40.0 , 50.0);
		double average2 = Overload .getAverage(1.0, 2.0, 3.0);
		char average3 = Overload.getAverage('a', 'c');
		
		System.out.println("Average1 = "+ average1);
		System.out.println("Average1 = "+ average2);
		System.out.println("Average1 = "+ average3);
		
	}
	
	public static double getAverage(double first , double secound)
	
	{
		return (first+ secound )/2.0;
	}
	
	public static double getAverage (double first ,double secound , double third)
	{
		return (first + secound + third)/3.0;
	}
	
	public static char getAverage(char first , char secound)
	{
		return (char)(((int)first +(int) secound)/2);
	}

}
