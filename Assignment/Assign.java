public class Assign {
    public static void main(String[] args) {
        

        int n = 6; // example value
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i * i; j++) {
                for (int k = 1; k <= n / 2; k++)
                     {
                        count++;
                    System.out.println(count+"JNU");
                    
                }
            }
        }
    }
    }

