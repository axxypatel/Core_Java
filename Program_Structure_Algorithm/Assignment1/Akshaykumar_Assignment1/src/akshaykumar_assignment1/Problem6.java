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
public class Problem6 {
    private String input_string;
    private String[] stack_data;
    private int stack_index = 0;
    Problem6(String input_data){
        this.input_string = input_data;
        this.stack_data = createStack(input_data);
        loadStack(input_string);
        
    }
    public String[] createStack(String input_data){
        return new String[(input_data.length()-(input_data.replace(" ", "")).length())+1];
    }
    public void push(String input){
        this.stack_data[stack_index++] = input;
    }
    public String pop(){
     return this.stack_data[--stack_index];
    }
    public void loadStack(String input_string){
        String[] stack_data = null;
        int first_index = input_string.indexOf(" ");
        int last_index = input_string.lastIndexOf(" ");
        int index = 0;
        while(first_index <= last_index)
        {
        push(input_string.substring(last_index+1));
        input_string = input_string.substring(0, last_index);
        last_index = input_string.lastIndexOf(" ");
        }
        push(input_string);
    }
    public boolean IsEmpty(){
        return stack_index == 0;
    }

    
}
