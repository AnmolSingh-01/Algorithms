public class combinationFormula {
    static int fact(int n){
        if(n==0) return 1;
        return fact(n-1)*n;
    }
    static int nCr(int n , int r){
        int num , den;
        num = fact(n);
        den = fact(r)*fact(n-r);
        return num/den;
    }
    // Recursive Approach
   static int NCR(int n , int r){
        if(n==r || r==0) return 1;
        return NCR(n-1,r-1) + NCR(n-1,r);
   }
   //////////////////////

    public static void main(String[] args) {
        System.out.println("The value corresponding to given n and r is "+nCr(5,1));  ///  we can use here NCR also
    }
}
