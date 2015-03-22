public class MTF {
	public static node head;

	public static void main(String[] args) {
		head = new node(1);
		
		//create a single node linked list with node from 0 to 9 as our initial list 
<<<<<<< HEAD
		head.next = new node(0, new node(1, new node(2, new node(3, new node(4,
			new node(5, new node(6, new node(7, new node(8, new node(9,null))))))))));
		

		
=======
		head = new node(0, new node(1, new node(2, new node(3, new node(4,
			new node(5, new node(6, new node(7, new node(8, new node(9,null))))))))));
>>>>>>> 8569dba1f564a7a07452ef1dda785577915db098
		
		for (node x = head; x != null; x = x.next) {
			System.out.print(x);
		}
	}

	/*private void MoveToFront(int data) {
		node x = head;
		while (x.data != data) {
			x = x.next;
		}
		x.next = head;
		head = 

	}*/
}
