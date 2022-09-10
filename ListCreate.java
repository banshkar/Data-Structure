package CreateList;
public class ListCreate {
   private  INode head;
   public INode insertNode(INode myinode){
       if(head==null){
           head=myinode;
       }
       else {
           INode temp = head;
           head = myinode;
           head.setNext(temp);
       }
       return head;
   }
   public  void display(INode head){
           System.out.println(head.getData());
   }

}
