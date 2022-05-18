package se.lexicon.rajashree;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {

    public static void main(String[] args) {
        qs1();
        qs2();
        qs3();
        qs4();
    }

    //1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
    public static void qs1() {

        // creating arraylist
        ArrayList<String> days = new ArrayList<>();
        // Adding object in arraylist
        days.add("sunday"); // 0
        days.add("monday"); // 1
        days.add("tuesday"); // 2
        days.add("wednesday"); // 3
        days.add("thursday");//4
        days.add("friday");//5
        days.add("saturday");//6

        System.out.println("day of list: " + days);

    }

    //2. Create a new list and populate it with the days of the week. Lastly, iterate through the list
    //and print out each element separately.
    //
    public static void qs2() {

        ArrayList<String> days = new ArrayList<>();
        // Adding object in arraylist
        days.add("sunday"); // 0
        days.add("monday"); // 1
        days.add("tuesday"); // 2
        days.add("wednesday"); // 3
        days.add("thursday");//4
        days.add("friday");//5
        days.add("saturday");//6


        System.out.println("day of list: " + days);

        Iterator<String> iterator = days.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

    }
    // 3. Create a new list and populate it with the days of the week excluding THURSDAY. Lastly,
    //insert the weekday THURSDAY into the right position in the list.

    public static void qs3() {

        ArrayList<String> days = new ArrayList<>();
        // Adding object in arraylist
        days.add("sunday"); // 0
        days.add("monday"); // 1
        days.add("tuesday"); // 2
        days.add("wednesday"); // 3
        days.add("thursday");//4
        days.add("friday");//5
        days.add("saturday");//6


        System.out.println("day of list: " + days);

        days.remove("thursday");
        System.out.println("day of list" + days);

        days.add(4, "thursday");
        System.out.println("day of the list" + days);
    }

    //4. Create a new list and populate it with the days of the week. Then create a new list out of the
    //first three elements of the first list using a subList.

    public static void qs4() {

        ArrayList<String> days = new ArrayList<>();
        // Adding object in arraylist
        days.add("sunday"); // 0
        days.add("monday"); // 1
        days.add("tuesday"); // 2
        days.add("wednesday"); // 3
        days.add("thursday");//4
        days.add("friday");//5
        days.add("saturday");//6


        System.out.println("day of list: " + days);

        ArrayList<String> days_sublist = new ArrayList<String>(days.subList(0, 3));
        System.out.println("Portion of the list: " + days_sublist);

    }

}