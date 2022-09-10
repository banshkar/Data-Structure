package CreateList;
public class SimpleList {
    public static void main(String[] args) {
        ListCreate list = new ListCreate();
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        INode head;
        head =list.insertNode(firstNode);
        head =list.insertNode(secondNode);
        head =list.insertNode(thirdNode);
        list.display();
    }
}
