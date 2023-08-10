package LinearSearch;

public class Algorithms
{
    public static int linearSearch(int[] array, int searched)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == searched)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] odd = {1, 3, 5, 7, 9};
        System.out.println(linearSearch(odd, 5));
    }
}
