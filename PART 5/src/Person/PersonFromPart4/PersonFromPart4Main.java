package Person.PersonFromPart4;


public class PersonFromPart4Main
{
    public static void main(String[] args)
    {
        PersonFromPart4 paul = new PersonFromPart4("Paul", 24);
        PersonFromPart4 ada = new PersonFromPart4("Ada");

        System.out.println(paul); //Output would be Paul is 24 years old, their BMI is NaN
        System.out.println(ada); //Output would be Ada is 0 years old, their BMI is NaN

        paul.growOlder();
        System.out.println(paul); //Output would be 25 years old

        paul.growOlder(10);
        System.out.println(paul); //Output would be 35 years old
    }
}
