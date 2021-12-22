package lab11;

public class Printer {

	public static void main(String[] args) {
		String s = "Currently printing file of KB: ";
		String n= "Next file is of KB: ";
		Queue Q1 = new Queue<Integer>();
		Q1.Dequeue();
		Q1.Enqueue(25);
		Q1.Enqueue(22);
		Q1.Enqueue(11);
		Q1.Enqueue(1);
		Q1.Enqueue(3);
		System.out.println(Q1);		
		System.out.println(s+ Q1.Dequeue());
		System.out.println(Q1);
		Q1.Enqueue(18);
		Q1.Enqueue(90);		
		Q1.Enqueue(30);
		Q1.Dequeue();
		Q1.Enqueue(45);
		System.out.println(Q1);
		System.out.println(n+Q1.peek());
		Q1.Enqueue(9);
		Q1.Enqueue(7);
		Q1.Enqueue(100);
		System.out.println(Q1);
		System.out.println(s+Q1.Dequeue());
		System.out.println(s+Q1.Dequeue());
		Q1.Enqueue(23);
		Q1.Enqueue(23);
		System.out.println(Q1);
		System.out.println(n+Q1.peek());
		Q1.Enqueue(54);		
	}
}
