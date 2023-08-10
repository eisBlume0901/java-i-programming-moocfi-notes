package ObjectsInAnInstanceVariableList;

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
    public boolean isAllowed(Person person)
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
        String onTheRide = "";
        for (Person person: riding)
        {
            onTheRide = onTheRide + person.getName() + "\n";
        }

        return this.name + ", minimum height requirement: " + this.minimumHeight +
                ", visitors: " + this.visitors + "\n" +
                "riding:\n" + onTheRide;
    }
}
