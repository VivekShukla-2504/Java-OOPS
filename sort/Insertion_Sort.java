package sort;
import java.util.Arrays;
public class Insertion_Sort
{
    public static void main(String[] args) 
    {
     int[] arr ={5,9,2,7,4*4,-3};
     Insertion(arr);
     System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[] nums)
   {
      for(int i =0 ;i<nums.length-1;i++)
      {
        for(int j=i+1;j>0;j--)
        {
            if(nums[j]<nums[j-1])
        {
          swap(nums,j,j-1);
        }
        else
        {
            break;
        }
        }
        
      }
    
   }
   static void swap(int[] arr,int f,int e)
   {
    int temp = arr[f];
    arr[f]=arr[e];
    arr[e]=temp;
   }
}