public class WrapperVariables{
	public static void main(String ...args){
		// Autoboxing: converting primitive types to wrapper objects
		int primitiveInt = 10;
		Integer wrapperInt = primitiveInt;
		System.out.println("Primitive Int " + primitiveInt);
		System.out.println("Wrapper Integer (autoboxing): " + wrapperInt);
		
		
		 // Unboxing: converting wrapper objects to primitive types
        Integer anotherWrapperInt = 20;
        int anotherPrimitiveInt = anotherWrapperInt; // Unboxing
        System.out.println("Wrapper Integer: " + anotherWrapperInt);
        System.out.println("Primitive int (unboxed): " + anotherPrimitiveInt);
		
	}
}