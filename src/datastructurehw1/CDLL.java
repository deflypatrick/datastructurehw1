package datastructurehw1;

import java.util.Iterator;
public class CDLL {
	

		private Node head = null;
		private int size = 0;
			
		/* Insert creates a new node and puts in front of the current Node
	     * The new node inserted becomes the list's current Node
	     */
		
		public void insert(int data){
			
		
			Node node1 = new Node();
			node1.data = data;
			//System.out.println("node1:" + node1.data);
			node1.next = head;
			head = node1;
			//System.out.println("head: " + head.data);
			size++;
				
			//System.out.println("size: " + size);
		
		}
	     /* Search starts from the current location and looks
		  * for the given data value. If the Node is found, it
		  * returns the Node. Otherwise, it returns null
		  */
		
		public Node search(int data){
			//System.out.println("----------------");
			//System.out.println("SEARCH");
		
			Node temp = head; 
			//System.out.println("temp: " + temp);
			while (temp != null){
				if(temp.data == data){
					//System.out.println("temp2: " + temp);
					return temp;
				}
				temp = temp.next;
				//System.out.println("temp3: " + temp);
			}
			//System.out.println("----------------");
			return null;
		}
		
	     /* Update searches for the given oldData value.
		  * If the Node is found, it changes the node value to
		  * newValue and returns true. Otherwise, it returns false
		  * If the node is found, that node also becomes
		  * the current Node
		  */
		
		public boolean update (int oldValue, int newValue){
			{
				//System.out.println("----------------");
				//System.out.println("UPDATE");
				Node temp = search(oldValue);
				//System.out.println("temp: " + temp);
				
				if (temp == null){
					return false;
				}
				temp.data = newValue;
				//System.out.println("temp.data: " + temp.data);
				//System.out.println("----------------");
				return true;
			
			}
			
		/* Delete searches for the given data value.
		 * If the Node is found, it removes the node
		 * from the list and returns true. Otherwise, it
		 * returns false. If a 	node is removed, the
		 * next node becomes the current Node
	 	 */
		}
		
		public boolean delete(int data){
			//System.out.println("----------------");
			//System.out.println("DELETE");
			Node current = head;
			//System.out.println("data:" + data);
			
			
			if(current == null){
				
				head = new Node();
				if(head.data == 0){
					head = null;
				}
				size--;
				return false;			
			}
		
			if(current.data == data){
				head = current.next;
				//System.out.println("current1A: " + current);
				current = null;
				//System.out.println("current1B: " + current);
				return true;
			}
			current = head.next;
		//	System.out.println("current2: " + head.next);
			Node lastNum = head;
		//	System.out.println("current3: " + lastNum);
			while (current != null){
				if (current.data == data){
					lastNum.next = current.next;
			//		System.out.println("lastNum.next: " + lastNum.next);
					current = null;
					return true;
				}
				current = current.next;
			//	System.out.println("head: " + head);
				lastNum = lastNum.next;
			//	System.out.println("lastNum: " + lastNum);
			}
			//System.out.println("----------------");
			return false;
		}
			
			
			/* getCurrent returns the current Node in the list
		     * If the list is empty, it returns null
		     */
		
		
		public Node getCurrent(){
			//System.out.println("----------------");
			//System.out.println("GETCURRENT");
			Node currentNum = head;
			//System.out.println("current: " + currentNum);
			if (currentNum.data == 0){
				return null;
			}
			
			//System.out.println("head: " + head);
			//System.out.println("----------------");
			
			return currentNum;
			
			 /* print displays all Nodes in order from the current
		     * node in the list using the next node pointers
		     * of each node
		     */
		}
		
		public void print(CDLL inputList) {
			  Node currentNode = inputList.head;
			  
			  if (currentNode == null) {
			  System.out.println("null");
			  } 
			 else { 
			while (currentNode != null) {
			  System.out.println(currentNode.data);
			  currentNode = currentNode.next;
			  }
			}
		}
		


	    /* print displays all Nodes in order from the current
	     * node in the list using the previous node pointers
	     * of each node
	     */

		public void printReverse(CDLL inputList){
			Node lastNode = inputList.head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = inputList.head;
			inputList.head = inputList.head.next;
		
			
			print(inputList);
	
			
		}
}
