
public class CountMethod {
	public static nodeWithCount head;
	
	public static void main(String[] args) {

		head = new nodeWithCount(0, null);
		// create a single nodeWithCount linked list with nodeWithCount from 0 to 9 as our initial
		// list
		head.next = new nodeWithCount(0, new nodeWithCount(1, new nodeWithCount(2, new nodeWithCount(3, new nodeWithCount(4,
				new nodeWithCount(5, new nodeWithCount(6, new nodeWithCount(7, new nodeWithCount(8, new nodeWithCount(9,
						null))))))))));

		System.out.println("Initial dataset:");
		printnodeWithCounts();
		String s = "0011223344556677889999997733222";
		for (int i = 0; i < s.length(); i++) {
			int value = Character.getNumericValue(s.charAt(i));
			System.out.println("Input value: " + value);
			countMethod(value);
			printnodeWithCounts();

		}
	}
	
	private static void countMethod(int input){
		nodeWithCount x = head;
		while (x.next.data != input) {
			x = x.next;
		}
		if (x == head){
			x.next.counter++;
			return;
		}else{
			x.next.counter++;
			if(x.counter >= x.next.counter){
				return;
			}
			int tempCount = x.next.counter;
			nodeWithCount tempNode = head;
			while (tempNode.next.counter >= tempCount) {
				tempNode = tempNode.next;
			}
			
			nodeWithCount tempNode2 = x.next;
			x.next = tempNode2.next;
			tempNode2.next = tempNode.next;
			tempNode.next = tempNode2;
			/*x.next.counter++;
			if (x.next.counter > x.counter){
				int tempValue = x.data;
				int tempCounter = x.counter;
				x.data = x.next.data;
				x.counter = x.next.counter;
				x.next.data = tempValue;
				x.next.counter = tempCounter;
				
			}*/			
		}
	}
	
	private static void printnodeWithCounts() {
		for (nodeWithCount x = head.next; x != null; x = x.next) {
			System.out.print(x);
		}
		System.out.println();
	}
}
