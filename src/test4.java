public class test4 {
    static int f(int n){
        int rev = 0;
        while (n != 0){
            //pop
            int pop = n % 10;
            n /= 10;
            //push
            rev = rev*10 + pop;
        }
        return rev;
    }

    public static void main(String[] args){
        System.out.println(f(1234));
    }
}

//Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
//The signature of the function is:
//int f(int n)