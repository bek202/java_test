public class test1a {
     static int isMercurial(int[] a) {
        int len;                      //length
        len = a.length;
        if(a == null || len == 0) return 1; //Mercurial array
        int num1 =0;
        int num2 =0;
        int num3 =0;
        boolean num1Assign = false;
        boolean num2Assign = false;

        for (int i=0 ; i < len; i++){
            if(a[i] == 1) {
                if(num1Assign == true) {
                    num2 = i;
                    num2Assign = true;
                    break;
                } else {
                    num1 = i;
                    num1Assign = true;
                }
            }

            if(a[i] == 3 && num1Assign == true) {
                num3 = i;
            }
        }

        if(num1Assign == false || num2Assign == false){
            return 1;   //Mercurial array
        }

        if(num1 < num3 && num3 < num2) {
            return 0;   //It is not
        }else{
            return 1;   //Mercurial array
        }
    }

    public static void main(String[] args){
        int[ ] arr = {1, 2, 10, 3, 15, 1, 2, 2};
        int[ ] arr1 = {5, 2, 10, 3, 15, 1, 2, 2};
        int[ ] arr2 = {1, 2, 10, 3, 15, 16, 2, 2};
        int[ ] arr3 = {3, 2, 18, 1, 0, 3, -11, 1, 3};
        int[ ] arr4 = {2, 3, 1, 1, 18};
        int[ ] arr5 = {8, 2, 1, 1, 18, 3, 5};
        int[ ] arr6 = {3, 3, 3, 3, 3, 3};
        int[ ] arr7 = {1};
        int[ ] arr8 = {};
        System.out.println(isMercurial(arr8));
    }
}
