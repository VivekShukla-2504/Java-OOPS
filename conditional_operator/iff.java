package conditional_operator;

public class iff {
    public static void main(String[] args) {
        boolean str = true;
        boolean s = false;
        // + for concatenation
        if(str && s)
        {
            System.out.println("it is sunny");
        }
        else if(str || s)
        {
            System.out.println("cold");
        }
        else
        {
            System.out.println("not sunny");
        }
    }
}
