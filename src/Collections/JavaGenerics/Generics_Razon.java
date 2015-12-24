package Collections.JavaGenerics;

import java.lang.reflect.Method;


class PrinterRazon
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
        PrinterRazon myPrinterRazon=new PrinterRazon();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        myPrinterRazon.printArray( intArray  );
        myPrinterRazon.printArray( stringArray );
        int count=0;
      for (Method method : PrinterRazon.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;

    } 

}
