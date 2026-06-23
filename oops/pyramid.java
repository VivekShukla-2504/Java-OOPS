package oops;

public class pyramid {
    public static void main(String[] args) {
        
        // we have to use 2 loop of j inside the i 
        //space n-i, 2*i-1 for *
        int n =5;
        for(int i =1;i<=n;i++)
        {
            for(int j =1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
