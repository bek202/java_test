public class t3 {
    static int isOnionArray(int[ ] a){
        int len;                      //length
        len = a.length;
        int result = 0;                   //1 or 0
        int[ ] b = new int[len];      //copy of input param
        b = a;
        if (len == 1 || len == 0){
            return 1;                //OnionArray (because there is no j, k)
        }
        for (int j = 0, k = len - 1; j < len; j++, k--){
            if (j + k + 1 == len){
                if (j != k){
                    if (b[j] + b[k] <= 10){
                        result = 1;     //OnionArray
                    }
                    else {
                        return 0;
                    }
                }
            }
        }
        if (result == 1){
            return result;
        }
        return 0;                    //It's not
    }

    public static void main(String[] args){
        int[ ] arr = {1,2,19,4,5};
        int[ ] arr1 = {1,2,3,4,15};
        int[ ] arr2 = {1,3,9,8};
        int[ ] arr3 = {2};
        int[ ] arr4 = {};
        int[ ] arr5 = {-2,5,0,5,12};
        System.out.println(isOnionArray(arr5));
    }
}
