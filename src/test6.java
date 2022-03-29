public class test6 {
    static int f(int[] a){
        int k = 0;
        int sum1, sum2, n;
        n = a.length;
        for (int i = 1; i < n; i++){
            sum1 = sum2 = k = 0;
            while (k < i){
                sum1 += a[k];
                k++;
            }
            for (int j = i + 1; j < n; j++){
                sum2 += a[j];
            }
            if (sum1 == sum2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {1,8,3,7,10,2};
        System.out.println(f(a));
    }
}

//Consider an array A with n of positive integers.
// An integer idx is called a POE (point of equilibrium) of A, if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1].
// Write a function to return POE of an array, if it exists and -1 otherwise.
//The signature of the function is:
//int f(int[] a)