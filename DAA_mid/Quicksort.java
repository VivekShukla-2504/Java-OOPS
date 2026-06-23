package DAA_mid;
import java.util.Arrays;

import java.util.Random;
// arr = {2,5,8,9,5}; using recursion
public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {3,7,9,30,6,900};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr)); 
    }
    //for random quick sort
     static Random rand = new Random();  
    static void sort(int[] nums, int low,int hi)
    {
      if(low>=hi)
        { return; }
      int s = low;
      int e = hi;
      //int m = s+(e-s)/2;
       int m = low+rand.nextInt(hi-low+1);
      int pivot = nums[m];
      while(s<=e)
      {
        while(nums[s]<pivot){
            s++;
        }
        while(nums[e]>pivot)
        {
            e--;
        }
        if(s<=e)
        {
            int temp = nums[s];
            nums[s]=nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
      }
      sort (nums,low,e);
      sort(nums,s,hi);
    }
}
