import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class test5 {
    static int[] findCommonElement(int[] a, int[] b){
        List<Integer> array = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int ele:a){
            set.add(ele);
        }

        for(int ele:b){
            if(set.contains(ele)){
                array.add(ele);
            }
        }

        int[] arr = new int[array.size()];
        for(int i = 0; i < array.size();i++){
            arr[i] = array.get(i);
        }
        return arr;
    }

    public static void main(String[] args){
        int myArray[] = {2,2,7,7,2,1,5,4,5,1,1};
        int myArray2[] = {2,3,4,7,10};


        test5 hello = new test5 ();
        System.out.println(hello.findCommonElement(myArray, myArray2));
    }
}
