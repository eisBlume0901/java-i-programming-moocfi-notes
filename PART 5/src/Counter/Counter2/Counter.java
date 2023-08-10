package Counter.Counter2;
//Using Object as a method's return value
public class Counter
{
    //Encapsulate instance variables
    private int value;

    //Constructor overload
    public Counter()
    {
        this(0);
    }

    public Counter(int initialValue)
    {
        this.value = initialValue;
    }

    //Methods
    public void increase()
    {
        this.value++;
    }

    @Override
    public String toString() {
        return "value: " + value;
    }

    public Counter clone()
    {
        Counter clone = new Counter(this.value);

        return clone;
    }
}
