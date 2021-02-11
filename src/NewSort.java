import java.util.Scanner;

public class NewSort {
	public static void insertionSort(int array[], int n) {    
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
    	int n;  
		   Scanner sc = new Scanner(System.in);  
		   System.out.print("Enter the number of elements you want to store: ");  
		    
		   n=sc.nextInt();  
		    
		   int[] arr= new int[10];  
		   System.out.println("Enter the elements of the array: ");  
		   for(int i=0; i<n; i++) {     
			   arr[i] = sc.nextInt();  
		   }    
        System.out.println();    
            
        insertionSort(arr, n);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	      }  
    }    
}    

