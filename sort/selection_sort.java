package sort;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,7,2,-29};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
       for(int i =0;i<arr.length;i++)
       {
        //find max index with in range 
        int last = arr.length-i-1;
         int max = getmax(arr,0,last);
         swap(arr,max,last);
       }
    }
    static int getmax(int[] nums,int first,int last)
    {
        int max = first;
        for(int j =first;j<last;j++)
        {
            if(nums[j]>nums[max])
            {
                max = j;
            }
        }
        return max;
    }
    static void swap(int[] nums2,int maximum,int last)
    {
        
            int temp = nums2[maximum];
            nums2[maximum]=nums2[last];
            nums2[last]=temp;

        
        
    }
}
