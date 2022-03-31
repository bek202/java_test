public class t2 {
    static int closestFibonacci(int n) {
        int a;      //copy of argument
        a = n;
        int num1 = 0;
        int fib = 1;
        int lastFib = 0;

        if(a < 1) return 0;
        else if(a == 1) return 1;
        else{
            for(int i = 1; i < a; i++){
                if(num1 < a){
                    lastFib = num1;
                    fib = fib + lastFib;
                    num1 = num1 + fib;
                }
            }
        }
        if(fib > a){
            return lastFib;
        }else{
            return fib;
        }
    }
    public static void main(String[] args){
        int arr = 95;
        System.out.println(closestFibonacci(arr));
    }
}
