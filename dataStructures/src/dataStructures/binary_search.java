package dataStructures;

public class binary_search {

public static boolean binarySearch(int[] ar,int key) 
    {
         int size= ar.length;
		 int first = 0;
         int last = size - 1;
         int temp = 0;
         
         System.out.println("entered key: "+key);
         System.out.println("entered array: ");
         for(int i=0; i<ar.length; i++) {
         System.out.print(ar[i]+" ");
         }
         
         //sort the array in ascending order
         for(int i=0; i<ar.length; i++) {
        	 for(int j=i; j<ar.length-1; j++) {
        		 if(ar[j]>ar[j+1]) {
        			 temp= ar[j];
        			 ar[j]=ar[j+1];
        			 ar[j+1]=temp;
        		 }
        	 }
         }
         System.out.println();
         System.out.println("sorted array: ");
         for(int i=0; i<ar.length; i++) {
             System.out.print(ar[i]+" ");
             }
         
         //divide and conquer
         while(last >= first) {
             int middle = (first + last) / 2;
             if(ar[middle] == key) {
                 return true;
             }
             if(ar[middle] < key) {
                 first = middle + 1;
             }
             if(ar[middle] > key) {
                 last = middle - 1;
             }
        }
        return false;
   }


public static void main(String[] args) {
		 
		int ar[]= {1,2,3,4,5,6,54,7,97,11};
		boolean res=binarySearch(ar,97);
		System.out.println();
		if(res)
		System.out.println("Key present");
		else
		System.out.println("Key not present");	
	}
}