package Counter;

public class CounterMain
{
    public static void main(String[] args)
    {
        Counter counter = new Counter(1);
        counter.increaseValue();
        System.out.println(counter.getValue()); //Output would be 2

        counter.increaseValue(2);
        System.out.println(counter.getValue()); //Output would be 4
    }
}
