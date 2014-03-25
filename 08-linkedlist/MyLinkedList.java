public class MyLinkedList{
    private Node head;
    
    public MyLinkedList(){
	head = null;
    }

    public void add(String d){
	//adds to beginning of linked list
	// Node temp = new Node(d);
	// temp.setNext(head);
	// head = temp;

	//adds to end of linked list
	Node temp = head;
	while(temp != null){
	    temp = temp.getNext();
	}
	temp.setNext(new Node(d));
    }

    public void add(int i, String s){
	Node temp = head;
	Node ans = new Node(s);
	for(int j = 0; j<=i; j++){
	    if(j == i-1){
		ans.setNext(temp.getNext());
		temp.setNext(ans);
	    }
	    else{
		temp = temp.getNext();
	    }
	}
    }

    public String get(int i){
	Node temp = head;
	for(int j = 0; j<=i; j++){
	    if(j == i){
		return temp.getData();
	    }
	    else{
		temp = temp.getNext();
	    }
	}
	return "";
    }

    public String set(int i, String s){
	Node temp = head;
	for(int j = 0; j<=i; j++){
	    if(j == i){
		String ans = temp.getData();
		temp.setData(s);
		//temp = new Node(s);
		return ans;
	    }
	    else{
		temp = temp.getNext();
	    }
	}
	return temp.getData();
    }

    public String remove(int i){
    	Node temp = head;
    	for(int j = 0; j<=i; j++){
    	    if(j == i-1){
    		String ans = temp.getNext().getData();
    		temp.setNext(temp.getNext().getNext());
    		return ans;
    	    }
    	    else{
    		temp = temp.getNext();
    	    }
    	}
    	return temp.getData();
    }

    public int find(String s){
	Node temp = head;
        for(int i = 0; temp != null; i++){
	    if(temp.getData().equals(s)){
		return i;
	    }
	    temp = temp.getNext();
	}
	return -1;
    }

    //maybe I should rewrite the other methods using size()
    public int size(){
	Node temp = head;
	int i = 0;
        for(;temp != null; i++){
	    temp = temp.getNext();
	}
	return i;
    }

    public String toString(){
	String s = "";
	Node temp = head;
	while(temp != null){
	    s += temp+" ";
	    temp = temp.getNext();
	}
	return s;
    }

    public static void main(String[]args){
	MyLinkedList L = new MyLinkedList();
	L.add("Sully");
	System.out.println(L);
	L.add("Mike");
	System.out.println(L);
	L.add("Randall");
	System.out.println(L);
	L.add(1,"Boo");
	System.out.println(L);
	System.out.println(L.get(1));
	System.out.println(L.set(1,"Bob"));
	System.out.println(L);
	System.out.println(L.remove(1));
	System.out.println(L);
	System.out.println(L.find("Sully"));
	System.out.println(L.find("AlwaysWatching"));
	System.out.println(L.size());
    }
}
