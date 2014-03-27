public class NodeI<E>{
    private E data;
    private NodeI<E> next;

    public NodeI(){
	data = null;
	next = null;
    }

    public NodeI(E d){
	data = d;
	next = null;
    }

    public void setData(E d){
	data = d;
    }
    public E getData(){
	return data;
    }
    public void setNext(NodeI<E> n){
	next = n;
    }
    public NodeI<E> getNext(){
	return next;
    }
    
    public String toString(){
	return ""+data;
    }
}
