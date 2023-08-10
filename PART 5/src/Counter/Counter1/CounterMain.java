package Counter.Counter1;

public class CounterMain
{
    public static void main(String[] args)
    {
        Counter counter = new Counter(5);
        counter.modifyValue(8);
        System.out.println(counter.getValue()); //Output would be 13
        /* My first attempt is wrong that it is 13. The reason why it is 13
        is that the variable counter initiated as 5 and has been mutated to 13.
         */
    }
}
