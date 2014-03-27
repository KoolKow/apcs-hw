import java.util.*;
import java.io.*;

public class MyLLIterator<E> implements Iterator<E>{
    private NodeI<E> current;

    public MyLLIterator(NodeI<E> n){
	current = n;
    }
    
    public boolean hasNext(){
	return current.getNext() != null;
    }
    
    public E next(){
	E n = current.getData();
	current = current.getNext();
	return n;
    }

    public void remove(){
	
    }
    
}
