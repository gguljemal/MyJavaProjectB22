package day63_collections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        //LIFO
        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Leaders eat last");
        bookStack.add("Java intro");
        bookStack.push("cucumber");
        System.out.println(bookStack);

        System.out.println("This is at the top of the stack: " + bookStack.peek());

        //bookStack.pop(); // removes and returns the top of the stack item
        System.out.println(bookStack.pop());

        System.out.println(bookStack);
        System.out.println(bookStack.peek());
    }
}
