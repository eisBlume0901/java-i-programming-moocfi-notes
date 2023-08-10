package Person.PersonFromPart4;

public class PersonFromPart4
{
    private final String name;
    private int age;
    private int height;
    private int weight;

    /* public PersonFromPart4(String name)
    {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    } */

    /*new and alternative constructor - constructor overloading

    public PersonFromPart4(String name, int weight) cannot be a constructor as it would be impossible
    for Java to differentiate between this and the one that has two parameters where int parameter is used
    for age.

    Simply, two different datatype or additional is possible but not with the same datatypes in the same
    parameters.
     */

    public PersonFromPart4(String name)
    {
        this(name, 0);
        /* call is automatically replaced with the second copy of constructor.
        If a constructor calls another constructor, the constructor call must be
        the first command in the constructor.

        Note: String name should be labelled as final.
         */
    }
    public PersonFromPart4(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    /* method overloading
    Methods can be overloaded in the same way as constructor.

    Parameters of the different versions must be different.
     */
    public void growOlder()
    {
        this.age++;
    }

    public void growOlder(int years)
    {
        this.age = this.age + years;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
}
