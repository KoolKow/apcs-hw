public class MyStackA{
    private int top, size;
    private String[] stack;
    
    public MyStackA(){
	stack = new String[10];
	top = -1;
	size = 0;
    }
    
    public void push(String s){
        if(size < stack.length){
	    stack[top+1] = s;
	    top++;
	    size++;
	}
	else{
	    String[]temp = new String[stack.length*2];
	    for(int i = 0; i<stack.length; i++){
		temp[i] = stack[i];
	    }
	    stack = temp;
	    stack[top+1] = s;
	    top++;
	    size++;
	}
    }

    public String pop() {
        String ans = stack[top];
	stack[top] = null;
	top--;
	size--;
	return ans;
    }

    public String peek() {
	return stack[top];
    }
    
    public int size() {
	return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String s = "";
	for(int i = top; i>=0; i--){
	    s += stack[i]+" ";
	}
	return s;
    }
    
    public static void main(String[]args){
	MyStackA m = new MyStackA();
	m.push("1");
	m.push("2");
	m.push("3");
	m.push("4");
	m.push("5");
	m.push("6");
	m.push("7");
	m.push("8");
	m.push("9");
	m.push("10");
	m.push("11");
	System.out.println(m);
	while (!m.isEmpty()){
	    System.out.println(m.pop());
	}
	m.push("Hello");
	System.out.println(m.peek());
	m.push("world");
	System.out.println(m.peek());
    }
}
