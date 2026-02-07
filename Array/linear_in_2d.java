package Array;

import java.util.Arrays;

public class linear_in_2d {
    public static void main(String[] args) {
        int[][] nums = {
            {2,5,8},
            {4,12,6},{50,10,15}
        };
        int target = 50;
        int[] ans = linear(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] linear(int[][] arr, int target)
    {
      for(int i = 0; i<arr.length;i++)
      {
        for(int j =0; j<arr[i].length;j++)
        {
            if(arr[i][j]==target)
                return new int[]{i,j};
        }
      }
      return new int[] {-1,-1};
    }
    
}
