package TimeMachine;

public class TimeMachine
{
    //encapsulate constructor
    private Person traveler;

    //Constructor
    public TimeMachine(Person person)
    {
        this.traveler = person;
    }
    //Method
    public void travelInTime(int years)
    {
        this.traveler.setYear(this.traveler.getYear() + years);
    }

    public static void main(String[] args)
    {
        Person lorraine = new Person();
        TimeMachine tardis = new TimeMachine(lorraine);
        tardis.travelInTime(6);
        System.out.println(lorraine.getYear());
        /* Even we copy the object, it is MUTABLE. Thus, the output is
        2002
         */
    }
}
