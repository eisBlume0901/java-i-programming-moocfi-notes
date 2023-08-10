package Caller;

public class Example {
    public static void main(String[] args)
    {
        int number = 1; //primitive variable are immutable(unchanging)
        call(number); //that is why number is still 1 not 2

        System.out.println("Number still: " + number);
    }

    public static void call(int number)
    {
        System.out.println("Number in the beginning: " + number);
        number = number + 1;
        System.out.println("Number in the end: " + number);
    }
    /* Value of a primitive variable is stored directly in the variable.
    In this example, the variable number has a value of 1.

    The value of a reference variable is a reference to the variable's data, i.e, its
    internal state (we often declared a parameter or encapsulated instance
    variable that we borrowed).
    In this example, the parameter number for the method call is a reference
    variable.
     */
}
