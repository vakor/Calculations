import java.util.Scanner;


public class Arithmetic {

	
		
	public static float vuraz1(float a, float b){ //	 (a+4b)(a−3b)+a2
		return (a + 4*b)*(a-3*b) + a*2;
	} 
	public static float vuraz2(float x){ //	(x+1)^2 + 3(x+1)
		return  (float) Math.pow(x+1, 2)+ 3 * (x+1);
	} 
	
	public static float vuraz3 (float x) {
		return  (float) ( ( ( Math.abs(x-5) - Math.sin(x) )/3 ) + Math.sqrt( Math.pow(x, 2) + 2014 ) * Math.cos(2*x) );	
	}
	
	public static float vuraz4 (float x) {
		return  (float) ( Math.exp(x-2) + Math.abs(Math.sin(x) ) - Math.pow(x, 10) * Math.cos(1/x) );	
	}
	 static float vuraz5 (float x, float a, float b) {
		return  (float) ( Math.pow( x*x + b , 1/5) - b*b * Math.pow( Math.sin(x + a), 3) / x );	
	}
	static void userSumMultiple(){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		System.out.println(a+b);
		System.out.println(a*b);
		in.close();
	}
	static void userAvg(){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		System.out.println((a+b+c)/3);
		System.out.println(2 * (a+c)- 3 * b);
		in.close();
	}
	static void userSquare(){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println("Периметр " + 4*a);
		System.out.println("Площа " + a*a);
		in.close();
	}
	static void userKm_mToM_s(){
		Scanner in = new Scanner(System.in);
		double l = in.nextDouble();
		double t = in.nextDouble();
		System.out.println( ((l*1000)/ t)/60);
		in.close();
	}
}

