import java.util.*;

public class HW19{
    private PriorityQueue<Integer> min, max;

    public HW19(){
	min = new PriorityQueue<Integer>();
	max = new PriorityQueue<Integer>();
    }
    
    public void add(int x){
	if(min.size() <= max.size()){
	    min.add(x);
	}
	else{
	    max.add(x);
	}
    }

    public Integer findMedian(){
	if(min.size() < max.size()){
	    return max.peek();
	}
	else if(max.size() < min.size()){
	    return min.peek();
	}
	else{
	    return ((max.peek()+min.peek())/2);
	}
    }

    public Integer removeMedian(){
	if(min.size() > max.size()){
	    return max.poll();
	}
	else if(min.size() > max.size()){
	    return min.poll();
	}
	else{
	    return ((max.poll()+min.poll())/2);
	}
    }

}
