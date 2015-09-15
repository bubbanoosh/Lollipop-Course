package org.example.learn;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] elements = { 5, 7, 12, 100, -1, 8, 3 };
		int indexPos = 0;
		int sumTotal = 0;
		
		while(indexPos < elements.length)
		{
			System.out.println("Processing: " + indexPos + " Value " + elements[indexPos]);
			
			if(elements[indexPos] > 99) {
				System.out.println("Continue!");
				indexPos += 1;
				continue;
			}
			
			if(elements[indexPos] < 0) {
				System.out.println("Break!");
				break;
			}
			
			sumTotal = sumTotal + elements[indexPos];
			indexPos += 1;
		}
		
		System.out.println("Sum total was: " + sumTotal);
		
	}

}
