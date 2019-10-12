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
public class Problem8 {
    private Node[] nodeStack;
    private int index=0;
    Problem8(int capacity){
       this.nodeStack = createStack(capacity);
    }
    
    private class Node{
        public String name;
        public int age;
        Node(String name,int age){
           this.name = name;
           this.age = age;               
        }
    }
    public Node[] createStack(int size){
        return new Node[size];
    }
    public void push(String name, int age){
        Node newNode = new Node(name,age); 
        this.nodeStack[index++] = newNode;
    }
    
    public String pop(){
        return this.nodeStack[--index].name;
    }
    public boolean IsEmpty(){
        return index == 0;
    }

    
}
