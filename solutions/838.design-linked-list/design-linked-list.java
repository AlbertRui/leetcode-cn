class MyLinkedList {
    
    class Node {
        Node next;
        int val;
        Node(int val) {this.val = val;}
    }
    
    private int size;
    private Node head;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= size || index < 0) return -1;
        Node temp = head;
        for(int i = 0; i < index; i++) 
            temp = temp.next;
        return temp.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(head == null) head = new Node(val);
        else {
            Node temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = new Node(val);
        }
        size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size || index < 0) return;
        if(index == 0) {
            addAtHead(val);
        } else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++)
                temp = temp.next;
            Node node = new Node(val);
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index > size - 1) return;
        Node temp = head;
        for(int i = 0; i < index - 1; i++) 
            temp = temp.next;
        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */