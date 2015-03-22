public class BitnersAlgorithm {

	public static node head;

	public static void main(String[] args) {

		head = new node(0, null);
		// create a single node linked list with node from 0 to 9 as our initial
		// list
		head.next = new node(0, new node(1, new node(2, new node(3, new node(4,
				new node(5, new node(6, new node(7, new node(8, new node(9,
						null))))))))));

		System.out.println("Initial dataset:");
		printNodes();
		String s = "01234567891111111111222444445555";
		if(s.length()>10){
			String mtf = s.substring(0, 10);
			String trans = s.substring(10);
			runMTF(mtf);
			runTransMethod(trans);
		}else{
			runMTF(s);
		}
	}

	private static void runMTF(String s){
		System.out.println("For the first 10 inputs, use MTF method");
		for (int i = 0; i < s.length(); i++) {
			int value = Character.getNumericValue(s.charAt(i));
			System.out.println("Value to move to front: " + value);
			MoveToFront(value);
			printNodes();
		}
	}
	
	private static void runTransMethod(String s){
		System.out.println("Starts from 11th input, use Transpose method");
		for (int i = 0; i < s.length(); i++) {
			int value = Character.getNumericValue(s.charAt(i));
			System.out.println("Value to move: " + value);
			transposeMethod(value);
			printNodes();
		}
	}
	
	private static void MoveToFront(int input) {
		node x = head;
		while (x.next.data != input) {
			x = x.next;
		}
		if (x.next.next == null) {
			x.next.next = head.next;
			head.next = x.next;
			x.next = null;
		} else {
			node temp = x.next;
			x.next = temp.next;
			temp.next = head.next;
			head.next = temp;
		}
	}
	
	private static void transposeMethod(int input) {
		node x = head;
		while (x.next.data != input) {
			x = x.next;
		}
		if(x == head){
			return;
		}else{
			int tempValue = x.data;
			x.data = x.next.data;
			x.next.data = tempValue;
		}
	}

	private static void printNodes() {
		for (node x = head.next; x != null; x = x.next) {
			System.out.print(x);
		}
		System.out.println();
	}
}
