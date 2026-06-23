/*package oops;

public class reverse {
    public static void main(String[] args) {
        int num = 1234,rev =0;
        while(num!=0)
        {
            int digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        System.out.println(rev);
    }
} */
//sum 
package oops;

public class reverse {
    public static void main(String[] args) {
        int num = 1234,sum =0;
        while(num!=0)
        {
            int digit = num%10;
            sum += digit;
            num/=10;
        }
        System.out.println(sum);
    }
}
//sum 

