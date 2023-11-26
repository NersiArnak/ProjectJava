package Pr21;

public class ArrayQueueModule<T> {
    private static final int START_CAPACITY = 100;
    private Object[] array;
    private int size;
    private int head;
    private int tail;

    public ArrayQueueModule() {
        array = new Object[START_CAPACITY];
        size = head = tail = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length << 1];
            int count = tail < head ? array.length - head : size;
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head)
                System.arraycopy(array, 0, temp, count, tail);
            array = temp;
            head = 0;
            tail = size;
        }
    }

    public void enqueue(T element) {
        assert element != null;
        ensureCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    public T element() {
        assert size > 0;
        return (T) array[head];
    }

    public T dequeue() {
        assert size > 0;
        T result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }

    public void push(T element) {
        assert element != null;
        ensureCapacity(size + 1);
        head = (head == 0) ? array.length - 1 : head - 1;
        array[head] = element;
        size++;
    }

    public T peek() {
        assert size > 0;
        return (T) array[(tail == 0) ? array.length - 1 : tail - 1];
    }

    public T remove() {
        assert size > 0;
        T result = peek();
        tail = tail == 0 ? array.length - 1 : --tail;
        array[tail] = null;
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = head = tail = 0;
        array = new Object[START_CAPACITY];
    }

    public Object[] toArray() {
        Object[] temp = new Object[size];
        int count = tail < head ? array.length - head : size;
        System.arraycopy(array, head, temp, 0, count);
        if (tail < head)
            System.arraycopy(array, 0, temp, count, tail);
        return temp;
    }
}
