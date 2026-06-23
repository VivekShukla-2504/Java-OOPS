package oops;

public class Encaps {
    /* bundling the data and method and prevent to unauthorised access 

    Protects data from unauthorized access

    Improves security

    Makes code more maintainable and flexible

    Allows control over how data is modified

    used getter - for retrieve data and setter - set data
    first of all we create a class  
    */
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }
    public void  setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
     public void setAge(int age)
     {
        if(age>=18)
        {
             this.age = age;
        }
        else if(age>=0)
        {   System.out.println("u are not eligile for vote");
            this.age = age;
        }
        else {
            System.out.println("Please Enter age above");
        }
     }
}
