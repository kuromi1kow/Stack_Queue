import java.util.Arrays;

public class Priority_Queue {
    private int[] arr;
    private int size;

    public Priority_Queue(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void insert(int item) {
        if (size == arr.length)
            throw new IllegalStateException("Queue is full");

        int i;
        for (i= size - 1; i >= 0; i--) {
            if (item < arr[i]) {
                arr[i + 1] = arr[i];
            } else {
                break;
            }
        }
        arr[i + 1] = item;
        size++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        int item = arr[size - 1];
        size--;
        return item;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(arr, size));
    }
}