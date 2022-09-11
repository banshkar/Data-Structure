package CreateList;
public class ListCreate {
     INode head;
     INode tail;
    int size;

    public void insertNodeInBeginning(INode myNode) {
        if (head == null) {
            head = myNode;
            tail = myNode;
        } else {
            INode temp = head;
            head = myNode;
            head.setNext(temp);
        }
    }
    public void InsertNodeMiddle(INode myNode) {
        if (head == null) {
            head = myNode;
            tail =myNode;
        } else {
            INode temp;
            INode current;
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            temp =head;
            current=null;
            for (int index = 0; index < count; index++) {
                current = temp;
                temp = temp.getNext();
            }
            current.setNext(myNode);
            myNode.setNext(temp);
        }
        size++;
    }
    public void insertNodeAtEnd(INode myNode) {
        if(head==null) {
            head = myNode;
            tail = myNode;
        }
        else{
            tail.setNext(myNode);
            tail = myNode;
        }
        size++;
    }
    public void deleteNodeFromBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            head = head.getNext();
        }
        size--;
    }
    public void deletedNodeLast() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            INode currentNode = head;

                currentNode = currentNode.getNext();
                currentNode.setNext(null);
        }
    }
    public  void searchNode(INode myNode){
        if (head==null){
            System.out.println("list is Empty");
        }
        else {
            INode currentNode =head;
            int position=0;
            while (currentNode!=null){
                position++;
                if(currentNode.getData().equals(myNode.getData())){
                System.out.println("your serach Node at postion "+position+" -> "+currentNode.getData());
                }
                currentNode= currentNode.getNext();
               }
        }
    }

    public void display () {
            INode current = head;
            if (head == null) {
                System.out.println("List Empty");
                return;
            }
            while (current != null) {
                if (current.getNext() != null) {
                    System.out.print(current.getData() + "->");
                    current = current.getNext();
                }
                else {
                    System.out.println(current.getData());
                    current = current.getNext();
                }

            }
        }
    }