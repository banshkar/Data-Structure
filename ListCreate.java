package CreateList;
public class ListCreate {
   public   INode head;
   public   INode tail;
   int size;
   public void insertNodeInBeginning(INode myinode){
       if(head==null){
           head=myinode;
           tail = myinode;
       }
       else {
           INode temp =head;
           head=myinode;
           head.setNext(temp);
       }
       size++;

   }

   public  void deleteNodeFromBeginning(){
       if(head==null){
           System.out.println("List is Empty");
       }
       else {
           head = head.getNext();
       }
       size--;
   }
   public  void display(){
       INode current =head;
       if(head==null){
           System.out.println("List Empty");
           return;
       }
           while (current!=null){
              if(current.getNext()!=null){
                  System.out.print(current.getData()+"->");
                  current=current.getNext();
              }
              else {
                  System.out.println(current.getData());
                  current =current.getNext();
              }
       }
   }
}
