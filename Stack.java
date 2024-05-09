package ExceptionandCollection;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
        System.out.println("Pushed " + item + " onto the stack.");
    }

    public Integer pop() {
        if (!isEmpty()) {
            int poppedItem = stack.remove(stack.size() - 1);
            System.out.println("Popped " + poppedItem + " from the stack.");
            return poppedItem;
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Is stack empty? " + stack.isEmpty());          
	stack.pop();  
        stack.pop();  
        stack.pop();  

        System.out.println("Is stack empty? " + stack.isEmpty());      
}
}
