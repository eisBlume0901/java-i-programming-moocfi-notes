package Person.NewPerson;

public class Person
{
    //encapsulate instance variables
    private String name;
    private int birthYear;
    //Constructor
    public Person(String name)
    {
        this.name = name;
        this.birthYear = 1970;
    }
    //Getter
    public int getBirthYear()
    {
        return this.birthYear;
    }
    //Setter
    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    @Override
    public String toString()
    {
        return this.name + "(" + this.birthYear + ")";
    }
}
