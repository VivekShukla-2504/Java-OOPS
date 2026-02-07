package Array;

public class order_Agno_in_BS {
    public static void main(String[] args) {
        int[] arr = {100,90,60,20,9};
        int target = 9;
        int ans = BS(arr,target);
        System.out.println("Target at index "+ans);
}
static int BS(int[] nums,int target)
    {
        int low =0 ;
        int high = nums.length-1;
        boolean IsAsc=nums[low]<nums[high];
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
            {
                 return mid;
            }
            else if(IsAsc)
            {
               if(nums[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
            }
            else{
                 if(nums[mid]>target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
            }
            
        }
        return -1;
    }
}

