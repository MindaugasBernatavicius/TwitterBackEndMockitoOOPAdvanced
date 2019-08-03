package design.patterns.behavioral.iterator.implementation;

import java.util.Iterator;


public class BikeRepository implements Iterable<String> {
	
	private String[] bikes;
	private int index;
	
	public BikeRepository() {
		bikes = new String[10];
		index = 0;
	}
	
	public void addBike(String bike) {
		// resize operation
		if(index == bikes.length) {
			String[] largerBikes = new String[bikes.length + 5];
			System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
			bikes = largerBikes;
			largerBikes = null;
		}
		bikes[index] = bike;
		index++;
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> it = new Iterator<String>() {

			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				return currentIndex < bikes.length && bikes[currentIndex] != null;
			}

			@Override
			public String next() {
				return bikes[currentIndex++];
			}

			@Override
			public void remove() {
				// implement as a homework - resize the array, shring it
				throw new UnsupportedOperationException();
			}

			// Homework suggestion: implement method go back / traverse backwards
		};
		
		return it;
	}
}