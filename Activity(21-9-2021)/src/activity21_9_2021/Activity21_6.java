package activity21_9_2021;

public class Activity21_6 {

	public static void main(String[] args) {
		 try{
			 int a[]=new int[5];
//			 int b[]=new int[-5];
//			 a[5]=30/0;
//             String s=null; 
//             System.out.println(s.length());
//             String text = "This is like chipping ";
//             System.out.println(text.charAt(24));
              System.out.println(a[10]);
             
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(NullPointerException e)  
               {  
                System.out.println("NullPointerException occurs");  
               }  
		     catch (StringIndexOutOfBoundsException e)
		       {
	            System.out.println("StringIndexOutOfBoundsException occurs");
	           }
			 catch(NegativeArraySizeException  e)  
	         {  
	          System.out.println("NegativeIndexException occurs");  
	         }
		 
            System.out.println("rest of the code");  
	}

}
