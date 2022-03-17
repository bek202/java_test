
public class test {
    static int myMethod(int[] arr)
    {
        int len, ret, mid, i;
        i = ret = 0;
        len = arr.length;
        if(len % 2 == 0)
        {
            ret = 0;
        }
        else
        {
            mid = ( len - 1 ) / 2;
            while (i < len)
            {
                if(arr[mid] > arr[i]){ ret = 1; }
                else{ ret = 0; break;}
                i = i + 1;
            }
        }
        return ret;
    }

    public static void main (String[] args)
    {
        int[] myArr = {10, 20, 30, 45, 25};
        System.out.println(myMethod(myArr));
    }
}