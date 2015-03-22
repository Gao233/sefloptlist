public class MoveToFront {
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
		String s = "123456789999999888888";
		for (int i = 0; i < s.length(); i++) {
			int value = Character.getNumericValue(s.charAt(i));
			System.out.println("Value to move to front: " + value);
			MoveToFront(value);
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

	private static void printNodes() {
		for (node x = head.next; x != null; x = x.next) {
			System.out.print(x);
		}
		System.out.println();
	}
}
