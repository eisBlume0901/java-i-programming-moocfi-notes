package FileReader;

import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(Paths.get("PART 4/PART 4 MOOCFI/src/FileReader/MyFavoriteSongs")))
        {
            while (scanner.hasNextLine())
            {
                System.out.println(scanner.hasNextLine());
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
