package dcll.ably.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by ASUS on 03/11/2016.
 */
public class SStack implements SimpleStack {
    private Stack<Item> myStack = new Stack<Item>();

    public  boolean isEmpty() {
        return  myStack.isEmpty();
    }

    public int getSize() {
        return  myStack.size();
    }

    public  void push(Item item) {
        myStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return myStack.peek();
    }

    public Item pop() throws EmptyStackException{
        return myStack.pop();
    }
}
