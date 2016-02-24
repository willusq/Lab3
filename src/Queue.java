
public class Queue<T> implements QueueInterface<T>{

	Node head=null;
	
	@Override
	public void enqueue(T newEntry) {
		Boolean done=true;
		Node curr=head;
		if(head==null){//if the queue is empty, place the new entry at the head
			head=(new Node(null,newEntry));
			return;
		}
		while(done){//if not empty find the location where there is no next element, and place the new entry there
			if(curr.next==null){//stop the loop, as this is the end, and this is the location that the the new element will be added
				done=false;
				curr.next=(new Node(null,newEntry));
				return;
			}else curr=curr.next;
		}
	}

	@Override
	public T dequeue() {
		if(head==null){//The  Queue is Empty
			throw new EmptyQueueException();
		}else{//Queue is not empty, and the head will be removed, as it is the first in
			Node curr=head;
			head=curr.next;
			return (T)curr.getValue();
		}
	}

	@Override
	public T getFront() {
		if(head==null){
			throw new EmptyQueueException();
		}else{
			Node curr=head;
			return (T)curr.getValue();
		}
	}

	@Override
	public boolean isEmpty() {
		if(head==null) return true;
		else return false;
	}

	@Override
	public void clear() {
		head=null;
		
	}

}

class Node <T>{
	
	Node next;
	T data;
	public Node(Node n,T d){
		data=d;
		next= n;
	}
	public T getValue(){
		return data;
	}
	public void setValue(T v){
		data=v;
	}
}

