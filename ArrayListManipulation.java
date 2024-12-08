
import java.util.*;

public class ArrayListManipulation{
	

	
	public static void main(String ...args){
		List<String> names = new ArrayList<>();
		names.add("Alex");
		names.add("John");
		System.out.println(names);
		
		names.remove("John");
		System.out.println(names);
		names.add("Gabor");
		System.out.println(names);
	}
}