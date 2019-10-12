package akshaykumar_assignment3;

import java.util.Stack;

/**
 *
 * @author Akshay
 */
public class Problem7 {
    static int check_precedence(char chr){
        switch(chr){
            case '+':return 1;
            case '-':return 1;
            case '*':return 2;
            case '/':return 2;
        } 
        return -1;
    } 
    
    static String infixToPostfix(String infix_string) 
    { 
        
        String postfix_string = new String(""); 
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<infix_string.length(); ++i) 
        { 
            char curr_chr = infix_string.charAt(i); 
            if (Character.isLetterOrDigit(curr_chr)) 
                postfix_string += curr_chr; 
            else if (curr_chr == '(') 
                stack.push(curr_chr); 
            else if (curr_chr == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    postfix_string += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "invalid";                
                else
                    stack.pop(); 
            } 
            else
            { 
                while (!stack.isEmpty() && check_precedence(curr_chr) <= check_precedence(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "invalid"; 
                    postfix_string += stack.pop(); 
             } 
                stack.push(curr_chr); 
            } 
       
        }
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "invalid"; 
            postfix_string += stack.pop(); 
         } 
        return postfix_string; 
    } 
    Problem7(String infix)  
    { 
        String infix_string = infix; 
        System.out.println(infixToPostfix(infix_string)); 
    } 
}