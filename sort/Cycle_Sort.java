package sort;

import java.util.Arrays;

public class Cycle_Sort 
{ // check, move, swap    swap value = at index value-1(for 1 to N) for 0 to N => correct = value;
    public static void main(String[] args) 
    { // value should be 1 to N
        int[] nums = {4,0,3,1,2};
        cycle(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void cycle(int[] arr)
    { int i =0;
       while(i<arr.length)
       { int correct = arr[i];
        if(arr[i]!=arr[correct])
        { 
        swap(arr,i,correct);
        }
       else
        {
        i++;
        }
       }
    }
    static void swap(int[] nums, int i ,int j  )
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
