public class test3 {
    static char[] f(char[] a, int start, int len){
        char[] r = a;
        if (start != 0 || len > a.length)
            return null;
        while (start < len)
        {
            r[start] = a[start];
            start = start + 1;
        }
        return r;
    }

    public static void main(String[] args){
        char[] arr = {'a', 'b', 'c', 'd'};
        System.out.println(f(arr, 1, 4));
    }
}



//Write a function that accepts a character array, a zero-based start position and a length.
// It should return a character array containing containing lengthcharacters starting with the startcharacter of the input array.
// The function should do error checking on the start position and the length and return null if the either value is not legal.
//The function signature is:
//char[ ] f(char[ ] a, int start, int len)