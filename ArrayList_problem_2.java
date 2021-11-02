/*Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in yth position of xth line.

Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be  space-separated integers.
In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Constraints
1 <=n <= 20000
0 <=d <= 50000
1 <=d <= 1000
1 <=x <=n

Each number will fit in signed integer.
Total number of integers in  n lines will not cross 10^5. 

Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

Sample Input 
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!

*/

// Solution

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList[] list = new ArrayList[20002];
        int n = sc.nextInt();

    for(int i = 1; i <=n; i++){
        list[i] = new ArrayList();
        int x = sc.nextInt();

        for(int j=1; j<=x; j++){
            int val = sc.nextInt();
            list[i].add(val);
        }
    }
    int q = sc.nextInt();
    for(int i = 1; i <=q; i++){
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        try{
            System.out.println(list[x].get(y-1));
        }
        catch (Exception e){
            System.out.println("ERROR!");
        }
    }
    }
}

