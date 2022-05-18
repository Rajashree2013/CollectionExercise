package se.lexicon.rajashree;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        qs9();
        qs10();
        qs11();

    }

    /*9. Create a new hashMap of type <Integer,String> and populate it with elements containing an
id(Integer) and a car brand(String). Lastly, print out the entire hashMap.
   */

    public static void qs9() {
        // Create a HashMap object called car
        HashMap<Integer, String> carbrand = new HashMap<Integer, String>();

        // Add keys and values (Name, ID)
        carbrand.put(001, "AUDI");
        carbrand.put(002, "BMW");
        carbrand.put(003, "AUDI");
        carbrand.put(004, "VM");
        carbrand.put(005, "TESLA");

        for (Integer i : carbrand.keySet()) {
            System.out.println(" question no 9 key: " + i + " value: " + carbrand.get(i));
        }
    }
/*
11.  Create a new hashMap of type <Integer,String> and populate it with elements containing an
id(Integer) and a car brand(String). Lastly, print out only the values.
 */
    public static void qs11() {
        // Create a HashMap object called car
        HashMap<Integer, String> carbrand = new HashMap<Integer, String>();

        // Add keys and values ( ID,name)
        carbrand.put(001, "AUDI");
        carbrand.put(002, "BMW");
        carbrand.put(003, "AUDI");
        carbrand.put(004, "TOYOTA");
        carbrand.put(005, " TESLA");

        for (String i : carbrand.values()) {
            System.out.println(" question no 10 valu : " + i);
        }
    }
/*
10.  Create a new hashMap of type <Integer,String> and populate it with elements containing an
id(Integer) and a car brand(String). Lastly, print out only the keys.
 */

    public static void qs10() {
        // Create a HashMap object called car
        HashMap<Integer, String> carbrand = new HashMap<Integer, String>();


        // Add keys and values ( ID,name)
        carbrand.put(001, "AUDI");
        carbrand.put(002, "BMW");
        carbrand.put(003, "AUDI");
        carbrand.put(004, "TOYOTA");
        carbrand.put(005, " TESLA");


        for (Integer i : carbrand.keySet()) {
            System.out.println(" question no 11 key : " + i);


            //
        }
    }


}






