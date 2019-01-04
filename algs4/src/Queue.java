import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int n;

    /**
     * Helper class
     * @param <Item>
     */
    private class Node<Item> {
        private Item item;
        private Node<Item> next;
    }

    public Queue() {
        first = null;
        last = null;
        n = 0;
    }

    public void enqueue(Item item) {
        Node<Item> node = new Node<>();
        node.item = item;
        last.next = node;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public void remove() {

        }

        @Override
        public Item next() {
            return null;
        }
    }

    public static void main(String[] args) {

    }

}
