package Counter;

public class Counter
{
    //Encapsulate instance variables
    private int value;

    //Constructor
    public Counter(int value)
    {
        this.value = value;
    }

    //Method overloading
    public void increaseValue()
    {
        this.value++;
    }

    public void increaseValue(int number)
    {
        this.value = this.value + number;
    }

    public int getValue()
    {
        return value;
    }

}
