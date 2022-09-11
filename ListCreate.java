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
        size++;
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
    public  void andAtindex(int position,INode myNode){
        if(position==0){
            insertNodeInBeginning(myNode);
        } else if (position==-1){
            System.out.println("This Data not Found");
        } else {
            INode temp;
            INode current;
            temp =head;
            current=null;
            for (int index = 1; index <=position; index++) {
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
    public  void deletedNodeByPosition(INode myNode){
        if (head == null) {
            System.out.println("list is Empty");
        }
        else {
            INode currentNode =head;
            INode previewNode =null;
            while (currentNode!=null) {
                if (currentNode.getData().equals(myNode.getData())) {
                    if (previewNode == null) {
                        head = currentNode.getNext();
                    } else {
                        previewNode.setNext(currentNode.getNext());
                    }
                    break;
                }
                previewNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }
        size--;
    }
    public  int searchNode(INode myNode){
        INode currentNode =head;
        int position=0;
        boolean found =false;
        if(head==null){
            System.out.println("list empty");
        }
        else {
            while (currentNode!=null){
                if(currentNode.getData().equals(myNode.getData())){
                    found=true;
                    break;
                }
                position++;
                currentNode=currentNode.getNext();
            }
        }
        if(found){
            return position;
        }
        else {
            return -1;
        }
    }
public void SearchAndPosition(INode searchValue,INode insertValue){
        int position =searchNode(searchValue);
        andAtindex(position,insertValue);
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
        System.out.println();
        System.out.println("size of list :" +size);
        }
    }