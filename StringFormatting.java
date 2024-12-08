public class StringFormatting{
	
	public static void main(String ...args){
		
		String name = "Alice";
		int age = 29;
		
		String formattingMessage = String.format("Hell, %s! You are %d years old. ", name, age);
		System.out.println(formattingMessage);
	
	}
}