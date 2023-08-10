package Part4ReadingFromAFile;

import java.nio.file.Paths;
import java.util.Scanner;

public class File
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(Paths.get("PART 4/PART 4 MOOCFI/src/Part4ReadingFromAFile/file.txt")))
        {
            while (scanner.hasNextLine())
            {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
