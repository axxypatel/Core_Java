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
public class Problem9 {
    private Node[] nodeStack;
    private int index=0;
    Problem9(){
       this.nodeStack = new Node[1];
    }
    
    private class Node{
        public String name;
        public int age;
        Node nextNode;
        Node(String name,int age){
           this.name = name;
           this.age = age;               
        }
    }
    public void push(String name, int age){
        if(index==nodeStack.length) resize_stack(2*nodeStack.length);
        //System.out.println(name);        
        Node newNode = new Node(name,age); 
        this.nodeStack[index++] = newNode;
    }
    
    public String pop(){        
        System.out.println("Current size of stack: "+String.valueOf(nodeStack.length));
        String name = this.nodeStack[--index].name;
        nodeStack[index] = null;
        if(index >0 && index == (nodeStack.length/4)) resize_stack(nodeStack.length/2);
        return name;
    }
    public boolean IsEmpty(){
        return index == 0;
    }
    public void resize_stack(int size){
        System.out.println("Resizing the stack with new size "+String.valueOf(nodeStack.length));
        Node[] copyStack = new Node[size];
        for(int i=0; i < index ; i++){
          copyStack[i] = nodeStack[i];
        }
        nodeStack = copyStack;                
    }
}
