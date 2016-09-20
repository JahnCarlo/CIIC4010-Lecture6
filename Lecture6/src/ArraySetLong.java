
public class ArraySetLong {
	private long[] theElements;
	private int numElements;

	/*
	 * ArraySetLong(int n)
	 * Create and initially empty set with initial capacity for n objects
	 */
	public ArraySetLong(int n) {
		numElements = 0;
		theElements = new long[n];
	}

	/*
	 * ArraySetLong(long[] numbers, int n)
	 * Add the n objects array numbers to target set
	 */
	public ArraySetLong(long[] numbers, int n) {
		numElements = n;
		theElements = new long[n*2];
		for (int i=0; i<n; i++) {
			theElements[i] = numbers[i];
		}
	}
	
	/*
	 * isEmpty()
	 * Returns true if the target set has no elements
	 */
	public boolean isEmpty() {
		return numElements == 0; // Dummy return
	}
	
	/*
	 * cardinality()
	 * Return a number representing the cardinality of the target set
	 */
	public int cardinality() {
		return numElements; // dummy return
	}
	
	/*
	 * max()
	 * Returns a long representing the maximum element in the set
	 */
	public long max() {
		if (!this.isEmpty()){
			long maxNum = theElements[0];
			for (int i = 1; i < numElements; i++){
				if (theElements[i] > maxNum){
					maxNum = theElements[i];
				}
			}
			return maxNum;
		}
		else{
			throw new RuntimeException("Attempted to find max of empty array");
		}
	}

	/*
	 * min()
	 * Returns a long representing the minimum element in the set
	 */
	public long min() {
		if (!this.isEmpty()){
			long minNum = theElements[0];
			for (int i = 1; i < numElements; i++){
				if (theElements[i] < minNum){
					minNum = theElements[i];
				}
			}
			return minNum;
		}
		else{
			throw new RuntimeException("Attempted to find min of empty array");
		}
	}
	/*
	 * sum()
	 * Returns a long representing the sum of all elements of the set
	 */
	public long sum() {
			long total = 0;
			for (int i = 0; i < numElements; i++){
				total += theElements[i];
			}
			return total;
	}
	
	/*
	 * mult()
	 * Returns a long representing the product of all the elements in the set
	 */
	public long product() {
		long total = 1;
		for (int i = 0; i < numElements; i++){
			total *= theElements[i];
		}
		return total;
	}
	
	public boolean isMember(long key){
		boolean found = false;
		int i = 0;
		while(!found && i<numElements) {
			if (theElements)
		}
	}
	
}
