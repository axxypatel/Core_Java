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
public class Problem5 {
    double[] imageArray;
    Problem5(){
        this.imageArray = bufferImageLoad();
        printArray(imageArray);
        imageSorting(imageArray);
    }
    public void printArray(double[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public void imageSorting(double[] I){
        double[] arr=I.clone();
        long s_startTime = System.nanoTime(); 
        Problem4 mergeSortObj = new Problem4(arr);      
        mergeSortObj.mergesort(arr, 0, arr.length-1);
        long s_endTime = System.nanoTime(); 
        System.out.println("");
        System.out.println("Time complexity of Merge Sort :" + ((s_endTime - s_startTime) / 1000000) + "ms");
        
        arr=I.clone();
        s_startTime = System.nanoTime();
        QuickSort quickSortObj = new QuickSort();
        quickSortObj.quickSortInDescendingOrder(arr,0,arr.length-1);
        s_endTime = System.nanoTime();    
        System.out.println("");
        System.out.println("Time complexity of Quick Sort :" + ((s_endTime - s_startTime) / 1000000) + "ms");
        
        arr=I.clone();
        s_startTime = System.nanoTime();
        heapSort heapSortObj = new heapSort();
        heapSortObj.heapsort(arr);
        s_endTime = System.nanoTime();    
        System.out.println("");
        System.out.println("Time complexity of Heap Sort :" + ((s_endTime - s_startTime) / 1000000) + "ms");
    }
    public double[] bufferImageLoad() {
        try {

            BufferedImage image;
            int width;
            int height;
            double[] I;  
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("Boston.jpeg"));
            
            height = image.getHeight();
            width = image.getWidth();
            System.out.println(height+" "+width);
            I = new double[height * width];
            int count = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {                    
                    Color c = new Color(image.getRGB(j, i));                    
                    int red = c.getRed();
                    int green = c.getGreen();
                    int blue = c.getBlue();
                    I[count] = (0.2989 * red) + (0.5870 * green) + (0.1140 * blue);                    
                    count++;
                }                
            }
            return I;

        } catch (Exception e) 
            {
                System.out.println("Please enter correct path for image"+e);
                return null;
            }
        }
}
