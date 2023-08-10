package SimpleDate;

import java.time.LocalDate;

public class UsingLocalDatePreMadeJavaClass
{
    public static void main(String[] args)
    {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        System.out.println("today is " + day + "." + month + "." + year);
        //Output would be for example, today is 8.1.2023
    }
}
