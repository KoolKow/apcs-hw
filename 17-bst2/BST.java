public class BST{
    private NodeBT root;

    public BST(){
	root = null;
    }

    public BST(int r){
	root = new NodeBT(r);
    }
    
    public void insert(int n){
	if(root == null){
	    root = new NodeBT(n);
	}
	else{
	    NodeBT pooh = root;
	    NodeBT piglet = root;
	    while(pooh != null){
		piglet = pooh;
		if(n < pooh.getData()){
		    pooh = pooh.getLeft();
		}
		else{
		    pooh = pooh.getRight();
		}
	    }
	    if(n < piglet.getData()){
		piglet.setLeft(new NodeBT(n));
	    }
	    else{
		piglet.setRight(new NodeBT(n));
	    }
	}
    }

    public NodeBT search(int x){
	NodeBT c = root;
	while(c != null && c.getData() != x){
	    if(c.getData() < x){
		c = c.getRight();
	    }
	    else{
		c = c.getLeft();
	    }
	}
	return c;
    }

    public NodeBT search2(NodeBT c, int x){
	if(c == null){
	    return null;
	}
	else if(x < c.getData()){
	    return search2(c.getLeft(),x);
	}
	else if(x > c.getData()){
	    return search2(c.getRight(),x);
	}
	else{
	    return c;
	}
    }

    public NodeBT delete(int x){
        NodeBT n = search2(root,x);
        if(n == null){
	    System.out.println("Error");
	    return null;
	}
        else if(n.getLeft() == null && n.getRight() == null){
	    NodeBT temp = n;
	    n = null;
	    return temp;
	}
	else if (n.getLeft() == null && n.getRight() != null){
	    NodeBT temp = n;
	    n = n.getRight();
	    n.setRight(null);
	    return temp;
	}
        else if (n.getLeft() != null && n.getRight() == null){
	    NodeBT temp = n;
	    n = n.getLeft();
	    n.setLeft(null);
	    return temp;
	}
        else{
	    NodeBT temp = n.getLeft();
	    while(temp.getRight() != null){
		temp = temp.getRight();
	    }
	    NodeBT rem = n;
	    n = temp; // ?????????????????
	    return rem;
	}
    }

}
