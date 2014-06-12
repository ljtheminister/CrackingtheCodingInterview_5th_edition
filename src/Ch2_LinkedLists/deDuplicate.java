package Ch2_LinkedLists;

import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
import Ch2_LinkedLists.Node;

public class deDuplicate {

	public static void deleteDups(Node n) {
		HashMap hash = new HashMap();
		Node prev = null;
		
		while (n != null) {
			if hash.containsKey(n.data) {
				prev.next = n.next;
			}
			else {
				hash.put(n.data, true);
				prev = n;
			}
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		
		n = Node(5);
		deleteDups(head);
		
		HashMap hash = new HashMap();
		Node prev = null;
		
		while (n != null) {
			if hash.containsKey(n.data) {
				prev.next = n.next;
			}
			else {
				hash.put(n.data, true);
				prev = n;
			}
			n = n.next;
		}
	}

	
}
