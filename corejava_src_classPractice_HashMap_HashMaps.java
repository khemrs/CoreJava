package classPractice.HashMap;
import java.util.*;
public class HashMaps {
public static void main (String []args){


    HashMap<Integer, String> hp = new HashMap<> ();


        hp. put(0,"Don");

        hp.put(1,"Sandy");

        hp.put(2,"John");

        hp.put(3,"Daniel");

        hp.put(3,"Danny"); //Daniel will be replaced..

        hp.put(null,null);

        hp.put(null,"Will Smith");

        System.out.println(hp.toString());
for (Map.Entry mapElement:hp.entrySet()){
    Object key =mapElement.getKey();
 //   String value =(String mapElement.getValue)
}

/*
   Iterator iterator=contents.iterator();
        while (iterator.hasNext()){
            Map.Entry m1=(Map.Entry)iterator.next();
            System.out.println(m1.getKey() +"::"+ m1.getValue());
        }
        //Using for Loop
        for(Map.Entry mapElement:hp.entrySet()){
            Object key= mapElement.getKey();  // as Null value, it gives error for int, so object
            String value= (String) mapElement.getValue();
            System.out.println(key + " " + value);
        }
//        //Using java 8, lambda function..
        System.out.println("Using Lambda");
        hp.forEach((k,v)-> System.out.println(k+ "::::"+ v));
 */
   // System.out.println (key +""+value);
}}