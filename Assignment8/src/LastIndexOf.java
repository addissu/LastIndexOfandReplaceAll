
public class LastIndexOf {

	public static void main(String[] args) {
		//int [] values = {33,12,22,12,14};

		//int [] value = {33,12,22,12,14};
		
		
		replaceAll(4,9);
		
		//calls method with value and returns index number
		System.out.println(lastIndexOf(5));
		
	}
	
	
	
	//finds last index of array beginning the loop at the end of list
	public static int lastIndexOf(int value) {
		 int [] elementData= {4,5,6,7};
		 //int size=elementData.length;
		
        for (int i = elementData.length-1; i > 0; i--) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }

	
	
	//will replace all occurrences of the given number
	public static int replaceAll(int replace, int substitute) {
		
		int [] elementData= {4,5,6,7};
		//loop through array 
				for(int i=0;i<elementData.length;i++) {
			//if any number in array = replace then that 
					//will be substituted 
			if(elementData[i]==replace) {
				
				 elementData[i]=substitute;
			}
			
		}
		return substitute;
		
}
	
	
}
