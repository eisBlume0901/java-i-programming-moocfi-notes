package CalculatingASumFromObjectsOnAList;

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
            return -1;
        }

        int sumOfHeights = 0;
        for (Person per: riding)
        {
            sumOfHeights += per.getHeight();
        }
        return 1.0 * sumOfHeights / riding.size();
    }
}

