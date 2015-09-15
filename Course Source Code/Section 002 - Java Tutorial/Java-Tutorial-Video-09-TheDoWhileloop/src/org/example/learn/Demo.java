package org.example.learn;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] elements = { 2,4,5,7,8 };
		int indexPos = 0;
		int sumTotal = 0;
		
		if(elements.length >0) {
			do
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
			} while(indexPos < elements.length);
		}
		
		System.out.println("Sum total was: " + sumTotal);
		
	}

}
