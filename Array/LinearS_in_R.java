package Array;

import java.util.Scanner;

public class LinearS_in_R {
    public static void main(String[] args) {
        int[] nums = {2,7,-2,8,0,4,6};
        //int target = 6;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(linearSearch(nums, target, 1,4));
    }
    static int linearSearch(int[] arr , int target,int start,int end)
    {  //first of all we check the length of array
        if(arr.length == 0)
        {
            return -1;
        }
        for(int i=start;i<=end;i++)
        {
          int element = arr[i];
          if(element == target)
          {
            return i;
          }
        }
        return -1;
    }
}
