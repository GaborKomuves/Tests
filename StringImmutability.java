public class StringImmutability{
	public static void main(String ...args){
		String str1 = "Hello World!";
		String str2 = str1.toUpperCase();
		
		System.out.println(str1);
		System.out.println(str2);
	}
}