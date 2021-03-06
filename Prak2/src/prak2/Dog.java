package prak2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int dog_to_man()
    {
        return age*7;
    }

    public String toString()
    {
        return "Dog{name is " + name + ", age is " + age + ", dog age to man is " + this.dog_to_man() + "}.";
    }
}
