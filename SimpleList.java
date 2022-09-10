package CreateList;
public class SimpleList {
    public static void main(String[] args) {
        ListCreate list = new ListCreate();
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        list.insertNode(firstNode);
        list.insertNode(thirdNode);
        list.insertNode(secondNode);
        list.display();
    }
}
