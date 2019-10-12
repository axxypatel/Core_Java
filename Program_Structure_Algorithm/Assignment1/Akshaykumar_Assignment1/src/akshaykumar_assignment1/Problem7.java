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
public class Problem7 {
    
    public Node firstNode;
    Problem7(){
        this.firstNode = null;
    }
    
    private class Node{
        public String name;
        public int age;
        Node nextNode;
        Node(String name,int age,Node oldFirst){
           this.name = name;
           this.age = age;
           this.nextNode = oldFirst;                
        }
    }
    
    public boolean isEmpty(){
        return firstNode == null;
    }
    public void push(String name, int age){
        Node oldFirst = this.firstNode;
        Node newNode = new Node(name,age,oldFirst); 
        this.firstNode = newNode;
    }
    
    public String pop(){
        String name = this.firstNode.name;
        firstNode = this.firstNode.nextNode;
        return name;
    }
    
}
