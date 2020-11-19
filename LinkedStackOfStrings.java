public class LinkedStackOfStrings {
    private class Node {
        String item;
        Node next;
    }
    private Node first = null;
    public Boolean isEmpty() {
        return first == null;
    }
    public void push(String item) {
        Node oldFirst = first;
        first.item = item;
        first.next = oldFirst;
    }
    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}
