package Part4ReadingDAtaOfASpecificFormatFromAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class File
{
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(Paths.get("PART 4/data")))
        {
            while (scan.hasNextLine())
            {
                String line = scan.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
