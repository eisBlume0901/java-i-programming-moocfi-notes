package Counter.Counter1;

public class Counter
{
    //encapsulate instance variable
    private int value;

    //Constructor
    public Counter(int value)
    {
        this.value = value;
    }

    public void modifyValue(int modifier)
    {
        this.value = this.value + modifier;
    }

    //Getter

    public int getValue()
    {
        return value;
    }
}
