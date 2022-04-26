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
          System.out.println("day of list"+days);

         days.add(4,"thursday");
         System.out.println("day of the list"+days);
    }


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
        System.out.println("Portion of the list: "+days_sublist);

    }

    }