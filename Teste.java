package dataStructre;

public class Teste {
	
	public static void main(String[] args) {
		MyStack s = new MyStack();
		
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			int current = s.pop();
			System.out.println("Current top: " + current);
		}
	
	}
	
}
