import java.util.*;

public class RPN{
    private MyStackA m;
    
    public RPN(){
	m = new MyStackA();
    }
    
    public String calc(String s){
        if(s.equals("+")){
	    System.out.println(s);
	    double temp = Double.parseDouble(m.pop());
	    String ans = ""+(temp+Double.parseDouble(m.pop()));
	    m.push(ans);
	    return ans;
	}
	else if(s.equals("-")){
	    System.out.println(s);
	    double temp = Double.parseDouble(m.pop());
	    String ans = ""+(Double.parseDouble(m.pop())-temp);
	    m.push(ans);
	    return ans;
	}
	else if(s.equals("*")){
	    System.out.println(s);
	    double temp = Double.parseDouble(m.pop());
	    String ans = ""+(temp*Double.parseDouble(m.pop()));
	    m.push(ans);
	    return ans;
	}
	else if(s.equals("/")){
	    System.out.println(s);
	    double temp = Double.parseDouble(m.pop());
	    String ans = ""+(Double.parseDouble(m.pop())/temp);
	    m.push(ans);
	    return ans;
	}
	else{
	    m.push(s);
	    return s;
	}
    }
    
    public static void main(String[]args){
	RPN r = new RPN();
	System.out.println(r.calc("4.0"));
	System.out.println(r.calc("4.0"));
	System.out.println(r.calc("+"));
	System.out.println(r.calc("2.0"));
	System.out.println(r.calc("/"));
	System.out.println(r.calc("4.0"));
	System.out.println(r.calc("*"));
	System.out.println(r.calc("4.0"));
	System.out.println(r.calc("-"));
    }
}
