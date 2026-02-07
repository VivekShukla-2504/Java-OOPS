package Array;

public class LinearMax 
{
    public static void main(String[] args) 
    {
        int[] nums = {2,7,-2,8,0,4,6};
        
        if(nums.length==0)
        {
            return ;
        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
            
            }
        }
        
    System.out.println("Maximum element is" + max);
        
    
    }
    
}
