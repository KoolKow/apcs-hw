public class NodeBT{
    private int data;
    private Node left, right;

    public NodeBT(int d){
	data = d;
	left = null;
	right = null;
    }

    public void setData(int d){
	data = d;
    }

    public int getData(){
	return data;
    }

    public void setLeft(Node L){
	left = L;
    }

    public Node getLeft(){
	return left;
    }

    public void setRight(Node R){
	right = R;
    }

    public Node getRight(){
	return right;
    }

    public String toString(){
	return ""+data;
    }
}
