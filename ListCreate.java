package CreateList;
public class ListCreate {
   public   Node head;
   public   Node tail;
   int size;
   public void insertNode(Node myinode){
       if(head==null){
           head=myinode;
           tail = myinode;
       }
       else {
           tail.next=myinode;
           tail =myinode;
       }
       size++;

   }
   public  void insertNodeInMiddle(Node newNode){
       if(head==null){
           head =newNode;
           tail=newNode;
       }
       else {
           INode temp,current;
           int count =(size%2==0 )?( size/2) :((size+1)/2);
           temp =head;
           current=head;
           for(int index=0; index<count;index++){
               current=temp;
               temp=temp.getNext();
           }
           current.setNext(newNode);
           newNode.setNext(temp);
       }
       size++;
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
