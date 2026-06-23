package oops;
// method overloading - same method name with differents parameter in same class
 /*class Add {
    
    int add(int a ,int b)
    {
        return  a+b;
    }
    // Same method name perform different operation
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
    public class Polymorphism {
    public static void main(String[] args)
    {   // Create a Obj for clas Add
        Add obj = new Add();
        System.out.println(obj.add(8,10));
        System.out.println(obj.add(5,8,9));

    }
}
*/
// method overrriding
class Payment {
    void pay()
    {
     System.out.println("Credited via UPI");
    }
}
 class UPI extends Payment{
    @Override
    void pay()
    {
        System.out.println("Credited via UPI card");
    }
 }
 class Generic extends Payment{
    @Override
    void pay()
    {
        System.out.println("Payemnt received via UPI");
    }
 }
    public class Polymorphism{
    public static void main(String[] args)
    {   // Create a Obj for clas UPI using class payement
        Payment obj = new UPI();
        obj.pay();
        obj.pay();

    }
}