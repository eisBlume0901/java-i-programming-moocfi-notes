package SimpleDate;

import java.util.Scanner;

public class SimpleDateMain
{
    public static void main(String[] args)
    {
        SimpleDate date = new SimpleDate(9, 9, 2001);
        Person kate = new Person("Mary Kate F. Anecito",date);
        Person fevie = new Person("Fevie B. Franco", 15,10,1977);

        System.out.println(kate); //Output would be Mary Kate F. Anecito, born on 9.9.2001
        System.out.println(fevie); //Output would be Fevie B. Franco, born on 15.10.1977

        System.out.print("Fevie is older than Kate: ");
        System.out.println(fevie.olderThan(kate));

        SimpleDate kateBirthday = new SimpleDate(9,9,2001);
        SimpleDate odetteBirthday = new SimpleDate(25,11,2003);

        System.out.println(kateBirthday + " is older than " + odetteBirthday + ": " + kateBirthday.before(odetteBirthday));

        SimpleDate fevieBirthday = new SimpleDate(10,15,1977);
        System.out.println(kateBirthday + " is younger than " + fevieBirthday + ": " + fevieBirthday.before(kateBirthday));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two words, each on its own line.");
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (first.equals(second))
        {
            System.out.println("The words were the same");
        }
        else
        {
            System.out.println("The words were not the same");
        }
        /* When two are being compared:
        Primitive variables - compares the equality of the values stored in the variables
        Reference variables - comparisons would examine the equality of the memory references
         */

        SimpleDate one = new SimpleDate(1, 1, 2000);
        SimpleDate two = new SimpleDate(1, 1,2000);
        SimpleDate three = new SimpleDate(12, 12, 2012);
        SimpleDate four = one;

        if (one.equals(one)) //equal
        {
            System.out.println("Variables one and one are equal");
        }
        else
        {
            System.out.println("Variables one and one are not equal");
        }

        if (one.equals(two)) //not equal
            //Answer is equal since we used and modify boolean.equals(Object obj) class
        {
            System.out.println("Variables one and two are equal");
        }
        else
        {
            System.out.println("Variables one and second are not equal");
        }
        /* Despite that one and two has the same values, they are different because .equals() method
        evaluated equality in terms of reference address memory than the value itself. Therefore, to
        compare the current object with any other object, create a method inside the SimpleDate class.
         */
        if (one.equals(three)) //not equal
        {
            System.out.println("Variables one and three are equal");
        }
        else
        {
            System.out.println("Variables one and three are not equal");
        }
        if (one.equals(four)) //equal
        {
            System.out.println("Variables one and four are equal");
        }
        else
        {
            System.out.println("Variables one and four are not equal");
        }

        String mKate = new String("Mary");
        String mOdette = new String("Mary");
        /* Reference variables using String objects can use .equals() method because it only evaluates
        the value inside the object not the reference address memory.
         */
        if(mKate.equals(mOdette))
        {
            System.out.println(mKate + " is equal to " + mOdette);
        }
        else
        {
            System.out.println(mKate + " is not equal to " + mOdette);
        }

        //Instantiate a primitive variable (Boolean)
        Boolean bool = Boolean.TRUE;

        //Instantiate an Object
        Object obj = Boolean.TRUE;

        if (bool.equals(obj)) //Answer is true is equal to true
        {
            System.out.println(bool + " is equal to " + obj);
        }
        else
        {
            System.out.println(bool + " is not equal to " + obj);
        }

        if (bool == obj) //Answer is true is equal to true
        {
            System.out.println(bool + " is equal to " + obj);
        }
        else
        {
            System.out.println(bool + " is not equal to " + obj);
        }
    }
}
