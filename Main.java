
public class Main {

	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.firstAdd(20);
		l1.firstAdd(40);
		l1.Display();
		l1.addLast(90);
		l1.addLast(100);
		l1.addLast(1100);
		l1.addLast(1300);
		l1.addLast(1005);
		l1.Display();
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.getIndex(2));
		l1.Display();
		System.out.println(l1.removeFirst());
		l1.Display();
		System.out.println(l1.removeLast());
		l1.Display();
		System.out.println(l1.specificPosition(2));
		l1.Display();
		l1.inserAtPosition(678,2);
		l1.Display();
		
		

	}

}
