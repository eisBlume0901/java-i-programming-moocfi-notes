package IntroductionToTesting;
/* Unit Testing refers to the testing of individual components in the source
code, such as classes, and their provided methods. The writing of tests reveals
whether each class and method observes or deviates from the guideline of each
method and class having a single, clear responsibility.
 */
public class Calculator
{
    //Encapsulate instance variable
    private int value;
    //Constructor
    public Calculator()
    {
        this.value = 0;
    }
    //Methods
    public void add(int number)
    {
        this.value += number;
    }
    public void subtract(int number)
    {
        this.value -= number;
    }
    public int getValue()
    {
        return this.value;
    }

}
