package com.company.Hashset;
import java.util.*;
import java.util.Iterator;
public class BookSet {
    public static void main(String[] args) {
        HashSet<Book> set= new HashSet<> ();

        Book b1=new Book(1,"Core Java",34.23);
        Book b2=new Book(2,"Unity in Action",40.00);
        Book b3=new Book(3,"Js for front engineer",23.73);
        Book b4=new Book(4,"How to learn Java",13.53);
        set.add(b4);
        set.add(b3);
        set.add(b2);
        set.add(b1);
        System.out.println ("Book ID \t Name of Book \t\t Price ");
        for(Book b:set) {

            System.out.println (b.id + "\t \t" + b.title + "\t \t" + b.price);


        }
        System.out.println ("************************************************************");
        System.out.println ("After removing b3:");
        System.out.println ("************************************************************");
        set.remove(b3);
        System.out.println ("Book ID \t Name of Book \t\t Price ");

        for(Book b:set) {

            System.out.println (b.id + "\t " + b.title + "\t\t " + b.price);
        }
           /* System.out.println ("**************************************");
            {Iterator<Book>i =set.iterator (Book);
            while(i.hasNext()) {
                System.out.println (i.next (Book));
            }*/
        }
    }
