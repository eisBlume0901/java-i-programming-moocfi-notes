package ObjectAsAMethodParameter;

public class AmusementParkRide
{
    //encapsulate instance variable
    private String name;
    private int lowestHeight;
    private int visitors;

    //Constructor
    public AmusementParkRide(String name, int lowestHeight)
    {
        this.name = name;
        this.lowestHeight = lowestHeight;
    }

    //Method
    public boolean allowedToRide(Person person)
    {
        this.visitors++;
        return person.getHeight() < this.lowestHeight;
    }
    @Override
    public String toString() {
        return this.name + ", minimum height: " + this.lowestHeight + ", visitors: " + this.visitors;
    }
}
