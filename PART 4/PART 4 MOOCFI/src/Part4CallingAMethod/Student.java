package Part4CallingAMethod;

public class Student
{
    public static void main(String[] args)
    {
        Student matt = new Student();
        matt.play();
    }
    private int credits;

    public Student()
    {
        this.credits = 0;
    }

    public void play()
    {
        this.credits = this.credits - 8;
    }


}
