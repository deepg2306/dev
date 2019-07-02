package tree;

public class Node {
	int key;
	String name;
	
	Node leftchild;
	Node rightchild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", name=" + name + "]";
	}
	
}
