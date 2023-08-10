package Part4Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Person
{
    //Instance variables
    private String name;
    private int age;
    private int weight;
    private int height;

    //Constructor
    public Person(String initialName, int age)
    {
        this.age = age;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public Person(String name, ArrayList<Integer> age) {
    }

    //Method
    public String toString()
    {
        return this.name + ", age " + this.age + " years, my body mass index is " + bodyMassIndex();
    }

    public void growOlder()
    {
        if (this.age < 30)
        {
            this.age = this.age + 1;
        }
    }

    public boolean isOfLegalAge()
    {
        return this.age >= 18;
    }

    public double bodyMassIndex()
    {
        double heightPerHundred = this.height / 100.0;
        return this.weight/ (heightPerHundred * heightPerHundred);
    }

    //Getter
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
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

    public int returnAge()
    {
        return this.age;
    }
    public static void main(String[] args) {
        Person ada = new Person("Ada", 20);
        Person antti = new Person("Antti", 19);
        Person martin = new Person("Martin", 15);

        ada.growOlder();
        System.out.println(ada);
        System.out.println(ada.toString());

        antti.growOlder();
        System.out.println(antti);
        System.out.println(antti.toString());

        martin.growOlder();
        martin.toString();

        Person pekka = new Person("Pekka", 5);

        pekka.growOlder();
        pekka.growOlder();

        System.out.println("Pekka's age: " + pekka.returnAge());

        Person mary = new Person("Mary", 21);
        Person pochi = new Person("Pochi", 20);

        int i = 0;
        while (i < 21) {
            mary.growOlder();
            i++;
        }

        pochi.growOlder();

        System.out.println();

        if (pochi.isOfLegalAge()) {
            System.out.println("of legal age: ");
            System.out.println(pochi);
        } else {
            System.out.println("underage: ");
            System.out.println(pochi);
        }
        if (mary.isOfLegalAge()) {
            System.out.println(mary.getName() + " is of legal age");
        } else {
            System.out.println(mary.getName() + " is underage");
        }

        Person odette = new Person("Odette", 19);

        odette.setWeight(44);
        odette.setHeight(155);

        System.out.println(odette.getName() + ", body mass index is " + odette.bodyMassIndex());

        System.out.println();

        ArrayList<Person> persons = new ArrayList<>();
        /* ArrayList <Primitive Data Type/ReferenceType> var = new ArrayList<>();
        In this example, we created an array list for the object named Person so that it can access the
        class features.
         */

        /* Two methods of creating a person object.
        Instantiation of the object Person in two lines or in the same line.
        1.
         */
        Person fevie = new Person("Fevie", 45);
        persons.add(fevie);
        //2.
        persons.add(new Person("Emerald Greenleaf Dendron", 30));
        persons.add(new Person("Mary Claire", 29));

        for (Person person : persons) {
            System.out.println(person);
        }

        Scanner scan = new Scanner(System.in);
        /*
        Adding user inputted objects to a list

        ArrayList<Person> newPersons = new ArrayList<>();

        while (true)
        {
            System.out.println("Enter a name, empty will stop: ");
            String string = scan.nextLine();

            if (string.isEmpty())
            {
                break;
            }
            System.out.println("Enter the age of the person " + string + ": ");
            int integer = scan.nextInt();

            newPersons.add(new Person(string, integer));
        }
        System.out.println();
        System.out.println("Total number of persons: " + newPersons.size());
        System.out.println("Persons: ");
        for (Person newPerson: newPersons)
        {
            System.out.println(newPerson);
        }
         */


        ArrayList<Person> newPersons2 = new ArrayList<>();
        System.out.println("Enter the person details separated by a comma, e.g. Randall,2");
        while (true)
        {
            System.out.println("Enter the details, empty will stop: ");
            String details = scan.nextLine();
            if (details.isEmpty())
            {
                break;
            }
            String[] parts = details.split(",");
            //Better version that the previous one
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            newPersons2.add(new Person(name, age));
        }
        System.out.println();
        System.out.println("Total number of persons: " + persons.size());
        System.out.println("Persons: ");

        for (Person newPerson2: newPersons2)
        {
            System.out.println(newPerson2);
        }

        System.out.println("What is the age limit? ");
        int ageLimit = scan.nextInt();

        for (Person newPerson2:  newPersons2)
        {
            if (newPerson2.getAge() >= ageLimit)
            {
                System.out.println(newPerson2);
            }
        }

    }
}
