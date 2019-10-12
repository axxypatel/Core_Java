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
public class Problem1 { 
    
 private int[] queue;
 private int size, head, tail;
 private int cap = 8; 
 
 public Problem1 (){
  queue = new int [cap];
  head = 0; tail  = 0;
 }
 
 public void enQueue (int data){  
  if (size == cap)
         System.out.println("Queue is full.");
  else {
   size++;
   queue[tail] = data;
   tail = (tail+1) % cap;
  }
 }

 public int deQueue(){
  if (size == 0){
      System.out.println("Queue is empty");
      return 0;
  }
  else {
   size--;
   int data = queue [ (head % cap) ];
   //queue [head] = Integer.MIN_VALUE;
   head = (head+1) % cap;
   return data;
  }
 }
 public boolean isEmpty(){ 
  return (size == 0); 
 }
 
 public boolean isFull(){ 
  return (size == cap); 
 }
 
 public String toString(){
  String result = "[";
  for (int i = 0; i < size; i++){
   result += Integer.toString(queue[ (head + i) % cap ]);
   if (i < size -1) {
    result += ", ";
   }
  }
  result += "]";
  return result;
 }

}
    

