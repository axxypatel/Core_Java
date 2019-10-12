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
public class Problem1b {
    
    public int fibonacci_recursive(int n)  {
        if (n < 2) return n;
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }
    public int fibonacci_iterative(int n){
        if(n<2) return n;
        int fibNumb=1;
        int last=1;
        for(int i=2;i<n;i++){
            int temp=fibNumb;
            fibNumb += last;
            last = temp;
            
        }
        return fibNumb;
    }
    
}
