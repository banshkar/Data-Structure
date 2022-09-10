package CreateList;
interface INode<T>{
    public void setData(T data);
    public T getData();
    public void setNext(INode<T> next);
    INode<T> getNext();
}