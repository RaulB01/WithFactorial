import java.lang.reflect.Array;
import java.util.Scanner;


public class OverloadDriver {
	public static void main(String []args){
		//array is a group of data that has the same type
		
		//double num1=10;
		//double num2=20;
		//double num3=30;
		//System.out.println(Overload.getAverage(num1,num2,num3));
		//int x;
		
		double [] num = new double [3];
		num[0]=10.6;
		num[1]=20.14;
		num[2]=36.15;
		 
		
		System.out.println("The Average is: " + Overload.getAverage(num));
		System.out.println("The Sum is: " + Overload.getSum(num));
		System.out.println("The Product is: " + Overload.getProduct(num));
		System.out.println("The Divisor is: " + Overload.getDivisor(num));
		
		Overload overLoad = new Overload();
		System.out.println(overLoad.getAverage(53.0,65.0));
		System.out.println(overLoad.getSum(53.0,65.0));
		System.out.println(overLoad.getProduct(53.0,65.0));
		System.out.println(overLoad.getDivisor(53.0,65.0));
		
		System.out.println("Enter an integer to calculate it's factorial");
	      Scanner in = new Scanner(System.in);
	 
	      int numb = in.nextInt();
	      System.out.println("The Factorial is: " + Overload.getFactorial(numb));
		
		
		
		

}
}