package Operator;

public class logical {
    public static void main(String[] args) {
        boolean str = true;
        boolean s = true;
        // + for concatenation
        boolean v = str && s;
        System.out.println("is it sunny?"+v);

        boolean strs = true;
        boolean ss = false;
        // + for concatenation
        boolean vk = strs || ss;
        System.out.println("is it sunny?"+vk);

    }
}
