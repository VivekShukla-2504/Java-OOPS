package Array;

public class linear_min {
    public static void main(String[] args) {
        
    
      int[] nums = {2,7,-2,8,0,4,6};
        
        if(nums.length==0)
        {
            return ;
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min = nums[i];
            
            }
        }
        
    System.out.println("Maximum element is" + min);
        
    
}
}