public class ArrayStack<T> {
    private Object[] array; 
    private int size; 
    private int top; 

    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>();

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

    public ArrayStack(int initialSize) {
        array = new Object[10];
        size = 0; 
        top = -1;  
    }

    public ArrayStack() {
        this(10); 
    }

    public void push(T value) {
        size++; 
        top++;
        if(top >= array.length) { 
            Object[] newA = new Object[array.length * 2]; 
            for (int i = 0; i < array.length; i++) {
                newA[i] = array[i]; 
            }
            newA = array; 
        }
        array[top] = value; 
    }

    public T pop() {
        if(size == 0) {
            throw new RuntimeException(); 
        }

        T value = (T) array[top];
        size--; 
        top--;

        return value; 
    }

    public T peek() {
        if(size == 0) {
            throw new RuntimeException(); 
        }

        return (T) array[top]; 
    }
}