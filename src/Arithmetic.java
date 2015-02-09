
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
}
