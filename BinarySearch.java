import java.util.Scanner;
class BinarySearch {

 int binSearch(int arr[] , int x) {

   int low = 0 ;
   int high = arr.length - 1;
   while(low <= high) {

        int mid = low + (high - low )/2 ;
        if(arr[mid] == x) return mid;
        else if(arr[mid] < x) low = mid+1;
        else high = mid -1;
  }
 return -1;
}
public static void main(String args[]) {

   System.out.println("Enter the no of elements in array");
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] arr = new int[n];
   System.out.println("Enter the array elements");
   for(int i =0 ; i < n ; i++) {
       arr[i] = sc.nextInt();
    }
   System.out.println("Enter the element you want to search");
   int x = sc.nextInt();
   BinarySearch obj = new BinarySearch();
   int result = obj.binSearch(arr,x);

   if(result == -1) {
       System.out.println("Element is not present in the array");
             }
   else{
     System.out.println("Element is at index " + result);
  }

}
}

