package Array;

import java.util.Scanner;

public class LinearS_in_R {

    public static void main(String[] args) {

        int[] nums = {2,7,-2,8,0,4,6};

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(linearSearch(nums, target, 1, 4));

        sc.close();
    }

    static int linearSearch(int[] arr, int target, int start, int end)
    {

        if(arr.length == 0){
            return -1;
        }

        if(start < 0 || end >= arr.length || start > end){
            return -1;
        }

        for(int i = start; i <= end; i++)
        {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}