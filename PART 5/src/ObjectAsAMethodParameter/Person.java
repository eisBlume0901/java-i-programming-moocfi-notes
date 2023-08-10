package ObjectAsAMethodParameter;

public class Person
{
    //encapsulate instance variables
    private String name;
    private int age;
    private int weight;
    private int height;

    //Overloading constructor
    public Person(String name)
    {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int height, int weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //Getter
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getHeight()
    {
        return height;
    }

    //Method
    public void growOlder()
    {
        this.age++;
    }

    public double bodyMassIndex()
    {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    //Setter

    public void setHeight(int newHeight)
    {
        this.height = newHeight;
    }

    public void setWeight(int newWeight)
    {
        this.weight = newWeight;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + "years";
    }
}
