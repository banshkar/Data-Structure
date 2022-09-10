package CreateList;
public class ListCreate {
   public   Node head;
   public   Node tail;
   public Node insertNode(Node myinode){
       if(head==null){
           head=myinode;
           tail = myinode;
       }
       else {
           tail.next=myinode;
           tail =myinode;
       }
       return head;
   }
   public  void display(){
       INode current =head;
       if(head==null){
           System.out.println("List Empty");
           return;
       }
           while (current!=null){
               System.out.println(current.getData());
               current=current.getNext();
       }
   }
}
