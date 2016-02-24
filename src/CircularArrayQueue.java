public class CircularArrayQueue<T> implements QueueInterface{
     
    private static final int capacity = 5;
    private Object[] Q;
    private final int N; // capacity
    private int f = 0;
    private int r = 0;
 
     
    public CircularArrayQueue(){
        this(capacity);
    }
     
    public CircularArrayQueue(int capacity){
        N = capacity;
        Q = new Object[N];
    }
 
    public int size() {
        if(r > f)
            return r - f;
        return N - f + r;
    }
 
    public boolean isEmpty() {
        return (r == f) ? true : false;
    }
 
    public boolean isFull() {
        int diff = r - f; 
        if(diff == -1 || diff == (N -1))
            return true;
        return false;
    }
 
    public void enqueue(Object obj) throws EmptyQueueException {
        if(isFull()){
            throw new EmptyQueueException("Queue is Full.");
        }else{
            Q[r] = obj;
            r = (r + 1) % N;
        }
    }
 
    public T dequeue() throws EmptyQueueException {
        T item; 
        if(isEmpty()){
            throw new EmptyQueueException();
        }else{
            item = Q[f];
            Q[f] = null;
            f = (f + 1) % N;
        }
       return item;
    }

	@Override
	public Object getFront() {
		Object item; 
		if(isEmpty()){
            throw new EmptyQueueException();
        }else{
            item = Q[f];
        }
       return item;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
 
}