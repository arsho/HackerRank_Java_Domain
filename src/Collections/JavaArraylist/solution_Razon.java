package Collections.JavaArraylist;


import java.util.Scanner;


public class solution_Razon {

	public static void main(String[] args) {
	
		System.out.println(" ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
		
        java.util.ArrayList<java.util.ArrayList<Integer>> numbers = new java.util.ArrayList<java.util.ArrayList<Integer>>();
        
        for (int i = 0; i < n; i++) {
        	
        	int d = sc.nextInt();
        	java.util.ArrayList<Integer> dNumbers = new java.util.ArrayList<Integer>();
        	
        	for (int j = 0; j < d; j++) {
				
        		dNumbers.add(sc.nextInt());
        		
        		
			}
        	
        	numbers.add(dNumbers);
        	
			
		}
        
       
        
        int p = sc.nextInt();
        java.util.ArrayList<Integer> dprArrayList = new java.util.ArrayList<Integer>();
        int k=0;
        while (k<p) {
			
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
//        	if (numbers.size()<x) {
//        		System.out.println("ERROR!");
//			}else {
//				
				dprArrayList = numbers.get(x-1);
	        	
				 System.out.println("i is: "+k+"P is "+p+dprArrayList);
				
	        	if (dprArrayList.size()<y) {
	        		System.out.println("ERROR!");
				}else {
					
					System.out.println(dprArrayList.get(y-1));
				}
				
			//}
        	
        	
        	k++;
        	
		}
        
		
		
	}
}
