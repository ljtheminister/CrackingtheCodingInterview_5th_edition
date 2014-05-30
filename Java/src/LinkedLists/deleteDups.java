package LinkedLists;

import java.util.Hashtable;


public class deleteDups{


	public static void deleteDups(Node n) {
		Hashtable table = new Hashtable();
		Node prev = null;
		while (n != null) {
			if (table.containsKey(n.data)) {
				prev.next = n.next;
			}
			else {
				table.put(n.data, true);
				prev = n;
			}
			n = n.next;
		}
	}
	
	public static void main(String [] args) {
		System.out.println("x");
		
	}

}