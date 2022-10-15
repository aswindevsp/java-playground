class JavaExc {
    public static void main (String args[]) { 
       try {
        	int data = 5 / 0;
        } 
        catch (ArithmeticException e) {
        	System.out.println(e);
        }
        finally {
        	System.out.println ("Finally Code Block for Arithmatic Exception");
        	System.out.println();
        }
        
        
        try {
        	int arr[] = {1,2,3};
        	int b = arr[4];
        } 
        catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
        finally {
        	System.out.println ("Finally Code Block for ArrayIndexOutOfBounds");
        }  
        
    } 
}




//java.lang.ArithmeticException: / by zero
//Finally Code Block for Arithmatic Exception

//java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
//Finally Code Block for ArrayIndexOutOfBounds
