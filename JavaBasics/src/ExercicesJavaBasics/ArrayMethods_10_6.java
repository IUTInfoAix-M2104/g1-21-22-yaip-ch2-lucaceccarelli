package ExercicesJavaBasics;

public class ArrayMethods_10_6 {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		int key = 3;
		
		//Test 1
		if(contains(array,key)) {
			System.out.printf("The value %d is in the array%n",key);
		}else {
			System.out.printf("The value %d is not in the array%n",key);
		}
		
		//Test 2
		key = 5;
		
		if(contains(array,key)) {
			System.out.printf("The value %d is in the array%n",key);
		}else {
			System.out.printf("The value %d is not in the array%n",key);
		}

	}
	
	public static boolean contains(int[] array, int key) {

		for(int value : array) {
			if(value == key) {
				return true;
			}
		}
		return false;
	}

}
