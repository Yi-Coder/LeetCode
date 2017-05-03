package Solution51_100;

public class malong {
	
	  public static class LinkedListNode{
	        int val;
	        LinkedListNode next;
	    
	        LinkedListNode(int node_value) {
	            val = node_value;
	            next = null;
	        }
	
	  static LinkedListNode deleteEven(LinkedListNode list) {
		  
		 if(list == null) return null;
		 
		 if(list.val % 2 == 0) return deleteEven(list.next);
		 else { 
			 if(list.next != null ) {
				 	
				 list.next = deleteEven(list.next);
			 }else return list;
			 
		 }
		 
		 return list;
		

	    }

}
}
