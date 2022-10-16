
public class SortedArray {
	
	private SortedArray() {
		throw new AssertionError("can't be instantiated");
	}
	
	public static void arrays(int [] p, int [] q) {
		
		if (p == null || q == null) {
			throw new IllegalArgumentException("p and q can't be null");
			
		}
		int pLast = p.length - q.length;
		
		int qLast = q.length;
		
		if (pLast < 0) {
			
			throw new IllegalArgumentException(" p can't not hold q ");
			
		}
		
		int pIdx =  pLast - 1 ;
		
		int qIdx =  qLast - 1;
		
		int mIdx = pLast + qLast - 1;	
		
		while(qIdx >= 0) {
			
			if (pIdx >= 0 && p[pIdx] > p[qIdx]) {
				
				p[mIdx] = p[pIdx];
				
				pIdx--;
				
			}else {
				
				p[mIdx] = q[qIdx];
				
				qIdx--;
			}
			
			mIdx--;
		}
	}
	

}
