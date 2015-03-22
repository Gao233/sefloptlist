public class MTF {
	public static Node head;

	public static void main(String[] args) {
		head = null;
		//create a single node linked list with node from 0 to 9 as our initial list 
		head.next = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4,
			new Node(5, new Node(6, new Node(7, new Node(8, new Node(9,null))))))))));
		
		for (Node x = head; x != null; x = x.next) {
			System.out.print(x);
		}
	}

	/*private void MoveToFront(int data) {
		Node x = head;
		while (x.data != data) {
			x = x.next;
		}
		x.next = head;
		head = 

	}*/
}
