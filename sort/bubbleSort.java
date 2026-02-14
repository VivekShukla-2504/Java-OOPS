package sort;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        Sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void Sort(int[] arr)
    { 
        boolean swaped;
        for(int i =0;i<arr.length;i++)
        {   swaped = false;
            for(int j =1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swaped = true;
                }
            }
            if(!swaped)
        {
            break;
        }
        }
        
    }
}
