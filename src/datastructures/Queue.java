package datastructures;

import java.util.Optional;

public class Queue<T> {

    private Integer count = 1;
    LinkedList<T> list;

    Queue(T value) {
        this.list = new LinkedList<>(value);
    }

    public void push(T value) {
        setCount(count + 1);
        list.push(value);
    }

    public Optional<T> next() {
        if(count >= 1) {
            setCount(count - 1);
            return Optional.of(list.getFirst());
        }
        return Optional.empty();
    }

    public void empty() {
        while(this.getCount() != 0) {
            System.out.println(this.next().get());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue(12);

        queue.push(12);
        queue.push(15);
        queue.push(24);
        queue.push(54);

        queue.empty();

    }

    public Integer getCount() {
        return count;
    }

    private void setCount(Integer count) {
        this.count = count;
    }

}
