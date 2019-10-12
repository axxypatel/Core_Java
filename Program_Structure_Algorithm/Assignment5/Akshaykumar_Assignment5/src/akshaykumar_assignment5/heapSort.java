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
public class heapSort {
    
    public void heapsort(double arr[]) 
    { 
        int n = arr.length; 
        for (int i = n / 2 - 1; i >= 0; i--) 
        heapify(arr, n, i); 
        for (int j=n-1; j>=0; j--){ 
            double temp = arr[0]; 
            arr[0] = arr[j]; 
            arr[j] = temp; 
            heapify(arr, j, 0); 
        } 
    } 
    public void heapify(double arr[], int n, int i) 
    { 
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
  
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
        if (largest != i) 
        { 
            double swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
            heapify(arr, n, largest); 
        } 
    } 
}
