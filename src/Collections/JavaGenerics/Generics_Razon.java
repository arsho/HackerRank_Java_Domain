package dataStructure;

import java.lang.reflect.Method;


class Printer
{

	public void printArray(Object[] objects) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}
		
	}
   //Write your code here
 
}
public class Generics_Razon {

	/**
	 * @param args
	 */
	public static void main( String args[] )
    {
        Printer myPrinter=new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        myPrinter.printArray( intArray  );
        myPrinter.printArray( stringArray );
        int count=0;
      for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;

    } 

}
