package CreateList;
public class SimpleList {
    public static void main(String[] args) {
        ListCreate list = new ListCreate();
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        Node<Integer> thirdNode2 = new Node<>(710);
        Node<Integer> thirdNode3 = new Node<>(210);
        list.insertNodeInBeginning(firstNode);
        list.insertNodeAtEnd(secondNode);
        list.InsertNodeMiddle(thirdNode);
        list.insertNodeInBeginning(thirdNode2);
        list.display();
        list.deletedNodeByPosition(secondNode);
        list.display();
    }
}
