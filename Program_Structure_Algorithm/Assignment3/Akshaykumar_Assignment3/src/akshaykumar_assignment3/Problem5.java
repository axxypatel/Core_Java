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
public class Problem5 {
       
    public void sumDigits (int sample){
        int sum=0;
        try
        {
        if(sample < 0) 
            throw new IllegalArgumentException();
        String sample_string = Integer.toString(sample);
        int str_size = sample_string.length();
        for(int i=0;i<str_size;i++){
            sum += Character.getNumericValue(sample_string.charAt(i));
        }
        System.out.println("Total Sum "+ sum);
        }
        catch(IllegalArgumentException e){
            System.out.println("Negative number");
        }
        
    }
    
    
    
}
