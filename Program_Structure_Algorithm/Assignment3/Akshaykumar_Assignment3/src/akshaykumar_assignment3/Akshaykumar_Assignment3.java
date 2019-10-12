/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akshaykumar_assignment3;

/**
 *
 * @author Akshay
 */
public class Akshaykumar_Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***************** Problem 5***************************");
        Problem5 obj1 = new Problem5();
        obj1.sumDigits(-26497);
        obj1.sumDigits(26497);
        
        System.out.println("***************** Problem 6***************************");
        Problem6 obj2 = new Problem6();
        System.out.println("Total Number "+ obj2.countStringBinary(5, 1));
        
        System.out.println("***************** Problem 7***************************");
        Problem7 obj3 = new Problem7("A*B/C+(D+E-(F*(G/H)))");
        
        System.out.println("***************** Problem 4***************************");
        Problem4 obj4 = new Problem4();
        obj4.execute();
        
        System.out.println("***************** Problem 1A***************************");
        Problem1a obj5 = new Problem1a(5);
        
        System.out.println("***************** Problem 1B ***************************");
        Problem1b obj6 = new Problem1b();
        System.out.println(obj6.fibonacci_recursive(5));
        System.out.println(obj6.fibonacci_iterative(7));
        
        System.out.println("***************** Problem 1C ***************************");
        Problem1c obj7 = new Problem1c();
        obj7.tHanoi(3, 's', 'd', 'a');
    }
    
}
