import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.println("Team: ");
        String teamName = "mary";
        int count = 0;
        int gamesPlayed = 0;
        try (Scanner scanner = new Scanner(Paths.get("data")))
        {
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String team1 = parts[0];
                int score1 = Integer.parseInt(parts[1]);

                for (int i = 0; i <= parts.length - 1; i++)
                {

                    if (parts[i].equals(teamName))
                    {
                        count++;
                    }

                }
            }

        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(count);
    }
}