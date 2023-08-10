package Rectangle;

public class Rectangle
{
    //instance variables - Encapsulation
    private int width;
    private int height;

    //constructor
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    //methods
    public void widen()
    {
        this.width++;
    }

    public void narrow()
    {
        if (this.width > 0)
        {
            this.width--;
        }
    }

    public int surfaceArea()
    {
        return this.width*this.height;
    }

    public String toString()
    {
        return "(" + this.width + ", " + this.height + ")";
    }
}
