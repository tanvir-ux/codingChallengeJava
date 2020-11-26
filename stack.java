public class Stack<Item> {
    // create a pointer to first node
    private Node first;

    // create inner class called Node
    private class Node {
        Item item;
        Node next;
    }

    //check if stack is empty
    public boolean isEmpty() {
        return first == null;
    }

    //push generic Item to the stack
    public void push(Item item) {
        //at first save the first node for later usage
        Node olfFirst = first;
        // create an empty node and insert the given item
        first = new Node();
        first.item = item;
        // now link the first node to the old one we saved;
        first.next = olfFirst;
    }

    // pop generic item from the stack
    public Item pop() {
        // at first save the first item from stack
        Item item = first.item;
        // now delete the first node
        first = first.next;
        // return the saved item;
        return item;
    }
}
