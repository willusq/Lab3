
public class DLLQueue<T> implements QueueInterface{
	DNode head=new DNode(null,null,null);
	DNode tail=new DNode(null,null,null);
	@Override
	public void enqueue(Object newEntry) {
		DNode tmp= new DNode(null,null,newEntry);
		if(head.next==null){
			tmp.prev=head;
			tmp.next=tail;
			head.next=tmp;
			tail.prev=tmp;
			return;
		}else{
		
			tmp.prev=tail.prev;
			tmp.prev.next=tmp;
			tail.prev=tmp;
			tmp.next=tail;
		}
		
	}

	@Override
	public Object dequeue() {
		if(head.next==null){
			throw new EmptyQueueException();
		}else{
			DNode tmp = head.next;
			head.next=tmp.next;
			if(tmp.next==tail){
				head.next=null;
				tail.prev=null;
			}else{
			tmp.next.prev=head;	
			}
			return tmp.data;
		}
	}

	@Override
	public Object getFront() {
		if(head.next==null){
			throw new EmptyQueueException();
		}else{
			DNode tmp = head.next;
			return tmp.data;
		}
	}

	@Override
	public boolean isEmpty() {
		if(head.next==null) return true;
		else return false;
	}

	@Override
	public void clear() {
		head.next=null;
		tail.prev=null;
		
	}

}
class DNode<T>{
	DNode next,prev;
	T data;
	DNode(DNode p,DNode n,T d){
		data=d;
		next=n;
		prev=p;
	}
}