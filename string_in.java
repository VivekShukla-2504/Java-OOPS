//in java string are immutable
public class string_in {
    public static void main(String[] args) {
        // jvm use's stack and heap( string pool)
        String a = "hello"; // using literal
        String b = "hello";
        String c = new String("hello");//using constructor
        System.out.println(a == b);// return true because both var points same 
        System.out.println(a == c);// return false because both var points different loc
        System.out.println(a.equals(c));// return true because both var points same value(not same reference)
        String name = "Vivek";
        String n=name.toUpperCase();
        System.out.println(name);
        System.out.println(n);//change in upper case
        //text length
        System.out.println(name.length());
        // finding character
        System.out.println(name.charAt(4));
    }
    
}
