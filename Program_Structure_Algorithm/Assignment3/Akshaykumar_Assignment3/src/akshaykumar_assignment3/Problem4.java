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
public class Problem4 {
    
    public void execute() {
      String str = new String("Hello to the World");
      double sum = 0;
      int str_size = str.length();
      for(int i=0;i<str_size;i++){
          sum += ((int)str.charAt(i)) * (Math.pow(31, (str_size-1-i)));
      }
        System.out.println(String.format("%.3f",sum));
   }
    
}
