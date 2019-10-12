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
public class Problem3 {
    
    Problem3(){
        execute();
    }
    public void execute(){
        int arr[] = {-40,-30,0,30,40};
        int N = arr.length;
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    if(arr[i]+arr[j]+arr[k] == 0)
                        count++;
                }
        }
    } 
        System.out.println("Problem 3: "+ count);
    }
}
