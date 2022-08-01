package telran.numbers;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class Range implements Iterable<Integer> {
	private int min;
	private int max;
	private Predicate<Integer> predicate;
	
	public Predicate<Integer> getPredicate() {
		return predicate;
	}
	public void setPredicate(Predicate<Integer> predicate) {
		this.predicate = predicate;
	}
	public Range(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
    private class RangeIterator implements Iterator<Integer> {
    	Predicate<Integer> iteratorPredicate = getIteratorPredicate();
    	Integer current = getFirst();
    	
    	@Override
    	public boolean hasNext() {
    		//TODO
    		//update method for iterating only numbers matching the predicate
    		return current != null;
    	}

    	private Integer getFirst() {
			
			return iteratorPredicate.test(min) ? min : getNext(min);
		}

		private Predicate<Integer> getIteratorPredicate() {
			return predicate == null ? new AllNumbersPredicate() : predicate;
		}

		@Override
    	public Integer next() {
    		if(!hasNext()) {
    			throw new NoSuchElementException();
    		}
    		
    		Integer res = current;
			current = getNext(current);
			return res;
    	}

		private Integer getNext(Integer from) {
			while (++from <= max && !iteratorPredicate.test(from)) {}
			return from > max ? null : from;
		}
    }
	@Override
	public Iterator<Integer> iterator() {
		
		return new RangeIterator();
	}
	public int length() {
		return max - min + 1;
	}
	


}
