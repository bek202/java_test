public class test5b {

    static int[] f(int[] first, int[] second){
        int k,n, n2;
        k = 0;
        n = first.length;
        n2 = second.length;
        int[] r = new int[n2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n2; j++){
                if (first[i] == second[j]){
                    r[k] = first[i];
                    k++;
                }
            }
        }
        return r;
    }

    public static void main(String[] args){
        int[] a = {1,8,3,2};
        int[] b = {4,2,6,1};
        //System.out.println(f(a, b));
        f(a,b);
    }
}
