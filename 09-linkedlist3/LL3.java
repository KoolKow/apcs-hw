public class LL3{
    private Node head;
    private Node tail;
    
    public LL3(){
	Node dummy = new Node("1");
	head = dummy;
	tail = dummy;
    }

    public void add(String d){
	Node temp = new Node(d);
	tail.setNext(temp);
	tail = temp;
    }

    public void add(int i, String s){
	Node temp = head;
	Node ans = new Node(s);
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
	Node temp = head;
	//Node temp = head.getNext();
	while(temp != null){
	    s += temp+" ";
	    temp = temp.getNext();
	}
	return s;
    }

    public static void main(String[]args){
	LL3 L = new LL3();
	L.add("Sully");
	L.add("Mike");
	L.add("Boo");
	System.out.println(L);
	L.add(3,"sewew");
	System.out.println(L);
	System.out.println(L.size());
	System.out.println(L.tail);
	L.add(2,"poop");
	System.out.println(L);
	System.out.println(L.tail);
    }
}
