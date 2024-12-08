public class StringsComparation{
	
	public static void main(String ... args){
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "hai romania!";
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1 == str2);
		System.out.println("Concatenation of string looks like " + str1 + " " + str2);
		System.out.println("The length of string 2 is  " + str2.length());
		System.out.println("The text of string 3 is  " + str3);
		System.out.println("The length of string 3 is  " + str3.length());
		System.out.println("The uppare case  of string 3 is  " + str3.toUpperCase());
		
	}
}