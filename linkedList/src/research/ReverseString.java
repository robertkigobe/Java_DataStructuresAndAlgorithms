package research;

import java.util.Stack;

public class ReverseString {


    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String input = "Nakangu";
        StringBuilder output = new StringBuilder(input.length());

        char[] c = input.toCharArray();
        for(int i=0; i<input.length(); i++){
            stack.push(input.charAt(i));
        }
        while(stack.size() != 0){
            output.append(stack.pop());
        }
        System.out.println(output.toString());
    }
}
