/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Date;

/**
 *
 * @author Akshay
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
        
    System.out.println("**********************Problem 1*************************************");
    Problem1 obj1 = new Problem1();
    obj1.problemMain();
    
    System.out.println("**********************Problem 2*************************************");
    Problem2 obj2 = new Problem2();
    obj2.iterate();
    
    System.out.println("**********************Problem 3*************************************");
    Date d1 = new Date(1993,05,19);
    Date d2 = new Date(1992,05,19);
    User obj3 = new User("Akshay",1,d1);
    User obj4 = new User("Akshay",1,d1);
    User obj5 = new User("Patel",2,d2);
    
    System.out.println("Different Object with same data: Equals- "+obj3.equals(obj4));
    System.out.println("Different Object with same data: CompareTo- "+obj3.compareTo(obj4));
    System.out.println("Different Object with same data: Hashcode- "+(obj3.hashCode() == obj4.hashCode()));
    
    System.out.println("Different Object with different data: Equals- "+obj3.equals(obj5));
    System.out.println("Different Object with different data: CompareTo- "+obj3.compareTo(obj5));
    System.out.println("Different Object with different data: Hashcode- "+(obj3.hashCode() == obj5.hashCode()));
    
    }
}
