public class ArithmeticOperators{
	public static void main(String ...args){
		int num = 10;
		
		//use compound assignement operator
		num += 5;
		System.out.println("The (+=) result of compound operator is: " + num);
		num *= 2;
		System.out.println("The (*=) result of compound operator is: " + num);
		num -= 5;
		System.out.println("The (-=) result of compound operator is: " + num);
		num /= 2;
		System.out.println("The (/=) result of compound operator is: " + num);
		
		int a = 10;
		int b = 5; 
		int c = 2;
		
		
		int results = a++ * b + c/2 - (b % 2);
		System.out.println("The results of:  a++ * b + c/2 - (b % 2) is: " + results);
		int results2 = ++a * b + c/2 - (b % 2);
		System.out.println("The results of:  ++a * b + c/2 - (b % 2) is: " + results2);
	}
}