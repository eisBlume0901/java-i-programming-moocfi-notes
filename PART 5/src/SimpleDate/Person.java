package SimpleDate;

import java.util.Objects;

public class Person
{
    //Encapsulate instance variables
    private String name;
    private SimpleDate birthday;
    private int age;
    private int weight = 0;
    private int height = 0;

    //Constructor overload
    //Using object variable
    //Simple date has parameters of day, month, and year
    public Person(String name, SimpleDate date)
    {
        this.name = name;
        this.birthday = date;
    }
    //Using instance variables from class Person
    //This is done to see the difference
    public Person(String name, int day, int month, int year)
    {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    /* This method is not compatible with the class; thus, to compare
    the age, it should be put under SimpleDate class
    public SimpleDate.SimpleDate getBirthday()
    {
        return birthday;
    }
     */

    //Getter
    public int getAge()
    {
        return this.age;
    }

    public int getHeight()
    {
        return this.height;
    }

    //Setter
    public void setAge(int age)
    {
        this.age = age;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    //Method
    public boolean olderThan(Person compared)
    {
        if (this.birthday.before(compared.birthday))
        {
            return true;
        }
        return false;
    }

    /* Automatic generation of public boolean equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return weight == person.weight && length == person.length && Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }
     */

    @Override
    public boolean equals(Object obj)
    {
        //If the variables are located in the same position, they are equal
        if (this == obj)
        {
            return true;
        }
        //If the compared object is not of type Person, the objects are not equal
        if (!(obj instanceof Person))
        {
            /* instanceOf is also known as type comparison operator because it
            compares the instance with the type.

            Example:

            class Simple1
            {
                public static void main(String[] args)
                {
                    Simple1 s = new Simple1();
                    System.out.println(s instanceof Simple1); //True
                }
            }

            Reminder:
            instanceOf for null value returns false
             */
            return false;
        }
        //Convert obj into Person object
        Person objPerson = (Person) obj;

        //If the values of the object variables are equal, the objects are equal

        if (this.name.equals(objPerson.name) &&
        this.age == objPerson.age &&
        this.weight == objPerson.weight &&
        this.height == objPerson.height)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
