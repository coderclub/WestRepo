package DS;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
    	
        int [] ar = new int [5];
        ar [0] = 123;
        ar [1] = 231;
        ar [3] = 321;
        System.out.println(ar);
        
        Stack<String> stack = new Stack(); //ascjhdsih
        stack.push("NY");
        stack.push("NJ");
        stack.push("FL");

        if (stack.peek().equalsIgnoreCase("NY")){
            System.out.println(stack.pop()); //will not return value cause O(1)
        }
        while (!stack.empty()){
            System.out.println((stack.pop())); //will return value
        }

    }
}
