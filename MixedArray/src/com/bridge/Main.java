package com.bridge;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

public class Main {
    public void intArray() {
        MixedArray mixedArray = new MixedArray();
        int[] intArray = new int[4];
        int i= 0;
        for (Object o : mixedArray.array ) {
            if (o instanceof Integer) {
                if(intArray[i]==0) {
                    intArray[i] = ((Integer) o).intValue();
                    i++;
                }
            }
        }
        System.out.print("Integer Array Elements are : ");
        for (int element: intArray) {
            System.out.print(element+", ");
        }
        System.out.println();
    }
    
   public  void stringArray() {
        MixedArray mixedArray = new MixedArray();
        String[] stringArray = new String[3];
        int i= 0;
        for (Object o : mixedArray.array ) {
            if (o instanceof String) {
                if(stringArray[i]==null) {
                    stringArray[i] = (String) o;
                    i++;
                }

            }
        }
        System.out.print("String Array Elements are : ");
        for (String element: stringArray) {
            System.out.print(element+", ");
        }
        System.out.println();
    }

    	
    
   void booleanArray() {
       MixedArray mixedArray = new MixedArray();
       Boolean[] booleanArray = new Boolean[2];
       int i= 0;
       for (Object o : mixedArray.array ) {
           if (o instanceof Boolean) {
               if (booleanArray[i] == null) {
                   booleanArray[i] = (Boolean) o;
                   i++;
               }
           }
       }
       System.out.print("Boolean Array Elements are : ");
       for (Boolean element: booleanArray) {
           System.out.print(element+", ");
       }
       System.out.println();
   }
   
   public void doubleArray() {
	   MixedArray mixedArray = new MixedArray();
	   Double doubleArray[] = new Double[2];
	   int i = 0;
	   
	   for(Object o : mixedArray.array) {
		   if(o instanceof Double) {
			   if(doubleArray[i] == null) {
				   doubleArray[i] =(Double) o;
				   i++;
			   }
		   }
	   }
	   System.out.print("Double Array elements are: ");
	   for(Double element : doubleArray) {
		   System.out.print(element+ " ,");
	   }
	   System.out.println();
	   
   }


	
	public static void main(String[] args) {
					
			Main main = new Main();
			main.intArray();
			main.stringArray();
			main.booleanArray();
			main.doubleArray();
		
//	for(Object obj : arr) {
//		//System.out.println(obj.getClass());
//		
//			//System.out.println("this is the instance of Integer: " +obj	);
//			
//			if(obj instanceof Integer) {
//				//System.out.println("this is instance of Integer: " +obj);
//				   //Integer[] integerArray = (Integer)
//			          
//			        }
//				
//			}
	}
}	
	

	


