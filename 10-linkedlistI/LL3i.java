import java.util.*;
import java.io.*;

public class LL3i<E> implements Iterable<E>{
    private NodeI<E> head;
    private NodeI<E> tail;
    
    public MyLLIterator<E> iterator(){
	return new MyLLIterator(head.getNext());
    }

    public LL3i(){
	head = new NodeI<E>();
	tail = head;
    }

    public void add(E d){
	NodeI<E> temp = new NodeI<E>(d);
	tail.setNext(temp);
	tail = temp;
    }

    public void add(int i, E s){
	NodeI<E> temp = head;
	NodeI<E> ans = new NodeI<E>(s);
	for(int j = 0; j<=i; j++){
	    if(j == i){
		ans.setNext(temp.getNext());
		temp.setNext(ans);
		if(i == size()-1){
		    tail = ans;
		}
	    }
	    else{
		temp = temp.getNext();
	    }
	}
    }

    public E get(int i){
	NodeI<E> temp = head.getNext();
	for(int j = 0; j<=i; j++){
	    if(j == i){
		return temp.getData();
	    }
	    else{
		temp = temp.getNext();
	    }
	}
	return null;
    }

    public E set(int i, E s){
	NodeI<E> temp = head.getNext();
	for(int j = 0; j<=i; j++){
	    if(j == i){
		E ans = temp.getData();
		temp.setData(s);
		return ans;
	    }
	    else{
		temp = temp.getNext();
	    }
	}
	return temp.getData();
    }

    public E remove(int i){
    	NodeI<E> temp = head;
    	for(int j = 0; j<=i; j++){
    	    if(j == i){
    		E ans = temp.getNext().getData();
    		temp.setNext(temp.getNext().getNext());
    		return ans;
    	    }
    	    else{
    		temp = temp.getNext();
    	    }
    	}
    	return temp.getData();
    }

    public int find(E s){
	NodeI<E> temp = head.getNext();
        for(int i = 0; temp != null; i++){
	    if(temp.getData().equals(s)){
		return i;
	    }
	    temp = temp.getNext();
	}
	return -1;
    }

    public int size(){
	NodeI<E> temp = head.getNext();
	int i = 0;
        for(;temp != null; i++){
	    temp = temp.getNext();
	}
	return i;
    }

    public String toString(){
	String s = "";
	//NodeI<E> temp = head;
	NodeI temp = head.getNext();
	while(temp != null){
	    s += temp+" ";
	    temp = temp.getNext();
	}
	return s;
    }

    public static void main(String[]args){
	LL3i L = new LL3i();
	L.add("1");
	L.add("2");
	L.add("3");
	L.add("4");
	System.out.println(L);
	for(Object x : L)
	    System.out.println(x);
    }
}
