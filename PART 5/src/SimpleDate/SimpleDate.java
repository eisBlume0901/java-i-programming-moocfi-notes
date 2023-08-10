package SimpleDate;

public class SimpleDate
{
    //Encapsulate instance variables
    private int day;
    private int month;
    private int year;

    //Constructor
    public SimpleDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getters
    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    //Methods
    public boolean before(SimpleDate compared)
    {
        //Compare years
        //Higher value means younger
        if (this.year < compared.year)
        {
            return true;
        }

        if (this.year > compared.year)
        {
            return false;
        }

        //Compare months
        if (this.month < compared.month)
        {
            return true;
        }

        if (this.month > compared.month)
        {
            return false;
        }

        //Compare days
        if (this.day < compared.day)
        {
            return true;
        }
        return false;
        /*
        no need to put this:
        if (this.day > compared.day)
        {
            return false
        }
        since we have to return a value that is not under a block of code
        (if statements)
         */

    }
    //Boolean equals is a Java class
    public boolean equals(Object compared)
    {
        //If the variables are located in the same position, they are equal
        if (this == compared)
        {
            return true;
        }
        //If the type of compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof  SimpleDate))
        {
            return false;
        }

        //convert the Object compared object into a SimpleDate type object called
        //comparedSimpleDate

        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        //If the values of the object variables are the same, the objects are equal
        if (this.day == comparedSimpleDate.day &&
                this.month == comparedSimpleDate.month &&
                this.year == comparedSimpleDate.year)
        {
            return true;
        }

        //Otherwise the objects are not equal
        return false;

    }
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
