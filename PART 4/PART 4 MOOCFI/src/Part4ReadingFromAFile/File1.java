package Part4ReadingFromAFile;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class File1
{
    public static void main(String[] args)
    {


        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("loveletter")))
        {
            while(scanner.hasNextLine())
            {
                lines.add(scanner.nextLine());
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(lines);
        System.out.println("Total lines: " + lines.size());

    }

}
