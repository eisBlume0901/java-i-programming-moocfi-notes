package ProgramLogic;
//Procedural Programming
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramProceduralProgramming
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        while (true)
        {
            System.out.println("Points: ");
            String input = scanner.nextLine();
            if (input.equals(""))
            {
                break;
            }

            int score = Integer.parseInt(input);

            if (score < 0 || score > 100)
            {
                System.out.println("Impossible number.");
                continue;
            }

            int grade = 0;
            if (score < 50)
            {
                grade = 0;
            }
            else if (score < 60)
            {
                grade = 1;
            }
            else if (score < 70)
            {
                grade = 2;
            }
            else if (score < 80)
            {
                grade = 3;
            }
            else if (score < 90)
            {
                grade = 4;
            }
            else
            {
                grade = 5;
            }

            grades.add(grade);
        }

        System.out.println("");
        int grade = 5;
        while (grade >= 0)
        {
            int stars = 0;
            for (int received: grades)
            {
                if (received == grade)
                {
                    stars++;
                }
            }

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
