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
public class Problem6 {
    
    public int countStringBinary(int n,int last){
        if(n==0)
            return 0;
        if(n==1)
            return (last==1)?1:2;
        if(last == 0)
            return countStringBinary(n-1, 0)+countStringBinary(n-1, 1);
        else
            return countStringBinary(n-1, 0);
        
    }
    
}
