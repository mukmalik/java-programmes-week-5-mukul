package week5programmes2to11;

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6_RetrieveArraylistAtGivenIndex
{
    public static void main(String[] args)
    {
        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINGLE");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("BITTER_GOURD");
        System.out.println(vegetableList);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an index number : ");
        int index = scan.nextInt();
        if (index < vegetableList.size())
        {
            System.out.println(vegetableList.get(index));
        } else
        {
            System.out.println("Invalid Index!!");
        }
        scan.close();
    }


}
