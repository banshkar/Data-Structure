package CreateList;
public class SimpleList {
    public static void main(String[] args) {
        ListCreate list = new ListCreate();
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        Node<Integer> thirdNode1 = new Node<>(170);
        list.insertNodeInBeginning(firstNode);
        list.insertNodeAtEnd(secondNode);
        list.InsertNodeMiddle(thirdNode);
        list.display();
        list.deletedNodeLast();
        list.display();
    }
}
