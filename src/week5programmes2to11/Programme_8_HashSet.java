package week5programmes2to11;

import java.util.HashSet;

public class Programme_8_HashSet
{
    public static void main(String[] args)
    {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for (int i = 1; i <= 10; i++)
        {
            if (numbers.contains(i))
            {
                System.out.println(i + " is found in the set.");
            } else
            {
                System.out.println(i + " is not found in the set.");
            }
        }



    }
}
