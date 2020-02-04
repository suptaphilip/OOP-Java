public class ArrayExample {

	public static void main(String[] args) {
		int[] integers = {1, 2, 3, 4, 5};
		String[] strings = {"one", "two", "three", "four", "five"};
		
		// using for loop to access elements
		System.out.println("Printing integer array using for loop :");
		for (int i = 0; i<integers.length; i++) {
			System.out.println(integers[i]);
		}
		
		System.out.println("Printing string array using for loop :");
		for (int i = 0; i<strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

}
