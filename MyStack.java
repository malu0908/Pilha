package dataStructre;

public class MyStack {
	
	public Node top;
	
	public MyStack() {
		this.top = null;
	}
	
	//empilhar
	public void push(int v) {
		Node newNode = new Node(v, null);
		newNode.next = this.top;
		this.top = newNode;
	}
	
	//desempilhar
	public int pop() {
		int result = this.top.value;
		this.top = this.top.next;
		return result;
	}
	
	//verificar se eh vazio
	public boolean isEmpty() {
		return this.top == null;
	}

}
