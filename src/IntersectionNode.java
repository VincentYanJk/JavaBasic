
public class IntersectionNode {

	static Node head1, head2;

	static class Node {

		String data;
		Node next;

		Node(String d) {
			data = d;
			next = null;
		}
	}

	/*
	 * function to get the intersection point of two linked lists head1 and head2
	 */
	public String getNode() {
		int count1 = getCount(head1);
		int count2 = getCount(head2);
		int d;

		if (count1 > count2) {
			d = count1 - count2;
			return getIntesectionNode(d, head1, head2);
		} else {
			d = count2 - count1;
			return getIntesectionNode(d, head2, head1);
		}
	}

	/*
	 * function to get the intersection point of two linked lists head1 and head2
	 * where head1 has d more nodes than head2
	 */
	public String getIntesectionNode(int d, Node node1, Node node2) {
		int i;
		Node current1 = node1;
		Node current2 = node2;
		for (i = 0; i < d; i++) {
			if (current1 == null) {
				return null;
			}
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data.equals(current2.data)) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}

		return null;
	}

	/*
	 * Takes head pointer of the linked list and returns the count of nodes in the
	 * list
	 */
	int getCount(Node node) {
		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

	public static void main(String[] args) {
		IntersectionNode list = new IntersectionNode();

		// creating first linked list
		list.head1 = new Node("a1");
		list.head1.next = new Node("a2");
		list.head1.next.next = new Node("c1");
		list.head1.next.next.next = new Node("c2");
		list.head1.next.next.next.next = new Node("c3");

		// creating second linked list
		list.head2 = new Node("b1");
		list.head2.next = new Node("b2");
		list.head2.next.next = new Node("b3");
		list.head2.next.next.next = new Node("c1");
		list.head2.next.next.next.next = new Node("c2");
		list.head2.next.next.next.next.next = new Node("c3");

		System.out.println("The node of intersection is " + list.getNode());
	}

}
