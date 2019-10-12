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
public class Problem1a {
    Problem1a(int n){
        System.out.println(factorial(n));
    }
    public int factorial(int n)
    {
       //push(n);
       if(n==1)
           return 1;
       return n * factorial(n-1);
    }
    
 }
