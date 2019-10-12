/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akshaykumar_assignment1;

/**
 *
 * @author Akshay
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Problem6 obj6 = new Problem6("It was the best of time");
        System.out.println("*******************Question 6 ************************");
        while( ! obj6.IsEmpty()){
            System.out.println(obj6.pop());
        }
        System.out.println("*******************Question 7 ************************");
        
        Problem7 obj7 = new Problem7();
        obj7.push("Name1", 31);
        obj7.push("Name2", 24);
        obj7.push("Name3", 10);
        obj7.push("Name4", 44);
        obj7.push("Name5", 81);
        while(! obj7.isEmpty()){
            System.out.println(obj7.pop());
        }       
        
        
        
        System.out.println("*******************Question 8 ************************");
        
        Problem8 obj8 = new Problem8(5);
        obj8.push("Name1", 31);
        obj8.push("Name2", 24);
        obj8.push("Name3", 10);
        obj8.push("Name4", 44);
        obj8.push("Name5", 81);
        while(! obj8.IsEmpty()){
            System.out.println(obj8.pop());
        }       
        
        
        
        System.out.println("*******************Question 9 ************************");
        
        Problem9 obj9 = new Problem9();
        obj9.push("Name1", 31);
        obj9.push("Name2", 24);
        obj9.push("Name3", 10);
        obj9.push("Name4", 44);
        obj9.push("Name5", 81);
        while(! obj9.IsEmpty()){
            System.out.println(obj9.pop());
        }       
        
        
       
    }
    
}
