class Node {
    TransaksiLayanan data;
    Node next;
    Node prev;

    public Node(TransaksiLayanan data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleLinkedList {
    private Node head;
    private Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addTransaction(TransaksiLayanan data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void displayTransactions() {
        Node current = head;
        while (current != null) {
            TransaksiLayanan transaksi = (TransaksiLayanan) current.data;
            transaksi.tampilkanInformasi();
            current = current.next;
        }
  }
}