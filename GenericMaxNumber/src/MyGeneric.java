
public class MyGeneric<T extends Comparable<T>> {         //Generic class extending to comparable
	
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
