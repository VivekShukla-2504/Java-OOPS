package Array;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,9};
        int target = 8;
        int ans = BS(arr,target);
        System.out.println("Target at index "+ans);
    }
    static int BS(int[] nums,int target)
    {
        int low =0 ;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
            {
                 return mid;
            }
            else if(nums[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}
