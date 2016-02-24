
public class ArrayQueue<T> implements QueueInterface<T>{
	T[] queue;
	
	public ArrayQueue(int i){
		queue= (T[]) new Object[i];
	}
	public ArrayQueue(){
		this(2);
	}
	@Override
	public void enqueue(T newEntry) {
		boolean state=false;
		for(int i=0;!state;++i){
			if(i>queue.length-2)queue=copy(queue);
			if(queue[i]==null){
				queue[i]=newEntry;
				state=true;
			}
		}
	}
	private T[] copy(T[] in){
		T[] tmp = (T[]) new Object[(in.length*2)];
		for(int i=0;i<in.length;++i){
			tmp[i]=in[i];
		}
		
		return tmp;
		
	}
	@Override
	public T dequeue() {
		T ret=queue[0];
		if(queue[1]==null){
			queue[0]=null;
			return ret;
		}
		for(int i=1;queue[i]!=null;++i){
			queue[i-1]=queue[i];
			queue[i]=null;
		}
		return ret;
	}

	@Override
	public T getFront() {
		return queue[0];
	}

	@Override
	public boolean isEmpty() {
		if(queue[0]==null)return true;
		else return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
