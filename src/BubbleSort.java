import java.util.Scanner;  

public class BubbleSort {
	static void bubbleSort(int[] arr, int n) {	     
	      int temp = 0;
	      for(int i = 0; i < n; i++) {
	         for(int j=1; j < (n-i); j++) {
	            if(arr[j-1] > arr[j]) {
	               temp = arr[j-1];
	               arr[j-1] = arr[j];
	               arr[j] = temp;
	            }
	         }
	      }
	   }
	   public static void main(String[] args) {
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
	      bubbleSort(arr, n);
	      System.out.println("After Bubble Sort");

	      for(int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	      }
	   }
	}
