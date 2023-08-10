package ObjectAsAMethodParameter;

public class Main
{
    public static void main(String[] args)
    {
        Person kate = new Person("Kate");
        kate.setHeight(175);

        Person odette = new Person("Odette");
        odette.setHeight(155);

        AmusementParkRide rollerCoaster = new AmusementParkRide("Roller Coaster", 160);

        if (rollerCoaster.allowedToRide(kate))
        {
            System.out.println(kate.getName() + " may enter the ride");
        }
        else
        {
            System.out.println(kate.getName() + " may not enter the ride");
        }

        if (rollerCoaster.allowedToRide(odette))
        {
            System.out.println(odette.getName() + " may enter the ride");
        }
        else
        {
            System.out.println(odette.getName() + " may not enter the ride");
        }

        System.out.println(rollerCoaster);

        /* Output would be:

        Kate may not enter the ride
        Odette may enter the ride
        Roller Coaster, minimum height: 160, visitors: 2

         */
    }
}
