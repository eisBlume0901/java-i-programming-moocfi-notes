package ObjectsInAnInstanceVariableList;

public class Main
{
    public static void main(String[] args)
    {
        Person mary = new Person("Mary");
        mary.setHeight(160);
        mary.setWeight(52);

        Person eve = new Person("Eve");
        eve.setHeight(187);
        eve.setWeight(60);

        AmusementParkRide rollerCoaster = new AmusementParkRide("RollerCoaster",161);
        System.out.println(rollerCoaster);

        if (rollerCoaster.isAllowed(mary))
        {
            System.out.println(mary.getName() + " is allowed on the ride");
        }
        else
        {
            System.out.println(mary.getName() + " is not allowed on the ride");
        }

        if (rollerCoaster.isAllowed(eve))
        {
            System.out.println(eve.getName() + " is allowed on the ride");
        }
        else
        {
            System.out.println(eve.getName() + " is not allowed on the ride");
        }

        System.out.println(rollerCoaster);
    }
}
