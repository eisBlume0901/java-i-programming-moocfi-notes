package Person.NewPerson;

public class PersonMain
{
    public static void main(String[] args)
    {
        Person first = new Person("First");

        System.out.println(first);
        /* Output would be First(1970)

        The value returned by the Person class constructor is copied as its value.
        public Person(String name)
        {
            this.name = name;
            this.birthYear = 1970;
        }
        The constructor returns a reference. Once the row has been executed (line 9), the program's state is
        the following
        1. a Person object has been created in memory at line 7
        2. the first variable defined in the main method contains a reference to it.

        Then, we print the value of the variable first. The method call System.out.println searches for the
        toString method on the reference variable that has given to it as the parameter.
        @Override
        public String toString()
        {
            return this.name + "(" + this.birthYear + ")";
        }

        The value of the name variable is that the object is "First", and the value of the birthYear
        variable is 1970.
         */
        youthen(first);
        System.out.println(first);
        /* Output would be First(1971)

        Line 34 calls the youthen method, to which we pass the variable first as an argument. When the
        method youthen is called, the value of the parameter varibale is copied to be used by the youthen
        method.

        As the variable first is a reference type, the reference that was created earlier at line 7 is copied
        for the method's use.

        At the end of the method execution, the situation is follows - the method increments the birth year
        of the object it receives as a parameter by one.

        When the execution of the method makeYounger ends, we return to the main method. The information
        related to the execution of the makeYounger disappears from the call stack.

        Once we've returned from the method call, we once again print the value of the variable first.

        The object referenced by the variable first has been MUTATED during the youthen method call: the
        birthYear variable of the object has been incremented by one. The final value printed is "First (1971)"
         */
        Person second = first;
        youthen(second);
        System.out.println(first); //Output would be First(1972)
        /* This is also the same. The object referenced by the variable first despite that we assigned it to a
        different variable name still MUTATED it

         */
    }
    public static void youthen(Person person)
    {
        person.setBirthYear(person.getBirthYear() + 1);
    }
}
