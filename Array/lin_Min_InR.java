package Array;

public class lin_Min_InR {

    public static void main(String[] args) {

        int[] nums = {2,7,-2,8,0,4,6};

        System.out.println(linearSearch(nums, 0, 6));
    }

    static int linearSearch(int[] arr, int start, int end)
    {

        if(arr.length == 0)
        {
            return -1;
        }

        int min = arr[start];

        for(int i = start; i <= end; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }
}