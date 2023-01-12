import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println( "welcome back Team");
        List<String> items = new ArrayList<>();
        items.add("rock");
        items.add("weird rock");
        items.add("smooth rock");
        items.add("not rock");
        Thread.sleep(500);
        System.out.println(" Everthing has been downloaded");
        Thread.sleep(500);
        System.out.println("Error: a non-rock has been detected in items");
        items.remove(items.size()-1);
        Thread.sleep(500);
        System.out.println(items);
        System.out.println("perfect!!");
        Thread.sleep(1000);
        Map<String,String>  fossils = new HashMap<>();
        fossils.put("Bird Fossil" ,"The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil" ,"The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil" ,"he tooth from an unknown fossil");
        System.out.println(fossils);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which of the fossils would you like to learn more about? (Bird Fossil, Fish Fossil, or Tooth Fossil)");
        String input=scanner.nextLine();


        for (String el: fossils.keySet()
             ) {
            if( input.equals(el) )
            System.out.println(el + "=" + fossils.get(el));
        }
//        for (Map.Entry<String, String> set :
//                fossils.entrySet()) {
//
//            // Printing all elements of a Map
//            System.out.println(set.getKey() + " = "
//                    + set.getValue());
//        }

        Thread.sleep(700);

        Set<String> supplies= new HashSet<>();
        supplies.add("Bread");
        supplies.add("Water");
        supplies.add("Rice");

        System.out.println("Supplies Before Expedition" + supplies);

        supplies.remove(0);
        System.out.println("Supplies Before Expedition" + supplies);


    }
}
