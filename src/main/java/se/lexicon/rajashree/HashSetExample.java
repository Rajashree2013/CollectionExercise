package se.lexicon.rajashree;

import java.util.*;

public class HashSetExample {


    public static void main(String[] args) {
        qs5();
        qs6();
        qs7();
        qs8();
    }
    //5. Create a new hashset and populate it with the days of the week. Lastly, print the set out and
    //  pay attention to the order of the elements.

    public static void qs5() {
        HashSet<String> days = new HashSet<>();

        // adding element into hashset
        days.add("sunday"); // 0
        days.add("monday"); // 1
        days.add("tuesday"); // 2
        days.add("wednesday"); // 3
        days.add("thursday");//4
        days.add("friday");//5
        days.add("saturday");//6

        System.out.println("Question 5 : days of the week in Hashset: " + days);


    }

    //6. Create a new hashSet and populate it with the days of the week. Then convert the hashSet to
    //an arrayList
    public static void qs6() {
        HashSet<String> days = new HashSet<>();

        // adding element into hashset
        days.add("sunday"); // 0
        days.add("monday"); // 1
        days.add("tuesday"); // 2
        days.add("wednesday"); // 3
        days.add("thursday");//4
        days.add("friday");//5
        days.add("saturday");//6

        System.out.println("Question 6 :days of the week Hashset: " + days);

    //Then convert the hashSet to an arrayList.

        ArrayList<String> days_array
                = new ArrayList<>(days);

        System.out.println("Question 6 : Elements ofdays Arraylist are :" + days_array);

    }

    //7. Create a new hashSet and populate it with random names. Then convert the hashSet to an
   //arrayList. Lastly, manually sort the list in alphabetical order and print it out.
    //
    public static void qs7() {
        HashSet<String> countries = new HashSet<>();

        // adding element into hashset
        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");
        countries.add("Iran");
        countries.add("Sweden");

        System.out.println("countries: " + countries);

        //Then convert the hashSet to an arrayList.

        ArrayList<String> countries_array
                = new ArrayList<>(countries);

        System.out.println("Question 7 : countries_array Arraylist are :" + countries_array);


        //manually sort the list in alphabetical order and print it out.

       // Sorting HashSet using List
        List<String> obj = new ArrayList<String>(countries);
        Collections.sort(obj);

        System.out.println("HashSet elements "
                + "in sorted order "
                + "using List: "
                + obj);
    }
    /*8. Create a new hashSet and populate it with random names. Lasty, sort the names in
    alphabetical order using only a Set or a child of Set.
     */
    public static void qs8() {
        HashSet<String> countries = new HashSet<>();

        // adding element into hashset
        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");
        countries.add("Iran");
        countries.add("Sweden");

        System.out.println("HashSet before sorting : " + countries);

        // Sorting HashSet using List

        List<String> obj = new ArrayList<String>(countries);
        Collections.sort(obj);


        System.out.println("HashSet element in sorted order : " + obj);

        // Sorting HashSet using TreeSet
        TreeSet<String> sorted = new TreeSet<String>(countries);
        System.out.println("HashSet sorted using TreeSet : " + sorted);


    }
}









