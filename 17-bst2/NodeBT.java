public class NodeBT{
    private int data;
    private NodeBT left, right;

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

    public void setLeft(NodeBT L){
	left = L;
    }

    public NodeBT getLeft(){
	return left;
    }

    public void setRight(NodeBT R){
	right = R;
    }

    public NodeBT getRight(){
	return right;
    }

    public String toString(){
	return ""+data;
    }
}
