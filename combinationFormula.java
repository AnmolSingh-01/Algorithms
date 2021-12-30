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

    public static void main(String[] args) {
        System.out.println("The value corresponding to given n and r is "+nCr(5,1));
    }
}
