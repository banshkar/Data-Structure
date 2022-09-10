package CreateList;
public class SimpleList {
    public static void main(String[] args) {
        Node<Integer> firstNode = new Node<>(10);
        Node<Integer> secondNode = new Node<>(200);
        Node<Integer> thirdNode = new Node<>(10);
        firstNode.setNextNode(secondNode);
        secondNode.setNextNode(thirdNode);
        if(firstNode.getNextNode()==secondNode &&secondNode.getNextNode()==thirdNode){
            System.out.println("List create success");
        }
        else {
            System.out.println("List create failed");
        }
    }
}
