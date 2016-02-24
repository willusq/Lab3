
public class test {

	public static void main(String[] args) {

		CircularArrayQueue<String> tD = new CircularArrayQueue<String>(20000001);
		DLLQueue<String> t = new DLLQueue<String>();
		
		
		
		long start= System.currentTimeMillis();
		
		for(int i=0;i<20000000;++i)tD.enqueue(new Integer(i));
		while(!tD.isEmpty()){
			tD.getFront();
			tD.dequeue();
			//System.out.println(tD.isEmpty());
		}
		long time= (System.currentTimeMillis()-start);
		System.out.println("It took " + time + " milliseconds for the CircularArray based implementation");
		
		start= System.currentTimeMillis();
		
		for(int i=0;i<20000000;++i)t.enqueue(new Integer(i));
		while(!t.isEmpty()){
			t.getFront();
			t.dequeue();
			//System.out.println(tD.isEmpty());
		}
		time= (System.currentTimeMillis()-start);
		System.out.println("It took " + time + " milliseconds for the DLL based implementation");
		
		
		
	}

}
