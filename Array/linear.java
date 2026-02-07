package Array;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
       int[] nums = { 2,8,40,37,-14,28,-42};
       System.out.println("Enter the Element which you want to find");
       Scanner sc = new Scanner(System.in);
       int target = sc.nextInt();
       int ans = linearSearch(nums, target);
       if(ans!=-1)
       {
       System.out.println(target + " at index "+ans);
       }
       else 
       {
        System.out.println( target +" Not found ");
       }
    }

static int linearSearch(int [] arr,int target)
{
 if(arr.length==0)
 {
    return -1;
 }
 for(int i =0;i<arr.length;i++)
 {
    int element = arr[i];
    if(element==target)
    {
        return i;
    }
 }
 return -1;
}
}