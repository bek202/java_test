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
        int[] arr = {1,2,3,4,5};
        System.out.println(f(arr));
    }
}
