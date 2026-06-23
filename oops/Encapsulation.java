package oops;

public class Encapsulation {
    private String name;
    private int age;

    // getter method 
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        if(age>=0)
        {
        this.age = age;
        }
    }
}
