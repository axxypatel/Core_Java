/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akshaykumar_assignment5;

import com.sun.istack.internal.FinalArrayList;

/**
 *
 * @author Akshay
 */
public class Problem3 {
    double[] finalArray;
            
    public Problem3(double[] arry) {
        this.finalArray = arry;
        quicksort(finalArray);
    }
    
    public void quicksort(double[] finalArray){
        quickSortHelper(finalArray,0,finalArray.length - 1);
        for(int i=0;i<finalArray.length;i++){
            System.out.print(finalArray[i]+ " ");
        }
    }
    public void quickSortHelper(double[] finalArray,int first, int last){
        if(first < last){
            int splitpoint = partition(finalArray,first,last);
            quickSortHelper(finalArray,first,splitpoint-1);
            quickSortHelper(finalArray,splitpoint+1,last);
        }
        
    }
    public int partition(double[] finalArray,int first,int last){
        double pivotvalue = finalArray[first];
        int leftmark = first+1;
        int righmark = last;
        boolean done = false;
        double temp;
        while(! done){
            while(leftmark <= righmark && finalArray[leftmark] <= pivotvalue){
                leftmark += 1;}
            //System.out.println(righmark+" "+pivotvalue+" "+leftmark);
            while(finalArray[righmark] >= pivotvalue && righmark >= leftmark)
                righmark -= 1;
            if(righmark < leftmark)
                done = true;
            else{
                temp = finalArray[leftmark];
                finalArray[leftmark] = finalArray[righmark];
                finalArray[righmark] = temp;
            }
        }
        temp = finalArray[first];
        finalArray[first]=finalArray[righmark];
        finalArray[righmark]=temp;
    
    return righmark;
    }
}
