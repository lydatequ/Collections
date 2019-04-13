package collectionsexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.lang.String;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsExamples {

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setName("Varsity");
        Product p2 = new Product();
        p2.setName("Miss");
        Product p3 = new Product();
        p3.setName("George");
        Product p4 = new Product();
        p4.setName("Mister");
        Product p5 = new Product();
        p5.setName("Hello");

//          LinkedList <Product> myLinkedList = new LinkedList <>(); //instead of writing product inside the diamond at the end
//        ArrayList <Product> Products = new ArrayList <Product>();// is a class because we can create an object
//        List<Product> myList2 = new ArrayList(); //--> interface
//        Products.add(p1);
//        Products.add(p2);
//        Products.add(p3);
//        //Products.add(p4);
//        System.out.println(Products.size());
//        System.out.println(Products.contains(p3));
//        
//        Products.set(2,p4); // vazei sti thesi 2 toy index to p4
//        Products.add(1, p4); // prosthetei sti thesi 1 to p4 kai metakinei ta ypoloipa mia thesi dexia
//        Products.add(1, p4);
//        Products.add(1, p4);
//        
//        p1.getName(); // state the variable to get the name from the list
//        p2.getName();
//        p3.getName();
//        p4.getName();
//        System.out.println(p3); // prints me the product with all fields
//        System.out.println(p1.getName());// print the name from the list
//        
//        Products.remove(1); // delete items from a list
//        
//        Products.get(1); // me to get vlepame to index mias listas
//        
//        ArrayList <Product> Products1 = new ArrayList <Product>();
//        Products.addAll(Products1); // appends one list at the end of the other
//        
//        // print list with for - good practice
//        for (Product p: Products){ 
//            System.out.println(p);
//            
//        }
//        System.out.println("-------Before Copy-------");
//        System.out.println("list2 size = "+myList2.size());
//        System.out.println("list size = "+Products.size());
//        myList2 = Products; // swallow copy
//        System.out.println("-------After Copy-------");
//        System.out.println("list2 size = "+myList2.size());
//        System.out.println("list size = "+Products.size());
//        myList2.add(p1);
//        System.out.println("-------After add to one list-------");
//        System.out.println("list2 size = "+myList2.size());
//        System.out.println("list size = "+Products.size());
//        ArrayList <Product> newList = new ArrayList(myList2); // deep copy
//        
//        LinkedList <Product> myLinkedList = new LinkedList();
        //Sets
//        HashSet <Product> mySet = new HashSet();
//        mySet.add(p2);
//        mySet.add(p3);
//        mySet.add(p4);
//        
//        for (Product p: mySet){
//            System.out.println(p);
//        }
//        
//        mySet.add(p4); // it doesn't accept duplicates
//        
//        for(Product p: mySet){
//            System.out.println(p);
//        }
//       
//       
//       String fruit1 = "banana"; 
//       String fruit2 = "orange";  
//       String fruit3 = "apple"; 
//       String fruit4 = "lemon"; 
//        
//       
//       HashSet <String> mySet1 = new HashSet();
//       mySet1.add(fruit1);
//       mySet1.add(fruit2);
//       mySet1.add(fruit3);
//       mySet1.add(fruit4);
//       
//       for(String fruit: mySet1){
//           System.out.println(fruit);
//       }
//
//       LinkedHashSet <String> mySet2 = new LinkedHashSet();
//       mySet2.add(fruit1);
//       mySet2.add(fruit2);
//       mySet2.add(fruit3);
//       mySet2.add(fruit4);
//       
//      for(String fruit: mySet2){
//           System.out.println(fruit);
//       }
//        
//       TreeSet <String> mySet3 = new TreeSet();
//       mySet3.add(fruit1);
//       mySet3.add(fruit2);
//       mySet3.add(fruit3);
//       mySet3.add(fruit4);
//       
//       for(String fruit: mySet3){
//           System.out.println(fruit);
//       }
//       
//       ArrayList <String> myList = new ArrayList <String>();
//       myList.add(fruit1);
//       myList.add(fruit1);
//       myList.add(fruit1);
//       
//       HashSet h = new HashSet(myList); // constructor
//       
//       HashSet <String> newSet = new HashSet(myList); // deep copy
//       
//       for(String fruit:newSet){
//           System.out.println(fruit);
//       }
        HashMap<String, Integer> myMap1 = new HashMap();
        myMap1.put("Nick", 15);
        myMap1.put("Mary", 15);
        myMap1.put("John", 28);
        myMap1.put("Jack", 37);

        //prints horizontally
        System.out.println("Collection view is: " + myMap1.values());

        //prints vertically
        for (int a : myMap1.values()) {
            System.out.println(a);
        }

//        for (String name : myMap1.keySet()) {
//            int myMap = myMap1.get(name);
//            System.out.println(name + " -> " + myMap1);

        Set<String> keysOfMap = myMap1.keySet();
        
        Iterator <String> it = keysOfMap.iterator();
        
        while(it.hasNext()){
            String s = it.next();
            int age = myMap1.get(s);
            System.out.println(s + "--->" + age);
        }
        
        
        
        for(String name: keysOfMap){
            int myMap = myMap1.get(name);
            System.out.println(name + "--->"+myMap);
        }

    }
}