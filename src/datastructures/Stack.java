package datastructures;


//Can create a stack with either an array or a linked list.
public class Stack<T> {

    private Integer count = 0;
    LinkedList<T> list;

    Stack(T value) {
        this.list = new LinkedList<T>(value);
    }

    public void push(T value) {
        setCount(count + 1);
        list.push(value);
    }

    public T pop() {
        setCount(count - 1);
        return list.pop();
    }

    public void empty() {
        while(this.getCount() != 0) {
            System.out.println(this.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack(12);

        stack.push(12);
        stack.push(15);
        stack.push(24);
        stack.push(54);

        stack.empty();

    }


    public Integer getCount() {
        return count;
    }

    private void setCount(Integer count) {
        this.count = count;
    }
}
