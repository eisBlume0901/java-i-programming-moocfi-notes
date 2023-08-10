package ProgramLogic;

import java.util.Scanner;

public class ProgramMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        while (true)
        {
            System.out.println("Points: ");
            String input = scanner.nextLine();
            if (input.equals(""))
                break;
            int score = Integer.parseInt(input);

            if (score < 0 || score > 100)
            {
                System.out.println("Impossible number.");
                continue;
            }

            register.addGradeBasedOnPoints(score);
        }
        System.out.println("");
        int grade = 5;
        while (grade >= 0)
        {
            int stars = register.numberOfGrades(grade);
            System.out.println(grade + ": ");

            while (stars > 0)
            {
                System.out.print("*");
                stars--;
            }
            System.out.println("");
            grade--;
        }
    }
}
