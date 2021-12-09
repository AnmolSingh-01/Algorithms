import java.util.Scanner;
class Linearsearch {

public static int search(int arr[], int x) {

int n = arr.length ;
for(int i = 0 ; i < n ; i++){
   if(arr[i] == x) {
         return i ;
     }
}
   return -1;
}

public static void main(String args[]) {

System.out.println("Enter the size of the array : ");
Scanner sc = new Scanner(System.in);
int m=sc.nextInt();
int[] arr = new int[m];
System.out.println("Enter the array elements ");

for(int i = 0 ; i < m ; i++) {

arr[i] = sc.nextInt();
}
System.out.println("Enter the element you want to search");
int x = sc.nextInt();
int result = search(arr,x);
if(result == -1)
System.out.println("Element is not present in array");
else
{
System.out.println("Element is present at index "+ result);
}

}
}
