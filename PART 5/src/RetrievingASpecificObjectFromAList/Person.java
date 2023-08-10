package RetrievingASpecificObjectFromAList;

public class Person
{
    //Encapsulate instance variables
    private String name;
    private int age;
    private int weight;
    private int height;

    //Constructor overloading
    public Person(String name) {
        this(name, 0, 0, 0);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    //Methods
    //getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    //setters
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    //Parameterless / Void type methods
    public void growOlder() {
        this.age = this.age + 1;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }


    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}