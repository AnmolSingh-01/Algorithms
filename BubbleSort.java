import java.util.Scanner;
class BubbleSort

{

   void bubbleSort(int arr[])

{
    int n = arr.length;
    for(int i = 0 ; i < n-1 ; i++)  {
        
         for(int j = 0 ; j < n-1-i ; j++) {
                 
             if( arr[j] > arr[j+1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
             }
       }
  }
}

void printArr(int arr[]) 
 {
     int n = arr.length;
     for(int i = 0 ; i < n ; i++) {
          
         System.out.print(arr[i] + " " );
     }
}

public static void main(String args[]) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the no of elements : ");
  int m = sc.nextInt();
  int[] arr = new int[m];
  System.out.println("Enter the array elements ");
  
  for( int i = 0 ; i < m ; i++) {
     
       arr[i] = sc.nextInt();
     }
  BubbleSort obj = new BubbleSort();
  obj.bubbleSort(arr);
  System.out.println("Sorted Array is : ");
  obj.printArr(arr);
  }
}
      



















                    