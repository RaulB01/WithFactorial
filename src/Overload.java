public class Overload {
	public double getAverage(double first, double second){
		return (first+second)/2.0;
	}
	
	public static double getAverage(double first, double second, double third){
		return (first+second+third)/3.0;
	}
	
	public static double getAverage(double [] num){
		double sum=0.0;
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		return (sum/num.length);
	}
	
	public static double getSum(double first, double second){
		return (first+second);
	}
	
	public static double getSum(double [] num){
		double sum=0;
		for(int i=0;i<num.length;i++){
			sum += num[i];
		}
		return (sum);
	}
	
	public static double getProduct(double first, double second){
		return (first*second);
	}	
	
	public static double getProduct(double [] num){
		double product=1;
		for(int i=0;i<num.length;i++){
			product *= num[i];
		}
		return (product);
	}
	public static double getDivisor(double first, double second){
		return (first/second);
	}	
	public static double getDivisor(double [] num){
		double Divisor=1;
		for(int i=0;i<num.length;i++){
			Divisor /= num[i];
		}
		return (Divisor);
	}
	public static int getFactorial(int numb){
	    if( numb == 1 ){
	        return 1;
	    }
	    return numb * getFactorial(numb-1);
	}
	

}