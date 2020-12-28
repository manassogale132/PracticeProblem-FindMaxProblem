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


class MyGeneric<T extends Comparable<T>> {         //Generic class extending to comparable
	
	T one;                                               //Generic variables
	T two;
	T three;

	
    public MyGeneric(T one, T two, T three) {
		super();
		this.one = one;
		this.two = two;
		this.three = three;
	}


	public T maximumMethod() {  //Return type of this method is <T> i.e Generic type.
		
		T maximum =  one;                   //1 : Initially we assume that 'maximum' is 'one'.
		
		if(two.compareTo(one) > 0 ) {       //2 : Then we use compareTo() method to test 'two' with previous 'maximum'-(i.e one).
			
			maximum = two;                  //Now updated maximum is 'two'.
		}
		
		if(three.compareTo(maximum) > 0) {  //3 : Then we use compareTo() method to test 'three' with previous 'maximum'-(i.e two).
			
			maximum = three;                //Now updated maximum is 'three'.
		}
		
		return maximum;
	                   		
	}
    
   
}
