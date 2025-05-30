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

class RiwayatAntrian {
    private Node head;
    private Node tail;

    public RiwayatAntrian() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty () {
        return head == null;
    }

    public void addTransaction(TransaksiLayanan data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void displayTransactions() {
        Node current = head;
        if (isEmpty()) {
            System.out.println("Data kosong!");
            return;
        }
        while (current != null) {
            current.data.tampilkanInformasi();
            current = current.next;
        }
  }
}