package sort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,2,7,9,-4,4};
        Sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void Sort(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            for(int j =1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
