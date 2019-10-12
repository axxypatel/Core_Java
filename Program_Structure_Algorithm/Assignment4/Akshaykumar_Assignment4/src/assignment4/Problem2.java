/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author Akshay
 */
public class Problem2 {
    
    public void iterate()
    {
        
        for(int i=0;i<=150000;i++)
        {
            String str = randomGenerate(400);
            String revStrBuid= stringBuilder(str);            
            String rev=stringReverse(str);
        }
        System.out.println("Random generation of string is done");
    }
    public String randomGenerate(int n)
    {
         String alphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create n size StringBuffer  
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) {             
            int index = (int)(alphaString.length() * Math.random()); 
            sb.append(alphaString.charAt(index)); 
        } 
  
        return sb.toString();
    }
    
    //Reverse the string
    public String stringReverse(String s)
    {
        char[] temp = s.toCharArray();
        //System.out.println(temp.length);
                
        String reverseString="";
         for (int i = temp.length-1;i >= 0; i--){
             reverseString += temp[i];
         }
        return reverseString;
    }
    
    //Reverse the string using StringBuilder
    public String stringBuilder(String s)
    {        
        return new StringBuilder(s).reverse().toString();
    }
    
}
