package oops;

public class prime {
    public static void main(String[] args) {
        //khud se ya 1 se divisible
        int n=20;
        for(int i = 2;i<=n;i++)
        {
            boolean isPrime = true;
            for(int j=2;j*j<i;j++)
            {
                if(i%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
              System.out.println(i+" ");
            }
        }
    }
    
}
