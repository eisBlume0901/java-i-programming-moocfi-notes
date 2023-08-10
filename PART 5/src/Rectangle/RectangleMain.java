package Rectangle;

import Rectangle.Rectangle;

public class RectangleMain
{
    public static void main(String[] args)
    {
        Rectangle first = new Rectangle(40,80);
        Rectangle rectangle = new Rectangle(10,10);

        System.out.println(first); //Output would be (40, 80)
        System.out.println(rectangle); //Output would be (10, 10)

        first.narrow();
        System.out.println(first); //Updated output now would be (39, 80)
        System.out.println(first.surfaceArea()); //Updated surface area would be 3120
    }
}
