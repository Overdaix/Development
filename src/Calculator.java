public class Calculator {
	public static void main( final String[] args ){
		int intResult = Calculate(34, 12);
		System.out.println(intResult);
	}
	
	public static int Calculate(int intNumber1, int intNumber2){
		return intNumber1 + intNumber2;
	}
}