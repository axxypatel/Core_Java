/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akshaykumar_assignment2;

/**
 *
 * @author Akshay
 */
public class Problem2 {
    private int a = 5;
    private int b = 5;
    Problem2(){
        execute();
    }
    public void execute(){
        System.out.println("************************** Constant 1********************************************");
        int z = a +b;
        System.out.println(z);
        
        System.out.println("************************** Log N ********************************************");
        while(z>1){
            z = z/2;
            System.out.println(z);
        }
        z = 10;
        System.out.println("************************** N ********************************************");
        for(int i = 0;i<z;i++){
            System.out.println(i);
        }
        System.out.println("************************** N log N********************************************");
        int arr[] = {67,34,98,12,36,56}; 
        mergesort(arr, 0, arr.length-1);   
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("************************** N^2 ********************************************");
        for(int i = 0;i<z;i++){
            for(int j = 0; j<z;j++){
            //System.out.println(j);    
            }
            System.out.println(i);
        }
        System.out.println("************************** N^3 ********************************************");
        for(int i = 0;i<z;i++){
            for(int j = 0; j<z;j++){
                for(int k = 0;k<z;k++){
                    //System.out.println(k);    
                }
            //System.out.println(j);    
            }
            System.out.println(i);
        }
        System.out.println("************************** 2^N ********************************************");
        System.out.println(fibonacci(z));
    }
    public void merge(int arr[], int l, int m, int r)     { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        int i = 0, j = 0; 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
    public void mergesort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
            mergesort(arr, l, m); 
            mergesort(arr , m+1, r); 
            merge(arr, l, m, r); 
        } 
    } 
    public int fibonacci(int num)
    {
        if (num <= 1) return num;
        return fibonacci(num - 2) + fibonacci(num - 1);
    }
    
}
