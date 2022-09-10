package CreateList;

public class Node<T> implements INode<T>{
    T data;
    INode next;
   public Node(){
    }
    public Node(T data){
        this.data =data;
        this.next=null;
    }
    @Override
    public T getData() {
        return data;
    }
    @Override
    public void setData(T data) {
        this.data = data;
    }
  @Override
    public INode<T> getNext() {
        return next;
    }
    @Override
    public void setNext(INode<T> next) {
        this.next = next;
    }
}
