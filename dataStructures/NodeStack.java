public class NodeStack<T> {

    public static void main(String[] args) {
        NodeStack<String> stack = new NodeStack<String>(); 
        
        try {
            stack.pop(); 
        } catch (RuntimeException e) {
            System.out.println("pop on empty gives exception");
        }

        stack.push("first");
        stack.push("second"); 
        
        System.out.println(stack.peek() + " - second expected"); 

        stack.pop(); 

        System.out.println(stack.peek() + " - first expected");

        stack.pop(); 
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("Another exception expected"); 
        }
    }
    private class Node<T> {
        T value; 
        Node<T> previous; 
    }

    private Node<T> top; 
    private int size; 

    public void push(T value) {
        Node<T> node = new Node<T>(); 
        node.value = value; 

        if(top == null) {
            top = node; 
        }
        else {
            node.previous = top; 
            top = node; 
        }

        size++; 
    }

    public T pop() {
        if(size == 0) {
            throw new RuntimeException(); 
        }

        T value = top.value; 
        top = top.previous; 
        size--; 

        return value; 
    }

    public T peek() {
        if(size == 0) {
            throw new RuntimeException(); 
        }
        return top.value; 
    }
}