import java.util.Scanner;

class SelectionSort
{
     void Sort(int arr[])

  {
    int i,j,k;
    int n = arr.length;
    for(i = 0 ; i < n-1 ; i++) 
     {
         for ( j = i + 1 ; j < n ; j++)
          {
               if( arr[j] < arr[i] ) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                  }
          }
           
     }
  }

  void printArr(int arr[])    // 8 7 5 4 2

{
   int n = arr.length;
   for(int p = 0 ; p < n ; p++) {
     System.out.print(arr[p] + " ");
     System.out.print(" " );
   }
 
}

public static void main(String args[])

{
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of array : ");
int m = sc.nextInt();
int arr[] = new int[m];
System.out.println("Enter the array elements");
for(int i = 0 ; i < m ; i++){

    arr[i] = sc.nextInt();
    } 
SelectionSort obj = new SelectionSort();
obj.Sort(arr);
System.out.println("The sorted Array is : ");
obj.printArr(arr);
}

}       

///////////// I got a help from Sourav in this code

   







