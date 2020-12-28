public class FindMax {

	public static void main(String[] args) {
		
		
		MyGeneric<Integer> intPosOne = new MyGeneric<Integer>(86, 38, 56);            //Test 1
		System.out.println(intPosOne.maximumMethod());
		 
		MyGeneric<Integer> intPosTwo = new MyGeneric<Integer>(56, 86, 38);            //Test 2
		System.out.println(intPosTwo.maximumMethod());
		
		MyGeneric<Integer> intPosThree = new MyGeneric<Integer>(56, 86, 38);          //Test 3
		System.out.println(intPosThree.maximumMethod());
	
		System.out.println("  ");
		//--------------------------------------------------------------------------------------------------------
		
		MyGeneric<String> StringPosOne = new MyGeneric<String>("Peach", "Apple", "Banana");     //Test 1
		System.out.println(StringPosOne.maximumMethod());
		
		MyGeneric<String> StringPosTwo = new MyGeneric<String>("Banana", "Peach", "Apple");     //Test 2
		System.out.println(StringPosTwo.maximumMethod());
		
		MyGeneric<String> StringPosThree = new MyGeneric<String>("Banana", "Apple", "Peach");   //Test 3
		System.out.println(StringPosThree.maximumMethod());
	
    }
}
