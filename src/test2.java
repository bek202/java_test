public class test2 {
    static int f(int[] a){
        int x, y;
        x = y = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0)
                y = y + a[i];
            else
                x = x + a[i];
        }
        return x-y;
    }

    public static void main(String[] args){
        int[] arr = {1,1};
        System.out.println(f(arr));
    }
}


//Write a function that takes an array of integers as an argument and returns a
// value based on the sums of the even and odd numbers in the array.
// Let X = the sum of the odd numbers in the array and let Y = the sum
// of the even numbers. The function should return X – Y
//
//
//