import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item> {
    private Node<Item> top;
    private int n;

    private class Node<T> {
        private T item;
        private Node<T> next;
    }

    public Stack() {
        top = null;
        n = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Item peek() {
        if (top == null) throw new NoSuchElementException("Stack Underflow");
        return top.item;
    }

    public Item pop() {
        if (top == null) throw new NoSuchElementException("Stack Underflow");
        Item t = top.item;
        top = top.next;
        n--;
        return t;
    }

    public void push(Item item) {
        Node<Item> oldtop = top;
        top = new Node<Item>();
        top.item = item;
        top.next = oldtop;
        n++;
    }

    public int size() {
        return n;
    }

    public String toString() {
        return new String("Stack");
    }



    @Override
    public Iterator<Item> iterator() {
        return new StackIterator<Item>(top);
    }

    private class StackIterator<T> implements Iterator<T> {
        private Node<T> current;

        StackIterator(Node<T> top){
            current = top;
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T cur = current.item;
            current = current.next;
            return cur;
        }
    }

    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.push("item");
        stack.push("is");
        stack.push("null");

        for (String s: stack) {
            System.out.println(s);
        }

        stack.pop();
        stack.peek();
        for (String s: stack) {
            System.out.println(s);
        }
    }
}
