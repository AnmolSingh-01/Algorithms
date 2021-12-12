import java.util.Scanner;
class InsertionSort {
  
      void sort(int arr[])  
    {
      
      int n = arr.length;
      for( int i = 1 ; i < n ; i++){
  
           int x = arr[i];
           int j = i - 1 ;
        
      while( j > -1 && arr[j] > x) {
  
             arr[j+1] = arr[j];
             j = j - 1;
       }
      
      arr[j+1] = x ;
   }
 }

void printArr(int arr[])
 {
    int n = arr.length;

    for(int i = 0 ; i < n ; i++) {
   
      System.out.print(arr[i] + " " );
    System.out.println();
}

public static void main(String args[]) {

System.out.println("Enter the size of array : ");
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int arr[] = new Int[m];
System.out.println("Enter the array elements");

for (int i = 0 ; i < m ; i++) {

   arr[i] = sc.nextInt();
}


InsertionSort obj = new InsertionSort();
obj.sort();

printArr(arr);

 }
}