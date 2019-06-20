public class MaxPQ<T extends Comparable<T>> {
    private Node root_;

    public MaxPQ() {

    }

    public MaxPQ(int maxSize) {

    }

    public MaxPQ(T[] keys) {

    }

    public T delMax() {

    }

    public void insert() {

    }

    public boolean empty() {

    }

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) {
            exch(k/2, k);
            k /= 2;
        }
    }

    private void sink(int k) {

    }

    private boolean less(int i, int j) {

    }

    private void exch(int i, int j) {

    }


    public static void main() {

    }
}
