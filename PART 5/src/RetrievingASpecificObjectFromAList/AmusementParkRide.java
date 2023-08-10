package RetrievingASpecificObjectFromAList;

import java.util.ArrayList;

public class AmusementParkRide
{
    //Encapsulate instance variables
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;
    /* ArrayList can contain objects other than strings as long
    as the type of objects in the ArrayList is specified when
    defining the list.
     */

    //Constructors
    public AmusementParkRide(String name, int minimumHeight)
    {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    //Methods
    public boolean isAllowedOn(Person person)
    {
        if (person.getHeight() < this.minimumHeight)
        {
            return false;
        }
        this.visitors++;
        this.riding.add(person);
        return true;
    }

    @Override
    public String toString()
    {
        String printOutput = this.name + ", minimum height requirement: "
                + this.minimumHeight + ", visitors: " + this.visitors + "\n";

        if (riding.isEmpty())
        {
            return printOutput + " no one is on the ride.";
        }

        String peopleOnRide = "";

        for (Person person : riding)
        {
            peopleOnRide += person.getName() + "\n";
        }

        return printOutput + "\n" + "on the ride:\n" + peopleOnRide;
    }

    public void removeEveryoneOnRide()
    {
        this.riding.clear();
    }

    public double averageHeightOfPeopleOnRide()
    {
        if (riding.isEmpty())
        {
            return 0.0;
        }

        int sumOfHeights = 0;
        for (Person per: riding)
        {
            sumOfHeights += per.getHeight();
        }
        return 1.0 * sumOfHeights / riding.size();
    }

    public Person getTallest()
    {
        if (this.riding.isEmpty())
        {
            return null;
        }
        /*
        Create an object reference variable for the object to be returned
        since we used the Person class as an object and instance variable
        The returnObject variable is initialized to this.riding.get(0)
        by which it's value would be over ride
         */
        Person returnObject = this.riding.get(0);
        /*
        Terms to remember:
        Declaration - process of storing data into an object

        Declaration of instance variables
        For primitive data types:
        int a = 0;
        String name = "Kate";
        double b = 9;

        Declaration of state of an object
        For reference variable:
        Person kate = new Person() - This is instantiation
        Person returnObject = this.riding.get(0); - This is declaration
         */

        for (Person person: this.riding)
        {
            //Compare to get the tallest
            if (returnObject.getHeight() < person.getHeight())
            {
                returnObject = person;
            }
        }
        return returnObject;
    }
}
