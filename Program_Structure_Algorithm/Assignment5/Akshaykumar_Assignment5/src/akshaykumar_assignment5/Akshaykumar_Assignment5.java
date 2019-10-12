/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akshaykumar_assignment5;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author Akshay
 */
public class Akshaykumar_Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("*********************************Problem 1*****************************************");
        Problem1 arrayQueue = new Problem1();
        int tem[] = {7, 38, 3, 9, 82, 10, 31, 24};
        for(int i=0;i<tem.length;i++)
        {
            arrayQueue.enQueue(tem[i]);
        }
        System.out.println(arrayQueue.toString());
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        arrayQueue.deQueue();
        System.out.println(arrayQueue.toString());
        arrayQueue.enQueue(11);
        arrayQueue.enQueue(12);
        System.out.println(arrayQueue.toString());
        for(int i=0;i<tem.length;i++)
        {
            arrayQueue.deQueue();
        }
        System.out.println(arrayQueue.toString());
        
        System.out.println("*********************************Problem 3*****************************************");
        double[] arry = {54,26,93,17,77,31,44,55,20};
        Problem3 obj = new Problem3(arry);
        System.out.println();
        System.out.println("*********************************Problem 4*****************************************");
        double[] arry1 = {54,26,93,17,77,31,44,55,20};
        Problem4 obj1 = new Problem4(arry1);
        
        System.out.println("*********************************Problem 5*****************************************");
        Problem5 obj3 = new Problem5();
            
    }
    
    
    
    
}
