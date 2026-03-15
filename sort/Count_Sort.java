package sort;

import java.util.Arrays;
//Time Complexity = O(n+k)
// Space Comp = O(n)
// Non Comparision Based Algo
public class Count_Sort {
    public static void main(String[] args) {
        int[] arr = { 1,2,1,4,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] num)
    {   //base check
        if(num == null || num.length<=1)
        {
            return ;
        }
        //first of all we should find the max for storing the frequency in the array
        int max = 0;
         for (int i : num)
         {
            if(max<i)
            {
                max = i;
            }
         }
         // create a array of size max+1
        int [] CountArray =  new int [max+1];
        for(int numb:num)
        {
            CountArray[numb]++;
        }
        
        // store the number of frequency from the index 0

        int index =0;
        for(int i =0;i<CountArray.length;i++)
        {
            while(CountArray[i]>0)
            {
                num[index]=i;
                index++;
                CountArray[i]--;
            }
        }
}

}
/*Counting Sort – Limitations (Key Points)

1️) Large range problem

Agar maximum value (k) bahut large ho to counting array bahut bada banana padta hai.

2️) High space usage

Extra array lagta hai.

Space complexity: O(k).

3️) Negative numbers directly handle nahi karta

Basic counting sort sirf non-negative integers ke liye hota hai.

4️) Sparse data me inefficient

Agar elements kam ho aur range bahut badi ho to memory waste hoti hai.

5️) Non-comparison sort

Sirf integers / limited range values par kaam karta hai.

Generic data types par directly use nahi hota.

6️) Range dependent algorithm

Performance data ke range par depend karta hai, na ki sirf elements ke number par.*/