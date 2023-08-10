package Part4Counter;

public class Counter
{
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public void changeValue(int modifier)
    {
        this.value = this.value - modifier;
    }

    public int getValue()
    {
        return value;
    }
}

class CounterTest
{
    public static void main(String[] args)
    {
        Counter counter = new Counter(7);
        counter.changeValue(5);
        System.out.println(counter.getValue());
    }
}
