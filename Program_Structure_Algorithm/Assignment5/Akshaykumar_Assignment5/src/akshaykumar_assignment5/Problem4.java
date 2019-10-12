/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akshaykumar_assignment5;

/**
 *
 * @author Akshay
 */
public class Problem4 {
    double[] arr;
    Problem4(double[] arr){
        this.arr=arr;
        mergesort(arr, 0, arr.length-1);
        printArray(arr);
    }
    public void printArray(double[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public void mergeArray(double arr[], int left, int mid, int right) 
    { 
    
        int n1 = mid - left + 1; 
        int n2 = right - mid; 
  
    
        double leftArray[] = new double [n1]; 
        double rightArray[] = new double [n2]; 
  
    
        for (int i=0; i<n1; ++i) 
            leftArray[i] = arr[left + i]; 
        for (int j=0; j<n2; ++j) 
            rightArray[j] = arr[mid + 1+ j]; 
    
        int i = 0, j = 0; 
  
    
        int k = left; 
        while (i < n1 && j < n2) 
        { 
            if (leftArray[i] <= rightArray[j]) 
            { 
                arr[k] = leftArray[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = rightArray[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            arr[k] = leftArray[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            arr[k] = rightArray[j]; 
            j++; 
            k++; 
        } 
    } 
  
    public void mergesort(double arr[], int left, int right) 
    { 
        if (right > left) 
        { 
            int mid = (left+right)/2; 
            mergesort(arr, left, mid); 
            mergesort(arr , mid+1, right); 
            mergeArray(arr, left, mid, right); 
        } 
        
    } 
  
    
}
