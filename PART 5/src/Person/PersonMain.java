package Person;

import java.util.Scanner;

public class PersonMain
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = reader.nextLine();
        System.out.println("What's your age? ");
        int age = reader.nextInt();
        System.out.println("What's your weight? ");
        double weight = reader.nextDouble();
        System.out.println("What's your height? ");
        double height = reader.nextDouble();

        Person person = new Person(name, age, weight, height);
        System.out.println(person);
    }
}
