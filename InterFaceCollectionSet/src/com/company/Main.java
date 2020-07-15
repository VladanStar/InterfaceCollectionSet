package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // kreiranje seta set1
        java.util.Set<String> set1 = new java.util.HashSet<>();

        // dodavanje stringova u set1

        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        System.out.println("set1 is " + set1);
        System.out.println(set1.size() + "elements in set1");

        // brisanje stringova iz set1
        set1.remove("London");
        System.out.println("\n set1 is"+ set1);
        System.out.println(set1.size() + "elements in set");

        // kreiranje seta set2
        java.util.Set<String> set2 = new java.util.HashSet<>();
        // dodavanje stringova u set2
        set2.add("London");
        set2.add("Shangai");
        set2.add("Paris");
        set2.add("Bukuresht");
        System.out.println("\n set2 is" + set2);
        System.out.println(set2.size() + " elements in set2");
        System.out.println("\n is Thaipei in set2" + set2.contains("Taipei"));
        System.out.println();
        set1.addAll(set2);
        System.out.println("\n After adding set2 to set1, set1 is " + set1);

        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is:" + set1);
        set1.retainAll(set2);

        System.out.println("After removing common elements in set2"+ "from set1, set1 is " + set1);



    }
}
