public class LinkedList2{
    private Node head;
    
    public LinkedList2(){
	head = new Node("1");
    }

    public void add(String d){
	Node temp = new Node(d);
	temp.setNext(head.getNext());
	head.setNext(temp);
    }

    public void add(int i, String s){
	Node temp = head;
	Node ans = new Node(s);
	for(int j = 0; j<=i; j++){
	    if(j == i){
		ans.setNext(temp.getNext());
		temp.setNext(ans);
	    }
	    else{
		temp = temp.getNext();
	    }
	}
    }

    public String get(int i){
	Node temp = head.getNext();
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
	Node temp = head.getNext();
	for(int j = 0; j<=i; j++){
	    if(j == i){
		String ans = temp.getData();
		temp.setData(s);
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
    	    if(j == i){
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
	Node temp = head.getNext();
        for(int i = 0; temp != null; i++){
	    if(temp.getData().equals(s)){
		return i;
	    }
	    temp = temp.getNext();
	}
	return -1;
    }

    public int size(){
	Node temp = head.getNext();
	int i = 0;
        for(;temp != null; i++){
	    temp = temp.getNext();
	}
	return i;
    }

    public String toString(){
	String s = "";
	//Node temp = head;
	Node temp = head.getNext();
	while(temp != null){
	    s += temp+" ";
	    temp = temp.getNext();
	}
	return s;
    }

    public static void main(String[]args){
	LinkedList2 L = new LinkedList2();
	L.add("Sully");
	System.out.println(L);
	L.add("Mike");
	System.out.println(L);
	L.add("Boo");
	System.out.println(L);
	L.add(0,"Randall");
	System.out.println(L);
	System.out.println(L.get(1));
	System.out.println(L.set(1,"Bob"));
	System.out.println(L);
	System.out.println(L.remove(0));
	System.out.println(L);
	System.out.println(L.find("Sully"));
	System.out.println(L.find("AlwaysWatching"));
	System.out.println(L.size());
    }
}
