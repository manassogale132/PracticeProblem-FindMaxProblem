
public class FindMax {

	public static void main(String[] args) {
		
		//one = 8.31f ,two = 4.31f,three = 5.99f;  (Maximum Number is at 1st Position).
		System.out.println(maximumFloatMethod("8.31f","4.31f","5.99f"));     
		
		//one = 4.31f ,two = 8.31f,three = 5.99f;  (Maximum Number is at 2nd Position)
		System.out.println(maximumFloatMethod("4.31f","8.31f","5.99f"));     
		
		//one = 5.99f ,two = 4.31f,three = 8.31f;  (Maximum Number is at 3rd Position).
		System.out.println(maximumFloatMethod("5.99f","4.31f","8.31f"));  
		
	}
	
	
	public static <T extends Comparable<T>> T maximumFloatMethod(T one,T two,T three) {  //Return type of this method is <T> i.e Generic type with 3 parameters.
		
		T maximum =  one;                   //1 : Initially we assume that 'maximum' is 'one'.
		
		if(two.compareTo(one) > 0 ) {       //2 : Then we use compareTo() method to test 'two' with previous 'maximum'-(i.e one).
			
			maximum = two;                  //Now updated maximum is 'two'.
		}
		
		if(three.compareTo(maximum) > 0) {  //3 : Then we use compareTo() method to test 'three' with previous 'maximum'-(i.e two).
			
			maximum = three;                //Now updated maximum is 'three'.
		}
		return maximum;                     //Finally returning the 'maximum'.
				
	}

}
