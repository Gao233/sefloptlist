
public class TransposeMethod {
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
		String s = "009988877776666555554444444";
		for (int i = 0; i < s.length(); i++) {
			int value = Character.getNumericValue(s.charAt(i));
			System.out.println("Value to move: " + value);
			transposeMethod(value);
			printNodes();

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
