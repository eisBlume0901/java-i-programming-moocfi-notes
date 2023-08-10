package Person.PersonForObjectsAndReferences;

public class PersonMain
{
    public static void main(String[] args)
    {
        Person mary = new Person("Mary");
        //The value of the variable is set to be a reference

        //Assigning a reference type variable copies the reference

        Person kate = mary;
        System.out.println(kate); //Output would be Mary, age 0years
        kate.growOlder();
        kate.growOlder();
        /* REMINDER:

        An object's internal state is not copied when a variable's value
        is assigned. The value of the variable kate is assigned to be the
        copy of mary's value (reference to an object)
         */

        System.out.println(mary); //Output would be Mary, age 2years
        //Reference variable and their copies are MUTABLE.

        mary = new Person("Mary Kate");
        System.out.println(mary); //Output would be Mary Kate, age 0years
        System.out.println(mary.getAge()); //Output would be 0
        /* REMINDER:

        Assigning a new argument with the same reference variable is possible and would like create
        a new object.
         */

        mary = new Person("Mary Odette");
        System.out.println(mary); //Output would be Mary Odette, age 0years


        Person odette = mary;
        System.out.println(odette); //Output would be Mary Odette, age 0years

        odette = null;
        System.out.println(odette); //Output would be null

        // odette.growOlder();
        /* NullPointerException
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Person.PersonForObjectsAndReferences.Person.growOlder()" because "odette" is null
            at Person.PersonForObjectsAndReferences.PersonMain.main(PersonMain.java:46)
         */

    }
}
