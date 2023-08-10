package Counter.Counter2;

public class CounterMain
{
    public static void main(String[] args)
    {
        Counter counter = new Counter();
        counter.increase();
        counter.increase();

        System.out.println(counter); //Output should be 2

        Counter clone = counter.clone();

        System.out.println(counter); //Output would be still 2
        System.out.println(clone); //Output should be 2 since it is a copy

        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase();

        System.out.println(counter); //Output should be 6
        System.out.println(clone); //Output should be and would be still 2
        /* The values contained by the clone and the cloned object are the
        same. However, they are two different objects, so increasing the value
        of one counter does not affect the value of teh other in any way.
         */
    }
}
