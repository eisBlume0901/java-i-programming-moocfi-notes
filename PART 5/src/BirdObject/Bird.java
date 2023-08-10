package BirdObject;

import java.util.ArrayList;

public class Bird
{
    //Encapsulate instance variables
    private String name;

    //Constructor
    public Bird(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Bird))
        {
            return false;
        }
        Bird objObject = (Bird) obj;

        return this.name.equals(objObject.name);
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}

class BirdMain
{
    public static void main(String[] args)
    {
        Bird red = new Bird("Red");
        System.out.println(red);

        Bird chuck = new Bird("Chuck");
        System.out.println(chuck);

        if (red.equals(chuck))
        {
            System.out.println(red + " equals " + chuck);
        }
        else
        {
            System.out.println(red + " is not equals to " + chuck);
        }

        ArrayList<Bird> birds = new ArrayList<>();
        Bird blue = new Bird("blue");

        if (birds.contains(blue))
        {
            System.out.println("Blue is on list.");
        }
        else //Output is Blue is not on the list
        {
            System.out.println("Blue is not on the list.");
        }

        birds.add(blue);

        if (birds.contains(blue)) //Output is Blue is now on the list
        {
            System.out.println("Blue is now on the list.");
        }
        else
        {
            System.out.println("Blue is still not on the list.");
        }

        Bird newBlue = new Bird("blue");
        if (newBlue.equals(blue)) //Output is newBlue is equals blue
        {
            System.out.println("newBlue is equals blue");
        }
    }
}
